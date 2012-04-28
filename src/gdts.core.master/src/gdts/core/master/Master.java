package gdts.core.master;

import gdts.common.GDTSNetId;
import gdts.common.comm.CommParty;
import gdts.common.comm.Envelope;
import gdts.common.comm.messages.IMessage;
import gdts.common.comm.messages.MasterReleaseSlaveMessage;
import gdts.common.comm.messages.MasterReqSlaveMessage;
import gdts.common.comm.messages.SlaveCheckInMessage;
import gdts.common.comm.messages.StartTaskInstanceMessage;
import gdts.common.comm.messages.StatusMessage;
import gdts.common.comm.messages.StatusMessage.Type;
import gdts.common.comm.messages.data.FileTransferMessage;
import gdts.common.comm.messages.data.TaskResultsMessage;
import gdts.common.comm.messages.listing.ListingRequestMessage;
import gdts.common.comm.messages.status.SimpleStatusMessage;
import gdts.common.comm.messages.status.StatusType;
import gdts.common.data.type.VSlave;
import gdts.common.data.type.Variable;
import gdts.common.exception.GDTSConnectException;
import gdts.common.exception.InstanceNotFoundException;
import gdts.common.exception.TaskNotFoundException;
import gdts.common.logger.SimpleLogger;
import gdts.common.module.IModuleService;
import gdts.common.module.TaskDescriptor;
import gdts.core.commservice.ICommService;
import gdts.core.configservice.IConfigService;
import gdts.core.parser.InstanceParseHelper;
import gdts.reposervice.IRepoService;

import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Głowna klasa Nadzorcy; stanowi jednocześnie stronę komunikacji.
 * 
 * @author Maciej Milczarek
 */
public class Master implements CommParty {

	private IConfigService configService;
	protected ICommService commService;
	protected IRepoService repoService;

	protected MasterCommands masterCommands;

	private Map<String, GDTSNetId> instancesForClients = new HashMap<String, GDTSNetId>();

	protected IModuleService systemModule = new SystemModule();

	public Master() {
		masterCommands = new MasterCommands(this);
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

	public void startup() {
		commService.configure(configService.getLocalPort());
		commService.registerParty(this);

		SimpleLogger.log("Master started on " + commService.getNetId());
	}

	public void shutdown() {
		SimpleLogger.log("Master shut down on " + commService.getNetId());
	}

	/**
	 * Metoda zlecająca wykonanie Instancji zadania.
	 * 
	 * @param envelope Koperta z komunikatem zawierającym dane wejściowe.
	 * @param instanceId Identyfikator instancji zadania.
	 */
	public void executeInstance(final Envelope envelope, final String instanceId) {

		File instanceFile;
		try {
			instanceFile = repoService.getInstanceFile(instanceId);
			InstanceParseHelper parseHelper = new InstanceParseHelper(
					instanceFile);

			parseHelper.parse();
			final TaskDescriptor taskDescr = parseHelper.getTask();

			//checking if task exists in repository
			if(repoService.taskInRepo(taskDescr) == false) {
				throw new TaskNotFoundException(taskDescr);
			}
			
			final ExecutionTask execTask = new ExecutionTask(this, instanceId, taskDescr);
			
			execTask.setTaskDescr(taskDescr);
			execTask.setTaskInput(parseHelper.getData());

			final ExecutorService execService = Executors
					.newSingleThreadExecutor();

			Thread taskThread = new Thread(new Runnable() {

				@Override
				public void run() {
					try {

						SimpleLogger.log("Starting execution of instance " + instanceId + " for task " + taskDescr);
						long startTime = System.currentTimeMillis();
						
						Future<Map<String, Variable>> outputFuture = execService
								.submit(execTask);
						Map<String, Variable> output = outputFuture.get();
						
						long endTime = System.currentTimeMillis();
						long executionTime = endTime - startTime;
						
						SimpleLogger.log("Execution of task completed! Execution time: " + executionTime + " miliseconds.");

						GDTSNetId client = instancesForClients.get(instanceId);
						instancesForClients.remove(instanceId);
						if (client != null) {
							commService.sendTo(Master.this, client,
									new TaskResultsMessage(output));
						}

					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ExecutionException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (GDTSConnectException e) {
						SimpleLogger.log("Unable to connect to client at "
								+ envelope.getSender());
					}
				}
			});

			synchronized (instancesForClients) {
				instancesForClients.put(instanceId, envelope.getSender());
			}

			taskThread.start();			
			
			try {
				commService.sendTo(Master.this, envelope.getSender(), envelope
						.getMessage().statusOK());
			} catch (GDTSConnectException e) {
				SimpleLogger.log("Unable to connect to client at "
						+ envelope.getSender());
			}
		} catch (InstanceNotFoundException e) {
			try {
				SimpleLogger.log("Error executing task. ", e);
				commService.sendTo(Master.this, envelope.getSender(),
						new SimpleStatusMessage(StatusType.ERROR, envelope
								.getMessage().getMessageId(), e));
			} catch (GDTSConnectException e1) {
				SimpleLogger.log("Unable to connect to client!", e1);
			}
		} catch (TaskNotFoundException e) {
			try {
				SimpleLogger.log("Error: Task not found in master repository: " + e.getMessage());
				commService.sendTo(Master.this, envelope.getSender(),
						new SimpleStatusMessage(StatusType.ERROR, envelope
								.getMessage().getMessageId(), e));
			} catch (GDTSConnectException e1) {
				SimpleLogger.log("Unable to connect to client!", e1);
			}
		}

	}

	@Override
	public void receiveMessage(Envelope envelope) {
		IMessage message = envelope.getMessage();
		if (envelope.getMessage() instanceof SlaveCheckInMessage) {
			SlavesManager.getInstance().slaveCheckIn(envelope.getSender());
		} else if (envelope.getMessage() instanceof StartTaskInstanceMessage) {
			StartTaskInstanceMessage msg = (StartTaskInstanceMessage) envelope
					.getMessage();
			this.executeInstance(envelope, msg.getInstanceId());
		} else if (message instanceof ListingRequestMessage
				|| message instanceof FileTransferMessage) {

			((CommParty) repoService).receiveMessage(envelope);
			if (message instanceof FileTransferMessage) {
				
				propagateToSlaves((FileTransferMessage) message);
			}
		}
	}
	
	private void propagateToSlaves(FileTransferMessage msg) {
		synchronized(SlavesManager.getInstance()) {
			for(GDTSNetId slave : SlavesManager.getInstance().getSlaves()) {
				try {
					commService.sendTo(this, slave, msg);
				} catch (GDTSConnectException e) {
					SimpleLogger.log("Unable to connect", e);
				}
			}
		}
	}

	/**
	 * @return
	 */
	public VSlave requestSlaveForTask() {

		SlaveRequestRunnable requestRunnable = new SlaveRequestRunnable();
		VSlave slave = null;
		Thread acqThread = new Thread(requestRunnable);
		acqThread.start();
		try {
			// System.out.println("Before ACQ Joined " + Util.timeString());
			acqThread.join();
			// System.out.println("After ACQ Joined " + Util.timeString());
			slave = requestRunnable.getSlave();
			ReleasingTask releasingTask = new ReleasingTask(
					requestRunnable.requestsSent);
			releasingTask.start();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return slave;
	}

	private class SlaveRequestRunnable implements Runnable, CommParty {

		long timeout;
		VSlave slave = new VSlave();
		Thread thread;
		Set<GDTSNetId> requestsSent = new HashSet<GDTSNetId>();
		boolean slaveChoosed = false;

		@Override
		public void run() {
			thread = Thread.currentThread();
			commService.registerParty(this);

			long beforeSending = System.currentTimeMillis();
			Set<GDTSNetId> slaves = SlavesManager.getInstance().getSlaves();
			timeout = 2000 * slaves.size();
			for (GDTSNetId slaveNetId : slaves) {
				synchronized (this) {
					// System.out.println("sending request for slave" +
					// slaveNetId);
					try {
						commService.sendTo(SlaveRequestRunnable.this,
								slaveNetId, new MasterReqSlaveMessage());
					} catch (GDTSConnectException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					requestsSent.add(slaveNetId);
				}
				if (slaveChoosed) {
					break;
				}
			}

			long elapsedTime = System.currentTimeMillis() - beforeSending;

			if (!thread.isInterrupted()) {
				try {
					Thread.sleep(timeout - elapsedTime);

				} catch (InterruptedException e) {
				} finally {
					commService.unregisterParty(this);
				}
			}
		}

		public VSlave getSlave() {
			return this.slave;
		}

		@Override
		public void receiveMessage(Envelope envelope) {
			StatusMessage msg = (StatusMessage) envelope.getMessage();

			if (msg.getType() == Type.OK && slaveChoosed == false) {
				synchronized (this) {
					slaveChoosed = true;
					slave.setNetId(envelope.getSender());
					requestsSent.remove(envelope.getSender());
					this.thread.interrupt();
				}
			}
		}

		@Override
		public Object getPartyId() {
			return this.thread.hashCode();
		}
	}

	private class ReleasingTask implements Runnable, CommParty {

		Set<GDTSNetId> slaves;
		Thread thread;

		public ReleasingTask(Set<GDTSNetId> slaves) {
			this.slaves = slaves;
		}

		private void start() {
			ExecutorService exec = Executors.newSingleThreadExecutor();
			exec.execute(this);
		}

		@Override
		public void run() {
			thread = Thread.currentThread();
			commService.registerParty(this);
			for (GDTSNetId netId : slaves) {
				// System.out.println("releasing for slave " + netId);
				try {
					commService.sendTo(this, netId,
							new MasterReleaseSlaveMessage());
				} catch (GDTSConnectException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			commService.unregisterParty(this);
		}

		@Override
		public void receiveMessage(Envelope envelope) {
		}

		@Override
		public Object getPartyId() {
			return this.thread.hashCode();
		}
	}

	@Override
	public Object getPartyId() {
		return "master";
	}
}
