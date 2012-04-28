package gdts.common.exception;

/**
 * Wyjątek określający, że dany moduł wykonawczy nie istnieje w repozytorium.
 * 
 * @author Maciej Milczarek
 */
public class ModuleNotInRepoException extends Exception {

	private static final long serialVersionUID = -5313427027297414554L;
	
	public ModuleNotInRepoException(String msg) {
		super(msg);
	}
}
