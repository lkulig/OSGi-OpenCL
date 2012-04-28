package gdts.common.comm.messages.data;

import gdts.common.comm.messages.IMessage;

/**
 * Interfejs dla klas komunikatów transferujących dane.
 * 
 * @author Maciej Milczarek
 *
 * @param <T> Typ danych do transferu.
 */
public interface IDataMessage<T> extends IMessage {

	/**
	 * @return Dane, które zostały przekazane.
	 */
	public T getData();
}
