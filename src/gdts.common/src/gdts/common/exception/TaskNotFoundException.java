package gdts.common.exception;

import gdts.common.module.TaskDescriptor;

/**
 * Wyjątek określający, że dane zadanie nie zostało znalezione w repozytorium.
 * 
 * @author Maciej Milczarek
 */
public class TaskNotFoundException extends GDTSException {

	private static final long serialVersionUID = -2938847255769436867L;

	public TaskNotFoundException(TaskDescriptor taskDescr) {
		super(taskDescr.toString());
	}
	
	public TaskNotFoundException(String msg) {
		super(msg);
	}
}
