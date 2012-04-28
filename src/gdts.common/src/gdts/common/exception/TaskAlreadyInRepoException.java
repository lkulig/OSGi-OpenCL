package gdts.common.exception;

/**
 * Wyjątek określający, że plik danego zadania już istnieje w repozytorium.
 * 
 * @author Maciej Milczarek
 */
public class TaskAlreadyInRepoException extends GDTSException {

	private static final long serialVersionUID = -1040055214637143174L;

	public TaskAlreadyInRepoException(String msg, Exception cause) {
		super(msg, cause);
	}

	public TaskAlreadyInRepoException(String msg) {
		super(msg);
	}

	public TaskAlreadyInRepoException(Throwable cause) {
		super(cause);
	}
}
