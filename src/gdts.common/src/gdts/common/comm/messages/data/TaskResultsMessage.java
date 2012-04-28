package gdts.common.comm.messages.data;

import gdts.common.data.type.Variable;

import java.util.Map;

/**
 * Komunikat przekazujący wyniki wykonania Zadania, jednocześnie potwierdzający jego zakończenie.
 * 
 * @author Maciej Milczarek
 */
public class TaskResultsMessage extends DataMessage<Map<String, Variable>> {

	private static final long serialVersionUID = 7997414701649068919L;

	/**
	 * @param data Wyniki wykonania Zadania.
	 */
	public TaskResultsMessage(Map<String, Variable> data) {
		super(data);
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
