package gdts.common.comm.messages.data;

/**
 * Komunikat przekazujący plik Instancji zadania.
 * 
 * @author Maciej Milczarek
 */
public class InstanceFileTransferMessage extends FileTransferMessage {

	private static final long serialVersionUID = 6934564933358401962L;

	/**
	 * @param fileName Nazwa pliku Instancji.
	 * @param data Zawartość pliku Zadania w postaci tablicy byte[].
	 * @param inReplyTo Identyfikator komunikatu, na który ten jest odpowiedzią.
	 */
	public InstanceFileTransferMessage(String fileName, byte[] data,
			long inReplyTo) {
		super(fileName, data, inReplyTo);
	}
	
	/**
	 * @param fileName Nazwa pliku Instancji.
	 * @param data Zawartość pliku zadania w postaci tablicy byte[].
	 */
	public InstanceFileTransferMessage(String fileName, byte[] data) {
		super(fileName, data);
	}
}
