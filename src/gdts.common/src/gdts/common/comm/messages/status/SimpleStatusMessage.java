package gdts.common.comm.messages.status;

import gdts.common.comm.messages.Message;
import gdts.common.exception.GDTSException;

/**
 * Prosty komunikat statusu, przyjmujący jedna z wartości z typu enum {@link StatusType}
 * 
 * @author Maciej Milczarek
 */
public class SimpleStatusMessage extends Message implements IStatusMessage {

	private static final long serialVersionUID = -8184915118125574634L;

	private StatusType status;
	
	/**

	 */
	public SimpleStatusMessage(StatusType status, long inReplyTo) {
		this(status, inReplyTo, null);
	}
	
	/**
	 * 
	 * @param status Wartość statusu.
	 * @param inReplyTo Identyfikator komunikatu, na który ten jest odpowiedzią.
	 * @param exc Wyjątek, który zostanie przekazany razem z komunikatem.
	 */
	public SimpleStatusMessage(StatusType status, long inReplyTo, GDTSException exc) {
		super(inReplyTo, status.toString(), exc);
		this.status = status;
	}
	
	@Override
	public StatusType getStatus() {
		return status;
	}

	@Override
	public boolean responseRequired() {
		return false;
	}

	@Override
	public boolean responsePossible() {
		return false;
	}

}
