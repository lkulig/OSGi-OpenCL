package gdts.common.comm.messages;

/**
 * Klasa bazowa klas komunikatów Nadzorcy.
 * 
 * @author Maciej Milczarek
 */
public abstract class MasterMessage extends Message {

	private static final long serialVersionUID = 5670460743598383026L;
	
	public MasterMessage() {
		super();
	}

	public MasterMessage(Long inReplyTo, String message) {
		super(inReplyTo, message);
	}

	public MasterMessage(Long inReplyTo) {
		super(inReplyTo);
	}
}
