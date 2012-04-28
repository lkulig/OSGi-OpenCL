package gdts.common.exception;

/**
 * Wyjątek określający, że dany plik już istnieje w repozytorium.
 * 
 * @author Maciej Milczarek
 */
public class GDTSFileExistsException extends GDTSException {

	private static final long serialVersionUID = 8781661164813238334L;

	public GDTSFileExistsException(String msg) {
		super(msg);
	}
}
