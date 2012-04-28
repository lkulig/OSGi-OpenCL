/**
 * Plik VSlaveTask.java.
 * Autor: Maciej Milczarek
 * Utworzono Aug 24, 2011.
 */
package gdts.common.data.type;

import gdts.common.module.ParamDescr;
import gdts.common.module.TaskDescriptor;

import java.util.Map;

/**
 * Klasa zmiennych reprezentujących Podzadanie.
 * 
 * @author Maciej Milczarek
 */
public class VSlaveTask extends Variable {

	private static final long serialVersionUID = -7897960950086799584L;

	private static Long counter = 0L;
	private long uniqueId;
	
	String id;
	TaskDescriptor taskDescriptor;
	VSlave slave;
	Map<ParamDescr, Variable> params;
	
	public VSlaveTask() {
		super();
	}

	/**
	 * @param id
	 * @param taskDescriptor
	 * @param params
	 */
	public VSlaveTask(String id, TaskDescriptor taskDescriptor,
			Map<ParamDescr, Variable> params, VSlave slave) {
		this();
		this.id = id;
		this.taskDescriptor = taskDescriptor;
		this.slave = slave;
		this.params = params;
	}
	
	//TODO add cloning other properties, besides uniqueId!!
	public VSlaveTask(VSlaveTask slaveTask) {
		this.uniqueId = slaveTask.uniqueId;
	}
	
	public void createUniqueId() {
		synchronized(counter) {
			this.uniqueId = counter++;
		}
	}
	
	public long getUniqueId() {
		return uniqueId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public TaskDescriptor getTaskDescriptor() {
		return taskDescriptor;
	}

	public void setTaskDescriptor(TaskDescriptor taskDescriptor) {
		this.taskDescriptor = taskDescriptor;
	}

	public Map<ParamDescr, Variable> getParams() {
		return params;
	}

	public void setParams(Map<ParamDescr, Variable> params) {
		this.params = params;
	}

	public VSlave getSlave() {
		return slave;
	}

	public void setSlave(VSlave slave) {
		this.slave = slave;
	}

	@Override
	public void setValue(Variable value) {
		throw new RuntimeException("VSlaveTask#setValue");
	}

	@Override
	public Variable duplicate() {
		return new VSlaveTask(this);
	}
	
	@Override 
	public String toString() {
		return "Slavetask number " + uniqueId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (uniqueId ^ (uniqueId >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VSlaveTask other = (VSlaveTask) obj;
		if (uniqueId != other.uniqueId)
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see gdts.common.data.type.Variable#isNull()
	 */
	@Override
	public boolean isNull() {
		// TODO Auto-generated method stub
		return false;
	}
}
