package gdts.core.slave;

import gdts.common.Executor;
import gdts.common.comm.CommParty;
import gdts.common.comm.Envelope;
import gdts.common.comm.messages.IMessage;
import gdts.common.comm.messages.MasterReleaseSlaveMessage;
import gdts.common.comm.messages.MasterReqSlaveMessage;
import gdts.common.comm.messages.MasterStartSlaveTaskMessage;
import gdts.common.comm.messages.Message;
import gdts.common.comm.messages.SlaveCheckInMessage;
import gdts.common.comm.messages.SlaveTaskResultsMessage;
import gdts.common.comm.messages.data.FileTransferMessage;
import gdts.common.comm.messages.listing.ListingRequestMessage;
import gdts.common.data.type.Variable;
import gdts.common.exception.GDTSConnectException;
import gdts.common.exception.ModuleNotInRepoException;
import gdts.common.exception.UnknownTaskException;
import gdts.common.logger.SimpleLogger;
import gdts.common.module.ModuleDescr;
import gdts.common.module.TaskDescriptor;
import gdts.core.commservice.ICommService;
import gdts.core.configservice.IConfigService;
import gdts.core.parser.TaskParseHelper;
import gdts.reposervice.IRepoService;

import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;

/**
 * Klasa modułu Wykonawcy.
 * 
 * @author Maciej Milczarek
 */
public class Slave implements CommParty {

	private final static long CHECK_INTERVAL = 5000;

	private CheckingJob checkingJob;
	private ICommService commService;
	private IRepoService repoService;
	private IConfigService configService;

	private boolean isFree = true;
	private boolean isBlocked = false;

	public void startup() {
		commService.configure(configService.getLocalPort());
		commService.registerParty(this);
		// System.out.println("Slave starting on " + commService.getNetId()
		// + "...");
		checkingJob = new CheckingJob("checkingJob");
		checkingJob.schedule();
		SimpleLogger.log("Slave started on " + commService.getNetId());
	}

	public void shutdown() {
		// System.out.println("Slave shutting down on " + commService.getNetId()
		// + "...");
		checkingJob.setShouldRun(true);
		try {
			checkingJob.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SimpleLogger.log("Slave shut down on " + commService.getNetId());
	}

	@Override
	public void receiveMessage(Envelope envelope) {

//		SimpleLogger.log("Slave received message "
//				+ envelope.getMessage().getClass().getSimpleName());
		IMessage msg = envelope.getMessage();

		if (msg instanceof MasterReqSlaveMessage) {
			try {
				if (this.isFree == true && this.isBlocked == false) {
					this.isBlocked = true;
					commService.sendTo(this, configService.getMasterNetId(),
							((MasterReqSlaveMessage) msg).messageOK());
				} else if (this.isBlocked == true && this.isFree == true) {
					commService.sendTo(this, configService.getMasterNetId(),
							((MasterReqSlaveMessage) msg).messageBlocked());
				} else if (this.isBlocked == false && this.isFree == false) {
					commService.sendTo(this, configService.getMasterNetId(),
							((MasterReqSlaveMessage) msg).messageBusy());
				}
			} catch (GDTSConnectException e) {
				SimpleLogger.log("Unable to connect to master at "
						+ configService.getMasterNetId());
			}
		} else if (msg instanceof MasterReleaseSlaveMessage) {
			isBlocked = false;
		} else if (msg instanceof MasterStartSlaveTaskMessage) {
			// System.out.println("Slave: startSlaveTask received");
			MasterStartSlaveTaskMessage slaveTaskMsg = (MasterStartSlaveTaskMessage) msg;
			executeSlavetask(slaveTaskMsg.getTaskDescriptor(),
					slaveTaskMsg.getSlaveTaskId(), slaveTaskMsg.getParams(),
					slaveTaskMsg.getMessageId());
		} else if (msg instanceof ListingRequestMessage
				|| msg instanceof FileTransferMessage) {

			((CommParty) repoService).receiveMessage(envelope);
		}
	}

	/**
	 * Metoda zlecająca wykonanie Podzadania.
	 * 
	 * @param taskDescriptor Deskryptor głównego Zadania.
	 * @param slaveTaskId Identyfikator Podzadania.
	 * @param params Lista nazwanych parametrów Podzadania w postaci mapy.
	 * @param messageId Identyfikator komunikatu zlecającego wykonanie.
	 */
	private void executeSlavetask(TaskDescriptor taskDescriptor,
			String slaveTaskId, Map<String, Variable> params, long messageId) {

		isFree = false;
		isBlocked = false;

		Thread thread = new Thread(new SlaveTaskRunnable(taskDescriptor,
				slaveTaskId, params, messageId));
		thread.start();

	}

	class SlaveTaskRunnable implements Runnable, CommParty, Executor {

		private Thread thread;

		private TaskDescriptor taskDescriptor;
		private String slaveTaskId;
		private Map<String, Variable> params;
		private long messageId;

		public SlaveTaskRunnable(TaskDescriptor taskDescriptor,
				String slaveTaskId, Map<String, Variable> params, long messageId) {
			super();
			this.taskDescriptor = taskDescriptor;
			this.slaveTaskId = slaveTaskId;
			this.params = params;
			this.messageId = messageId;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see java.lang.Runnable#run()
		 */
		@Override
		public void run() {
			thread = Thread.currentThread();
			try {
				taskDescriptor = repoService.getTask(taskDescriptor.getId(),
						taskDescriptor.getVersion());
			} catch (UnknownTaskException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			TaskParseHelper helper = new TaskParseHelper(
					taskDescriptor.getTaskFile(), slaveTaskId, this);
			helper.init();

			// rewriting input params with provided from master
			for (String varKey : helper.getInputVars().keySet()) {
				helper.getInputVars().get(varKey).setValue(params.get(varKey));
			}

			SimpleLogger.log("Starting execution of slavetask " + slaveTaskId + " from task " + taskDescriptor);
			long startTime = System.currentTimeMillis();
			
			helper.executeFlow();

			long endTime = System.currentTimeMillis();
			long executionTime = endTime - startTime;
			
			SimpleLogger.log("Execution of slavetask completed! Execution time: " + executionTime + " miliseconds.");
			
			try {
				commService.sendTo(
						this,
						configService.getMasterNetId(),
						new SlaveTaskResultsMessage(messageId, helper
								.getOutputVars()));
			} catch (GDTSConnectException e) {
				SimpleLogger.log("Unable to connect to "
						+ configService.getMasterNetId());
			}
			isFree = true;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see
		 * gdts.common.comm.CommParty#receiveMessage(gdts.common.comm.Envelope)
		 */
		@Override
		public void receiveMessage(Envelope envelope) {

		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see gdts.common.comm.CommParty#getPartyId()
		 */
		@Override
		public Object getPartyId() {
			return thread.hashCode();
		}

		@Override
		public void commandCall(String id, ModuleDescr module,
				Map<String, Variable> params) {

			try {
				repoService.getModuleService(module).execute(id, params);

			} catch (ModuleNotInRepoException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	private class CheckingJob extends Job {

		boolean shouldRun = true;
		boolean checkedIn = false;

		/**
		 * @param name
		 */
		public CheckingJob(String name) {
			super(name);
		}

		@Override
		protected IStatus run(IProgressMonitor monitor) {

			while (shouldRun) {
				Message msg = new SlaveCheckInMessage("slave is available on "
						+ commService.getNetId());
				try {
					commService.sendTo(Slave.this,
							configService.getMasterNetId(), msg);
					
					if(checkedIn == false) {
						SimpleLogger.log("Slave succesfully checked in to master at " + configService.getMasterNetId());
					}
					
					checkedIn = true;

					Thread.sleep(CHECK_INTERVAL);
				} catch (InterruptedException e) {
					e.printStackTrace();
				} catch (GDTSConnectException e) {
					SimpleLogger.log("Unable to connect to master at " + configService.getMasterNetId());
					checkedIn = false;
				}
			}

			return Status.OK_STATUS;
		}

		public void setShouldRun(boolean shouldRun) {
			this.shouldRun = shouldRun;
		}
	}

	public synchronized void setRepoService(IRepoService repoService) {
		if (this.repoService == null) {
			this.repoService = repoService;
		}
	}

	public synchronized void unsetRepoService(IRepoService repoService) {
		if (this.repoService == repoService) {
			this.repoService = null;
		}
	}

	public synchronized void setConfigService(IConfigService configService) {
		if (this.configService == null) {
			this.configService = configService;
		}
	}

	public synchronized void unsetConfigService(IConfigService configService) {
		if (this.configService == configService) {
			this.configService = null;
		}
	}

	public synchronized void setCommService(ICommService commService) {
		if (this.commService == null) {
			this.commService = commService;
		}
	}

	public synchronized void unsetCommService(ICommService commService) {
		if (this.commService == commService) {
			this.commService = null;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see gdts.common.comm.CommParty#getPartyId()
	 */
	@Override
	public Object getPartyId() {
		return "slave";
	}
}
