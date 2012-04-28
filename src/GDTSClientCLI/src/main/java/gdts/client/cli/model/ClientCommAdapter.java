package gdts.client.cli.model;

import gdts.common.GDTSNetId;
import gdts.common.comm.CommParty;
import gdts.common.comm.Envelope;
import gdts.common.comm.messages.IMessage;
import gdts.common.comm.messages.Message;
import gdts.common.comm.messages.PingMessage;
import gdts.common.comm.messages.StartTaskInstanceMessage;
import gdts.common.comm.messages.data.IDataMessage;
import gdts.common.comm.messages.data.InstanceFileTransferMessage;
import gdts.common.comm.messages.data.TaskFileTransferMessage;
import gdts.common.comm.messages.listing.InstanceListingRequestMessage;
import gdts.common.comm.messages.listing.TaskListingRequestMessage;
import gdts.common.comm.messages.status.IStatusMessage;
import gdts.common.comm.messages.status.StatusType;
import gdts.common.exception.GDTSConnectException;
import gdts.common.exception.GDTSException;
import gdts.common.exception.InvalidIPAddressException;
import gdts.common.module.InstanceDescriptor;
import gdts.common.module.TaskDescriptor;
import gdts.core.commservice.ICommService;

import java.net.ConnectException;
import java.util.List;

/**
 * Adapter komunikacyjny dla aplikacji klienckiej.
 * 
 * @author Maciej Milczarek
 *
 */
public class ClientCommAdapter {

	ICommService commService;

	public ClientCommAdapter(ICommService commService, int clientPort) {
		this.commService = commService;
		this.commService.configure(clientPort);
	}

	public ICommService getCommService() {
		return commService;
	}

	public synchronized void pingMaster(String host, int port)
			throws InvalidIPAddressException, ConnectException {

		pingMaster(GDTSNetId.valueOf(host, port));
	}

	public synchronized void pingMaster(GDTSNetId masterNetId)
			throws ConnectException {

		CommTask<Void> commTask = new CommTask<>(masterNetId,
				new PingMessage(), "ping_task", 5000);
		commTask.start();
		commTask.join();

		if (commTask.isSuccess() == false) {
			throw new ConnectException();
		}
	}

	public synchronized List<TaskDescriptor> listTasks(GDTSNetId masterNetId)
			throws ConnectException {

		CommTask<List<TaskDescriptor>> listTask = new CommTask<>(masterNetId,
				new TaskListingRequestMessage(), "task_listing_task", 10000);

		listTask.start();
		listTask.join();

		if (listTask.isSuccess() == false) {
			throw new ConnectException();
		}

		return listTask.getDataReceived();
	}

	public synchronized List<InstanceDescriptor> listInstances(
			GDTSNetId masterNetId) throws ConnectException {

		CommTask<List<InstanceDescriptor>> listTask = new CommTask<>(
				masterNetId, new InstanceListingRequestMessage(),
				"instance_listing_task", 10000);

		listTask.start();
		listTask.join();

		if (listTask.isSuccess() == false) {
			throw new ConnectException();
		}

		return listTask.getDataReceived();
	}

	public synchronized void startTaskInstance(GDTSNetId masterNetId,
			String instanceId) throws GDTSException {

		CommTask<Exception> instanceTask = new CommTask<>(masterNetId,
				new StartTaskInstanceMessage(instanceId),
				"start_instance_task", 5000);

		instanceTask.start();
		instanceTask.join();

		if (instanceTask.isSuccess() == false) {
			if (instanceTask.getException() != null) {
				throw instanceTask.getException();
			}
		}
	}

	public synchronized void uploadTaskFile(GDTSNetId masterNetId,
			String fileName, byte[] fileContent) throws GDTSException {

		CommTask<Exception> taskUploadTask = new CommTask<>(masterNetId,
				new TaskFileTransferMessage(fileName, fileContent),
				"taskUploadTask", 10000);
		taskUploadTask.start();
		taskUploadTask.join();

		if (taskUploadTask.isSuccess() == false) {
			if (taskUploadTask.getException() != null) {
				throw taskUploadTask.getException();
			}
		}
	}
	
	public synchronized void uploadInstanceFile(GDTSNetId masterNetId,
			String fileName, byte[] fileContent) throws GDTSException {

		CommTask<Exception> instanceUploadTask = new CommTask<>(masterNetId,
				new InstanceFileTransferMessage(fileName, fileContent),
				"instanceUploadTask", 10000);
		instanceUploadTask.start();
		instanceUploadTask.join();

		if (instanceUploadTask.isSuccess() == false) {
			if (instanceUploadTask.getException() == null) {
				throw new GDTSConnectException(masterNetId);
			} else {
				throw instanceUploadTask.getException();
			}
		}
	}

	class CommTask<T> implements Runnable, CommParty {

		private GDTSNetId masterNetId;
		private Message msg;
		private String partyId;
		private Thread thread;
		protected boolean success = false;
		private int timeToResponse;
		private T dataReceived;
		private GDTSException exception;

		public CommTask(GDTSNetId masterNetId, Message msg, String partyId,
				int timeToResponse) {
			super();
			this.masterNetId = masterNetId;
			this.msg = msg;
			this.partyId = partyId;
			this.timeToResponse = timeToResponse;
			this.thread = new Thread(this);
			this.thread.setDaemon(true);
		}

		public void start() {
			thread.start();
		}

		private void success() {
			this.success = true;
			this.thread.interrupt();
		}

		private void failure() {
			this.success = false;
			this.thread.interrupt();
		}

		@Override
		public void run() {
			commService.registerParty(this);
			
			try {
				commService.sendTo(this, masterNetId, msg);
				Thread.sleep(timeToResponse);
			} catch (InterruptedException e) {
			} catch (GDTSConnectException e) {
				this.exception = e;
				this.failure();
			} finally {
				commService.unregisterParty(this);
			}
		}

		@Override
		public Object getPartyId() {
			return this.partyId;
		}

		public Thread getThread() {
			return thread;
		}

		public void join() {
			try {
				this.thread.join();
			} catch (InterruptedException e) {
			}
		}

		public T getDataReceived() {
			return this.dataReceived;
		}

		public GDTSException getException() {
			return this.exception;
		}

		@SuppressWarnings("unchecked")
		@Override
		public void receiveMessage(Envelope envelope) {
			IMessage msg = envelope.getMessage();
			if (msg instanceof IDataMessage) {
				IDataMessage<T> dataMessage = (IDataMessage<T>) msg;
				dataReceived = dataMessage.getData();
			}
			if (msg instanceof IStatusMessage) {
				IStatusMessage statusMessage = (IStatusMessage) msg;
				this.exception = statusMessage.getException();
				if (statusMessage.getStatus() == StatusType.OK) {
					this.success();
					return;
				} else {
					this.failure();
					return;
				}
			}
			this.success();
		}

		public boolean isSuccess() {
			return success;
		}
	}
}
