package gdts.common.comm.messages.status;

import gdts.common.comm.messages.IMessage;

/**
 * Interfejs dla wszystkich klas komunikatów statusu.
 * 
 * @author Maciej Milczarek
 */
public interface IStatusMessage extends IMessage {

	public StatusType getStatus();
}
