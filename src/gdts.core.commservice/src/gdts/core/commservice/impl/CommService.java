package gdts.core.commservice.impl;

import gdts.common.GDTSNetId;
import gdts.common.comm.CommParty;
import gdts.common.comm.Envelope;
import gdts.common.comm.messages.IMessage;
import gdts.common.comm.messages.MasterReleaseSlaveMessage;
import gdts.common.comm.messages.MasterReqSlaveMessage;
import gdts.common.comm.messages.MasterStartSlaveTaskMessage;
import gdts.common.comm.messages.PingMessage;
import gdts.common.comm.messages.SlaveCheckInMessage;
import gdts.common.comm.messages.StartTaskInstanceMessage;
import gdts.common.comm.messages.data.FileTransferMessage;
import gdts.common.comm.messages.data.TaskResultsMessage;
import gdts.common.comm.messages.listing.ListingRequestMessage;
import gdts.common.exception.GDTSConnectException;
import gdts.common.exception.InvalidIPAddressException;
import gdts.common.logger.SimpleLogger;
import gdts.core.commservice.ICommService;
import gdts.core.configservice.IConfigService;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;

import org.osgi.service.component.ComponentContext;

public class CommService implements ICommService {

	private Map<Object, CommParty> commParties = new HashMap<Object, CommParty>();
	private Map<Long, CommParty> sent = new HashMap<Long, CommParty>();
	private Thread listenThread;
	private ListenRunnable listenRunnable;
	private IConfigService configService;

	InetAddress inetAddress;
	GDTSNetId netId;
	int port;

	public void startup(ComponentContext context)
			throws InvalidIPAddressException {
	}

	public void shutdown() {
		listenRunnable.shutdown();
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

	@Override
	public void sendTo(CommParty sender, GDTSNetId receiver, IMessage message)
			throws GDTSConnectException {

		try {
			Socket socket = new Socket();
			socket.connect(new InetSocketAddress(receiver.getIPAsInetAddress(),
					receiver.getPort()), 5000);
			ObjectOutputStream output = new ObjectOutputStream(
					socket.getOutputStream());
			Envelope envelope = new Envelope(message);
			envelope.setSender(this.netId);
			envelope.setReceiver(receiver);
			output.writeObject(envelope);
			if (message.responseRequired() || message.responsePossible()) {
				sent.put(message.getMessageId(), sender);
			}
			socket.close();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SocketTimeoutException e) {
			throw new GDTSConnectException(receiver);
		} catch (IOException e) {
			throw new GDTSConnectException(receiver);
		}
	}

	// @Override
	// public void clearHistory(CommParty party) {
	// // TODO Auto-generated method stub
	//
	// }

	@Override
	public void registerParty(CommParty party) {
		this.commParties.put(party.getPartyId(), party);
	}

	@Override
	public void unregisterParty(CommParty party) {
		this.commParties.remove(party);
		this.sent.remove(party.getPartyId());
	}

	private void redirectToParties(Envelope envelope) {
		IMessage msg = envelope.getMessage();
		if (this.sent.containsKey(msg.getInReplyTo())) {
			this.sent.get(msg.getInReplyTo()).receiveMessage(envelope);
			this.sent.remove(msg.getInReplyTo());
		} else {
			if (msg instanceof SlaveCheckInMessage
					|| msg instanceof StartTaskInstanceMessage
					|| msg instanceof ListingRequestMessage) {
				commParties.get("master").receiveMessage(envelope);
			} else if (msg instanceof MasterReqSlaveMessage
					|| msg instanceof MasterStartSlaveTaskMessage
					|| msg instanceof MasterReleaseSlaveMessage) {
				commParties.get("slave").receiveMessage(envelope);
			} else if (msg instanceof TaskResultsMessage) {
				commParties.get("client_execution_task").receiveMessage(
						envelope);
			} else if (msg instanceof FileTransferMessage) {
				commParties.get(configService.isMaster() ? "master" : "slave")
						.receiveMessage(envelope);
			}
		}
	}

	private class ListenRunnable implements Runnable {

		// private CommParty party;
		private boolean stop = false;
		ServerSocket serverSocket;

		//
		// public ListenSocketThread(CommParty party) {
		// this.party = party;
		// }

		@Override
		public void run() {
			try {
				serverSocket = new ServerSocket(CommService.this.getNetId()
						.getPort());
				while (true) {
					Socket socket = serverSocket.accept();
					if (stop == false) {
						ObjectInputStream input = new ObjectInputStream(
								socket.getInputStream());

						Envelope envelope = (Envelope) input.readObject();
						if (envelope.getMessage() instanceof PingMessage) {
							try {
								CommService.this.sendTo(null, envelope
										.getSender(), ((PingMessage) envelope
										.getMessage()).statusOK());
							} catch (GDTSConnectException e) {
								SimpleLogger.log(e.getMessage());
							}
						}
						redirectToParties(envelope);
					} else {
						break;
					}
				}

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		public void shutdown() {

			stop = true;

			try {
				new Socket(serverSocket.getInetAddress(),
						serverSocket.getLocalPort()).close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	// @Override
	// public InetAddress getInetAddress() {
	// return inetAddress;
	// }

	/*
	 * (non-Javadoc)
	 * 
	 * @see gdts.core.commservice.ICommService#getNetId()
	 */
	@Override
	public GDTSNetId getNetId() {
		return this.netId;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see gdts.core.commservice.ICommService#configure(int)
	 */
	@Override
	public void configure(int port) {
		try {
			inetAddress = Inet4Address.getLocalHost();
			netId = GDTSNetId.valueOf(inetAddress.getHostAddress(), port);

			// rozpocz�cie w�tku nas�uchuj�cego
			listenRunnable = new ListenRunnable();
			listenThread = new Thread(listenRunnable);
			listenThread.setDaemon(true);
			listenThread.start();
		} catch (InvalidIPAddressException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
