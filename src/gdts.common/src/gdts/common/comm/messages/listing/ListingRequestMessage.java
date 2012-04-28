package gdts.common.comm.messages.listing;

import gdts.common.comm.messages.Message;

/**
 * Abstrakcyjna klasa bazowa dla klas żądania listingu.
 * 
 * @author Maciej Milczarek
 */
public abstract class ListingRequestMessage extends Message {

	private static final long serialVersionUID = -1198261332934238783L;
	
	@Override
	public boolean responseRequired() {
		return true;
	}

	@Override
	public boolean responsePossible() {
		return true;
	}
}
