package gdts.common.comm.messages;

import gdts.common.data.type.Variable;

import java.util.Map;

/**
 * Komunikat zwracający wyniki wykonania Podzadania do Nadzorcy,
 * jednocześnie przenosi wyniki Podzadania.
 * 
 * @author Maciej Milczarek
 */
public class SlaveTaskResultsMessage extends Message {

	private static final long serialVersionUID = 4061620382215087696L;
	
	private Map<String, Variable> data;
	
	/**
	 * @param inReplyTo Identyfikator komunikatu zlecającego wykonanie Podzadania.
	 * @param data Dane wyjściowe podzadania.
	 */
	public SlaveTaskResultsMessage(long inReplyTo, Map<String, Variable> data) {
		super(inReplyTo);
		this.data = data;
	}

	public Map<String, Variable> getData() {
		return data;
	}

	public void setData(Map<String, Variable> data) {
		this.data = data;
	}

	@Override
	public boolean responseRequired() {
		return false;
	}

	@Override
	public boolean responsePossible() {
		return false;
	}
}
