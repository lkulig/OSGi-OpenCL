package gdts.common.exception;

/**
 * Wyjątek określający, że dana Instancja istnieje już w repozytorium.
 * 
 * @author Maciej Milczarek
 */
public class InstanceAlreadyInRepoException extends GDTSException {

	private static final long serialVersionUID = 3691350233864617833L;

	public InstanceAlreadyInRepoException(String msg, Exception cause) {
		super(msg, cause);
	}

	public InstanceAlreadyInRepoException(String msg) {
		super(msg);
	}

	public InstanceAlreadyInRepoException(Throwable cause) {
		super(cause);
	}
}
