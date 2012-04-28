package gdts.common.comm.messages.data;

/**
 * Klasa transferu pliku.
 * 
 * @author Maciej Milczarek
 */
public class FileTransferMessage extends DataMessage<byte[]> {

	private static final long serialVersionUID = 3257061387024747439L;
	
	private String fileName;

	/**
	 * @param fileName Nazwa pliku.
	 * @param data Zawartość bliku w postacie tablicy byte[].
	 * @param inReplyTo Identyfikator komunikatu, na który ten jest odpowiedzią.
	 */
	public FileTransferMessage(String fileName, byte[] data, long inReplyTo) {
		super(data, inReplyTo);
		this.fileName = fileName;
	}
	
	/**
	 * @param fileName Nazwa pliku.
	 * @param data Zawartość pliku w postaci tablicy byte[].
	 */
	public FileTransferMessage(String fileName, byte[] data) {
		super(data);
		this.fileName = fileName;
	}
	
	public String getFileName() {
		return fileName;
	}

	@Override
	public boolean responseRequired() {
		return true;
	}

	@Override
	public boolean responsePossible() {
		return true;
	}
}
