package gdts.common.comm.messages;

/**
 * Komunikat zlecający Nadzorcy rozpoczęcie wykonywania Instancji zadania.
 * 
 * @author Maciej Milczarek
 */
public class StartTaskInstanceMessage extends Message {

	private static final long serialVersionUID = 3586282573075342125L;

	private String instanceId;
	
	/**
	 * @param instanceId Identyfikator Instancji.
	 */
	public StartTaskInstanceMessage(String instanceId) {
		this.instanceId = instanceId;
	}
	
	public String getInstanceId() {
		return instanceId;
	}

	@Override
	public boolean responseRequired() {
		return true;
	}

	@Override
	public boolean responsePossible() {
		return true;
	}
}
