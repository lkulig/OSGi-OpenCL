package gdts.common.comm.messages;

/**
 * Komunikat rejestrujący Wykonawcę u Nadzorcy.
 * 
 * @author Maciej Milczarek
 */
public class SlaveCheckInMessage extends Message {

	private static final long serialVersionUID = -3840243272616257426L;
	
	public SlaveCheckInMessage() {
		super();
	}

	public SlaveCheckInMessage(Long inReplyTo,
			String message) {
		super(inReplyTo, message);
	}

	public SlaveCheckInMessage(Long inReplyTo) {
		super(inReplyTo);
	}
	
	public SlaveCheckInMessage(String message) {
		super(message);
	}

	@Override
	public boolean responseRequired() {
		return false;
	}

	@Override
	public boolean responsePossible() {
		return false;
	}
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName();
	}
}
