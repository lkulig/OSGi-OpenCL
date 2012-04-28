package gdts.common.comm.messages;

/**
 * Klasa komunikatu statusu, przestarzała. Należy zamiast niej używać
 * klas komunikatów implementujących interfejs {@link gdts.common.messages.status.IStatusMessage}.
 * 
 * @author Maciej Milczarek
 */
@Deprecated
public class StatusMessage extends Message {

	/**
	 * 
	 */
	private static final long serialVersionUID = 466589879527828523L;
	
	public enum Type {
		OK, BUSY, CANCEL, ERROR, BLOCKED
	}
	
	private Type type;
	private long originalMsgId;
	private boolean responsePossible = false;
	
	/**
	 * 
	 */
	public StatusMessage() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StatusMessage(Type type, Long inReplyTo) {
		this(type, inReplyTo, null);
	}
	
	/**
	 * @param senderNetId
	 * @param inReplyTo
	 * @param message
	 */
	public StatusMessage(Type type, Long inReplyTo, String message) {
		super(inReplyTo, message);
		this.type = type;
	}

	/**
	 * @param senderNetId
	 * @param inReplyTo
	 */
	public StatusMessage(Long inReplyTo) {
		super(inReplyTo);
		// TODO Auto-generated constructor stub
	}

	public long getOriginalMsgId() {
		return originalMsgId;
	}
	
	public Type getType() {
		return type;
	}
	
	public void setResponsePossible(boolean responsePossible) {
		this.responsePossible = responsePossible;
	}

	/* (non-Javadoc)
	 * @see gdts.common.comm.Message#responseRequired()
	 */
	@Override
	public boolean responseRequired() {
		return false;
	}

	/* (non-Javadoc)
	 * @see gdts.common.comm.Message#responsePossible()
	 */
	@Override
	public boolean responsePossible() {
		return responsePossible;
	}
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " " + this.type.toString();
	}
}
