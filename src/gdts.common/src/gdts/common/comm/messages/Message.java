package gdts.common.comm.messages;

import gdts.common.comm.messages.status.IStatusMessage;
import gdts.common.comm.messages.status.SimpleStatusMessage;
import gdts.common.comm.messages.status.StatusType;
import gdts.common.exception.GDTSException;

import java.io.Serializable;

/**
 * Klasa bazowa wszystkich klas komunikatów.
 * 
 * @author Maciej Milczarek
 */
public abstract class Message implements IMessage, Serializable {

	private static final long serialVersionUID = -3583389347120705537L;
	
	private static long idSequence = 123;

	private String message;
	private long messageId;
	private long inReplyTo;
	
	private GDTSException exc;

	public Message() {
		this(-1L);
	}

	public Message(Long inReplyTo) {
		this(inReplyTo, null);
	}
	
	public Message(String message) {
		this(-1L, message);
	}
	
	public Message(Long inReplyTo, String message) {
		this(inReplyTo, message, null);
	}
	
	public Message(Long inReplyTo, String message, GDTSException exc) {
		this.messageId = idSequence++;
		this.message = message;
		this.inReplyTo = inReplyTo;
		this.exc = exc;
	}
	
	@Override
	public GDTSException getException() {
		return exc;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	@Override
	public long getMessageId() {
		return messageId;
	}
	
	@Override
	public long getInReplyTo() {
		return inReplyTo;
	}

	public void setInReplyTo(long inReplyTo) {
		this.inReplyTo = inReplyTo;
	}

	@Override
	public String toString() {

		return message; 
	}
	
	@Override
	public IStatusMessage statusOK() {
		return createStatusMessage(StatusType.OK);
	}

	@Override
	public IStatusMessage statusError() {
		return createStatusMessage(StatusType.ERROR);
	}

	@Override
	public IStatusMessage statusCancel() {
		return createStatusMessage(StatusType.CANCEL);
	}

	@Override
	public IStatusMessage statusBusy() {
		return createStatusMessage(StatusType.BUSY);
	}
	
	@Override
	public IStatusMessage statusOK(GDTSException exc) {
		return createStatusMessage(StatusType.OK, exc);
	}

	@Override
	public IStatusMessage statusError(GDTSException exc) {
		return createStatusMessage(StatusType.ERROR, exc);
	}

	@Override
	public IStatusMessage statusCancel(GDTSException exc) {
		return createStatusMessage(StatusType.CANCEL, exc);
	}

	@Override
	public IStatusMessage statusBusy(GDTSException exc) {
		return createStatusMessage(StatusType.BUSY, exc);
	}

	public IStatusMessage createStatusMessage(StatusType status, GDTSException exc) {
		if(this.responseRequired() == false && responsePossible() == false) {
			throw new UnsupportedOperationException("Cannot create response for message of type " + this.getClass().getSimpleName());
		}
		return new SimpleStatusMessage(status, messageId, exc);
	}

	public IStatusMessage createStatusMessage(StatusType status) {
		return createStatusMessage(status, exc);
	}
	
	@Deprecated
	public StatusMessage messageOK() {
		return statusMessage(StatusMessage.Type.OK);
	}
	
	@Deprecated
	public StatusMessage messageBusy() {
		return statusMessage(StatusMessage.Type.BUSY);
	}
	
	@Deprecated
	public StatusMessage messageCancel() {
		return statusMessage(StatusMessage.Type.CANCEL);
	}
	
	@Deprecated
	public StatusMessage messageError() {
		return statusMessage(StatusMessage.Type.ERROR);
	}
	
	@Deprecated
	public StatusMessage messageBlocked() {
		return statusMessage(StatusMessage.Type.BLOCKED);
	}
	
	@Deprecated
	public StatusMessage statusMessage(StatusMessage.Type type) {
		return new StatusMessage(type, messageId);
	}
}


