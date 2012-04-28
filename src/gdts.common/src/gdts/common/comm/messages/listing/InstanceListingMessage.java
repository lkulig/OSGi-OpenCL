package gdts.common.comm.messages.listing;

import gdts.common.module.InstanceDescriptor;

import java.util.List;

/**
 * Komunikat przekazujący listę Instancji w repozytorium.
 * 
 * @author Maciej Milczarek
 */
public class InstanceListingMessage extends ListingMessage<List<InstanceDescriptor>> {

	private static final long serialVersionUID = -2642308479992641209L;

	/**
	 * @param data Lista deskryptorów Instancji.
	 * @param inReplyTo Identyfikator komunikatu, na który ten jest odpowiedzią.
	 */
	public InstanceListingMessage(List<InstanceDescriptor> data, long inReplyTo) {
		super(data, inReplyTo);
	}	
}
