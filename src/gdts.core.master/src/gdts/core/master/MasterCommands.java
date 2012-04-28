package gdts.core.master;

import gdts.common.data.type.VSlave;
import gdts.common.data.type.Variable;

import java.util.HashMap;
import java.util.Map;

/**
 * Klasa zawierająca implementację kilku komend specyficznych dla Nadzorcy.
 * 
 * @author Maciej Milczarek
 */
public class MasterCommands {

	protected enum Command {
		GET_FREE_SLAVE_AND_BLOCK,
		START_SLAVETASK,
		JOIN_ALL
	}
	
	private Master master;
	
	protected MasterCommands(Master master) {
		this.master = master;
	}
	
	public static boolean isMasterCommand(String commandId) {
		
		try {
			Command.valueOf(commandId);
		} catch (Exception e) {
			return false;
		}
		
		return true;
	}
	
	public void execute(String id) {
		this.execute(id, new HashMap<String, Variable>());
	}
	
	public void execute(String id, Map<String, Variable> params) {
		Command command = Command.valueOf(id);
		
		switch(command) {
			case GET_FREE_SLAVE_AND_BLOCK:
				getFreeSlaveAndBlock(params);
				break;
			case START_SLAVETASK:
				startSlavetask(params);
				break;
		}
	}

	
	private void getFreeSlaveAndBlock(Map<String, Variable> params) {
		VSlave slave = master.requestSlaveForTask();
		((VSlave)params.get("slave")).setValue(slave);
	}
	
	private void startSlavetask(Map<String, Variable> params) {
	}
}
