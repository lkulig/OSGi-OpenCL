package gdts.common.exception;

/**
 * Abstrakcyjna klasa bazowa wszystkich klas wyjątków systemu.
 * 
 * @author Maciej Milczarek
 */
public abstract class GDTSException extends Exception {

	private static final long serialVersionUID = 1043789748788526685L;

	public GDTSException(Throwable cause) {
		super(cause);
	}
	
	public GDTSException(String msg) {
		super(msg);
	}
	
	public GDTSException(String msg, Exception cause) {
		super(msg, cause);
	}
}
