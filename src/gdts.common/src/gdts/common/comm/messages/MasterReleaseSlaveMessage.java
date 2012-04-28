package gdts.common.comm.messages;

/**
 * Komunikat zwalniający wcześniej zablokowanego Wykonawcę.
 * 
 * @author Maciej Milczarek
 */
public class MasterReleaseSlaveMessage extends MasterMessage {

	private static final long serialVersionUID = 1332427701391149476L;

	@Override
	public boolean responseRequired() {
		return false;
	}

	@Override
	public boolean responsePossible() {
		return false;
	}

}
