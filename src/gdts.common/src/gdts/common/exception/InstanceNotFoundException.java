package gdts.common.exception;

/**
 * Wyjątek określający, że dana Instancja nie została znaleziona w repozytorium.
 * 
 * @author Maciej Milczarek
 */
public class InstanceNotFoundException extends GDTSException {

	private static final long serialVersionUID = 4852780725581367845L;

	/**
	 * @param message
	 */
	public InstanceNotFoundException(String message) {
		super(message);
	}
}
