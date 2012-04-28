package gdts.common.comm.messages.listing;

import gdts.common.module.TaskDescriptor;

import java.util.List;

/**
 * Komunikat przekazujący listę Zadań w repozytorium.
 * 
 * @author Maciej Milczarek
 */
public class TaskListingMessage extends ListingMessage<List<TaskDescriptor>> {

	private static final long serialVersionUID = 3037068684322918661L;

	/**
	 * @param data Lista deskryptorów Zadań.
	 * @param inReplyTo Identyfikator komunikatu, na który ten jest odpowiedzią.
	 */
	public TaskListingMessage(List<TaskDescriptor> tasks, long inReplyTo) {
		super(tasks, inReplyTo);
	}	
}
