package gdts.common.comm.messages.listing;

import gdts.common.comm.messages.data.DataMessage;
import gdts.common.comm.messages.status.IStatusMessage;
import gdts.common.comm.messages.status.StatusType;

/**
 * Abstrakcyjna klasa bazowa dla klas komunikatów listingu,
 * 
 * @author Maciej Milczarek
 * @param <T> Typ danych, jakie przekazywać ma komunikat.
 */
public abstract class ListingMessage<T> extends DataMessage<T> implements IStatusMessage {

	private static final long serialVersionUID = 3872324541929262868L;
	
	/**
	 * @param data Dane do przekazania.
	 * @param inReplyTo Identyfikator komunikatu, na który ten jest odpowiedzią.
	 */
	public ListingMessage(T data, long inReplyTo) {
		super(data, inReplyTo);
	}

	@Override
	public boolean responseRequired() {
		return false;
	}

	@Override
	public boolean responsePossible() {
		return false;
	}

	@Override
	public StatusType getStatus() {
		return StatusType.OK;
	}
}
