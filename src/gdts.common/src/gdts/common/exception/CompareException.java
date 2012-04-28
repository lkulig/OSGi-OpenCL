package gdts.common.exception;

/**
 * Wyjątek określający błąd podczas wykonywania porównania dwóch typów numerycznych.
 * 
 * @author Maciej Milczarek
 */
public class CompareException extends RuntimeException {

	private static final long serialVersionUID = 3584674962543213772L;

	public CompareException(String string) {
		super(string);
	}
}
