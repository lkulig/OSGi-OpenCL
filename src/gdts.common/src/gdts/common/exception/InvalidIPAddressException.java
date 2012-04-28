package gdts.common.exception;

/**
 * Wyjątek określający niepoprawny adres IP.
 * 
 * @author Maciej Milczarek
 */
public class InvalidIPAddressException extends Exception {

	private static final long serialVersionUID = -6102033565594653574L;

	public InvalidIPAddressException() {
		// TODO Auto-generated constructor stub
	}

	public InvalidIPAddressException(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public InvalidIPAddressException(Throwable arg0) {
		super(arg0);
	}

	public InvalidIPAddressException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

}
