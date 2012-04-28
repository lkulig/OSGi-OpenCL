package gdts.common.exception;

/**
 * Wyjątek określający niepoprawny format wersji.
 * 
 * @author Maciej Milczarek
 */
public class InvalidVersionException extends RuntimeException {

	private static final long serialVersionUID = 7745549051032927136L;

	public InvalidVersionException() {
		super();
	}

	public InvalidVersionException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public InvalidVersionException(String arg0) {
		super(arg0);
	}

	public InvalidVersionException(Throwable arg0) {
		super(arg0);
	}	
}
