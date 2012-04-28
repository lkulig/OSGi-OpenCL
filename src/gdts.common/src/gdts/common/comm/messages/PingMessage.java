package gdts.common.comm.messages;


/**
 *	Komunikat sprawdzający nasłuch docelowej strony komunikacji.
 *
 * @author Maciej Milczarek
 */
public class PingMessage extends Message {

	private static final long serialVersionUID = 5799995637641185588L;

	@Override
	public boolean responseRequired() {
		return true;
	}

	@Override
	public boolean responsePossible() {
		return true;
	}

}
