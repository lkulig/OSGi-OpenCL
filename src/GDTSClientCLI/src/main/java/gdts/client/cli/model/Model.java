package gdts.client.cli.model;

import gdts.common.GDTSNetId;
import gdts.common.comm.CommParty;
import gdts.common.comm.Envelope;
import gdts.common.comm.messages.data.TaskResultsMessage;
import gdts.common.data.type.Variable;
import gdts.common.exception.GDTSConnectException;
import gdts.common.exception.GDTSException;
import gdts.common.exception.InstanceAlreadyInRepoException;
import gdts.common.exception.InvalidIPAddressException;
import gdts.common.exception.TaskAlreadyInRepoException;
import gdts.common.module.InstanceDescriptor;
import gdts.common.module.TaskDescriptor;
import gdts.core.commservice.ICommService;
import gdts.core.commservice.impl.CommService;

import java.net.ConnectException;
import java.net.Inet4Address;
import java.net.UnknownHostException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Model implements IModel {

	private static final int DEFAULT_CLIENT_PORT = 333;
	private static final int DEFAULT_MASTER_PORT = 856;

	private GDTSNetId masterNetId;
	private Future<Map<String, Variable>> execFuture;
	private ExecutorService executor;

	public Model() {
		try {
			this.masterNetId = GDTSNetId.valueOf(Inet4Address.getLocalHost()
					.getHostAddress(), DEFAULT_MASTER_PORT);
		} catch (UnknownHostException | InvalidIPAddressException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void setMasterNetId(GDTSNetId masterNetId) {
		this.masterNetId = masterNetId;
	}

	@Override
	public GDTSNetId getMasterNetId() {
		return masterNetId;
	}

	@Override
	public synchronized void pingMaster() throws ConnectException {

	}

	@Override
	public synchronized List<TaskDescriptor> listTasks()
			throws ConnectException {
		ClientCommAdapter commAdapter = new ClientCommAdapter(
				new CommService(), DEFAULT_CLIENT_PORT);
		return commAdapter.listTasks(masterNetId);
	}

	@Override
	public synchronized List<InstanceDescriptor> listInstances()
			throws ConnectException {
		ClientCommAdapter commAdapter = new ClientCommAdapter(
				new CommService(), DEFAULT_CLIENT_PORT);
		return commAdapter.listInstances(masterNetId);
	}

	@Override
	public synchronized void executeInstance(String instanceId)
			throws GDTSException {
		ClientCommAdapter commAdapter = new ClientCommAdapter(
				new CommService(), DEFAULT_CLIENT_PORT);

		ExecutionTask execTask = new ExecutionTask(commAdapter.getCommService());
		execFuture = execTask.start();

		try {
			commAdapter.startTaskInstance(masterNetId, instanceId);
		} catch (GDTSException exc) {
			executor.shutdownNow();
			throw exc;
		}
		System.out.println("Execution started!");
	}

	@Override
	public synchronized Map<String, Variable> getInstanceResults() {
		try {
			Map<String, Variable> results = execFuture.get();
			executor.shutdown();
			return results;
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public void uploadTaskFile(String fileName, byte[] fileContent)
			throws GDTSConnectException, TaskAlreadyInRepoException {

		ClientCommAdapter commAdapter = new ClientCommAdapter(
				new CommService(), DEFAULT_CLIENT_PORT);

		try {
			commAdapter.uploadTaskFile(masterNetId, fileName, fileContent);
		} catch (Exception e) {
			if (e instanceof GDTSException) {
				if(e instanceof TaskAlreadyInRepoException) {
					throw (TaskAlreadyInRepoException)e;
				} else if(e instanceof GDTSConnectException ) {
					throw (GDTSConnectException) e;
				}
			} else {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void uploadInstanceFile(String fileName, byte[] fileContent)
			throws GDTSConnectException, InstanceAlreadyInRepoException {

		ClientCommAdapter commAdapter = new ClientCommAdapter(
				new CommService(), DEFAULT_CLIENT_PORT);

		try {
			commAdapter.uploadInstanceFile(masterNetId, fileName, fileContent);
		} catch (Exception e) {
			if (e instanceof GDTSException) {
				if(e instanceof InstanceAlreadyInRepoException) {
					throw (InstanceAlreadyInRepoException)e;
				} else if(e instanceof GDTSConnectException ) {
					throw (GDTSConnectException) e;
				}
			} else {
				e.printStackTrace();
			}
		}
	}

	class ExecutionTask implements Callable<Map<String, Variable>>, CommParty {

		Map<String, Variable> results;
		Thread thread;
		ICommService commService;

		public ExecutionTask(ICommService commService) {
			super();
			this.commService = commService;
		}

		public Future<Map<String, Variable>> start() {
			executor = Executors.newSingleThreadExecutor();
			return executor.submit(this);
		}

		@Override
		public Map<String, Variable> call() throws Exception {
			commService.registerParty(this);
			thread = Thread.currentThread();
			while (!thread.isInterrupted()) {
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					thread.interrupt();
				}
			}
			commService.unregisterParty(this);
			return results;
		}

		@Override
		public void receiveMessage(Envelope envelope) {
			synchronized (this) {
				TaskResultsMessage msg = (TaskResultsMessage) envelope
						.getMessage();
				this.results = msg.getData();
				thread.interrupt();
			}
		}

		@Override
		public Object getPartyId() {
			return "client_execution_task";
		}

	}
}
