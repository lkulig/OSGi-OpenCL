package gdts.common.module;

import gdts.common.Version;

import java.io.Serializable;

/**
 * Deskryptor Instancji zadania. Przechowuje informacje o identyfikatorze Instancji i
 * Zadaniu, do którego Instancja się odnosi.
 * 
 * @author Maciej Milczarek
 */
public class InstanceDescriptor implements Serializable {

	private static final long serialVersionUID = 6315396839949242271L;

	private String id;
	private TaskDescriptor task;

	/**
	 * @param id Identyfikator Instancji.
	 * @param taskId Identyfikator Zadania.
	 * @param taskVersion Wersja Zadania.
	 */
	public InstanceDescriptor(String id, String taskId, Version taskVersion) {
		this(id, new TaskDescriptor(taskId, taskVersion));
	}
	
	/**
	 * @param id Identyfikator Instancji.
	 * @param task Deskryptor Zadania.
	 */
	public InstanceDescriptor(String id, TaskDescriptor task) {
		super();
		this.id = id;
		this.task = task;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public TaskDescriptor getTask() {
		return task;
	}

	public void setTask(TaskDescriptor task) {
		this.task = task;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((task == null) ? 0 : task.hashCode());
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
		InstanceDescriptor other = (InstanceDescriptor) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (task == null) {
			if (other.task != null)
				return false;
		} else if (!task.equals(other.task))
			return false;
		return true;
	}
}
