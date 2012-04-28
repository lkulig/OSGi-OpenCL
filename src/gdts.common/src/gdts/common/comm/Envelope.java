package gdts.common.comm;

import gdts.common.GDTSNetId;
import gdts.common.comm.messages.IMessage;

import java.io.Serializable;

/**
 * Klasa opakowująca obiekt komunikatu. Dodatkowo posiada informacje
 * o nadawcy i odbiorcy.
 * 
 * @author Maciej Milczarek
 */
public class Envelope implements Serializable {
	
	private static final long serialVersionUID = 1233549784446388389L;
	
	private GDTSNetId sender;
	private GDTSNetId receiver;
	private IMessage message;
	
	/**
	 * @param message Obiekt komunikatu.
	 */
	public Envelope(IMessage message) {
		this(null, null, message);
	}
	
	/**
	 * @param receiver Sieciowy identyfikator odbiorcy.
	 * @param message Obiekt komunikatu.
	 */
	public Envelope(GDTSNetId receiver, IMessage message) {
		this(null, receiver, message);
	}

	/**
	 * @param sender Sieciowy identyfikator nadawcy.
	 * @param receiver Sieciowy identyfikator odbiorcy.
	 * @param message Obiekt komunikatu.
	 */
	public Envelope(GDTSNetId sender, GDTSNetId receiver, IMessage message) {
		this.sender = sender;
		this.receiver = receiver;
		this.message = message;
	}

	public GDTSNetId getSender() {
		return sender;
	}

	public void setSender(GDTSNetId sender) {
		this.sender = sender;
	}

	public GDTSNetId getReceiver() {
		return receiver;
	}

	public void setReceiver(GDTSNetId receiver) {
		this.receiver = receiver;
	}

	public IMessage getMessage() {
		return message;
	}

	public void setMessage(IMessage message) {
		this.message = message;
	}
}
