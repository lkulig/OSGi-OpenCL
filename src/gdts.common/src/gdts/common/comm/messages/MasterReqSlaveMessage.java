package gdts.common.comm.messages;

/**
 * Komunikat blokujący Wykonawcę w celu wykonania Podzadania.
 * 
 * @author Maciej Milczarek
 */
public class MasterReqSlaveMessage extends MasterMessage {

	private static final long serialVersionUID = -7781300177832848305L;

	public MasterReqSlaveMessage() {
		super();
	}

	public MasterReqSlaveMessage(Long inReplyTo,
			String message) {
		super(inReplyTo, message);
	}

	public MasterReqSlaveMessage(Long inReplyTo) {
		super(inReplyTo);
	}

	@Override
	public boolean responseRequired() {
		return true;
	}

	@Override
	public boolean responsePossible() {
		return true;
	}
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName();
	}
}
