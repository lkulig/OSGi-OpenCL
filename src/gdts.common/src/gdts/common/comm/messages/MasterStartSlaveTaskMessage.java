package gdts.common.comm.messages;

import gdts.common.data.type.Variable;
import gdts.common.module.TaskDescriptor;

import java.util.Map;

/**
 * Komunikat zlecający Wykonawcy rozpoczęcie wykonywania Podzadania i 
 * przekazujący mu dane wejściowe.
 * 
 * @author Maciej Milczarek
 */
public class MasterStartSlaveTaskMessage extends MasterMessage {

	private static final long serialVersionUID = -6607017782614506373L;
	
	private TaskDescriptor taskDescriptor;
	private String slaveTaskId;
	private Map<String, Variable> params;

	/**
	 * @param taskDescriptor Deskryptor zadania, które zawiera Podzadanie do wykonania.
	 * @param slaveTaskId Identyfikator Podzadania.
	 * @param params Mapa parametrów (danych wejściowych) dla Podzadania.
	 */
	public MasterStartSlaveTaskMessage(TaskDescriptor taskDescriptor,
			String slaveTaskId, Map<String, Variable> params) {
		super();
		this.taskDescriptor = taskDescriptor;
		this.slaveTaskId = slaveTaskId;
		this.params = params;
	}

	public TaskDescriptor getTaskDescriptor() {
		return taskDescriptor;
	}
	
	public void setTaskDescriptor(TaskDescriptor taskDescriptor) {
		this.taskDescriptor = taskDescriptor;
	}

	public String getSlaveTaskId() {
		return slaveTaskId;
	}

	public void setSlaveTaskId(String slaveTaskId) {
		this.slaveTaskId = slaveTaskId;
	}

	public Map<String, Variable> getParams() {
		return params;
	}

	public void setParams(Map<String, Variable> params) {
		this.params = params;
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
		return("Message for start slave task " + slaveTaskId);
	}
}
