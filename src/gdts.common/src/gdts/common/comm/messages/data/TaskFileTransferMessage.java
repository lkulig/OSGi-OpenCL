package gdts.common.comm.messages.data;

/**
 * Komunikat przekazujący plik Zadania.
 * 
 * @author Maciej Milczarek
 */
public class TaskFileTransferMessage extends FileTransferMessage {

	private static final long serialVersionUID = 422965984841069787L;

	/**
	 * @param fileName Nazwa pliku Zadania.
	 * @param data Zawartość pliku Zadania w postaci tablicy byte[].
	 * @param inReplyTo Identyfikator komunikatu, na który ten jest odpowiedzią.
	 */
	public TaskFileTransferMessage(String fileName, byte[] data, long inReplyTo) {
		super(fileName, data, inReplyTo);
	}
	
	/**
	 * @param fileName Nazwa pliku Zadania.
	 * @param data Zawartość pliku Zadania w postaci tablicy byte[].
	 */
	public TaskFileTransferMessage(String fileName, byte[] data) {
		super(fileName, data);
	}
}
