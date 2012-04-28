package gdts.common.comm.messages.status;

/**
 * Typy prostych komunikatów statusu.
 * 
 * @author Maciej Milczarek
 */
public enum StatusType {

	/**
	 * Wszystko w porządku.
	 */
	OK,
	
	/**
	 * Anuluj.
	 */
	CANCEL,
	
	/**
	 * Bład.
	 */
	ERROR,
	
	/**
	 * Zajęty.
	 */
	BUSY
}
