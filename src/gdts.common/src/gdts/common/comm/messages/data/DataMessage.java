package gdts.common.comm.messages.data;

import gdts.common.comm.messages.Message;

/**
 * Klasa bazowa wszystkich klas komunikatów transferu danych.
 * 
 * @author Maciej Milczarek
 *
 * @param <T> Typ danych do transferu.
 */
public abstract class DataMessage<T> extends Message implements IDataMessage<T>{

	private static final long serialVersionUID = -2415503182928159628L;
	
	private T data;

	/**
	 * @param data Dane do transferu.
	 * @param inReplyTo Identyfikator komunikatu, na który ten jest odpowiedzią.
	 */
	public DataMessage(T data, long inReplyTo) {
		super(inReplyTo);
		this.data = data;
	}
	
	/**
	 * @param data Dane do transferu.
	 */
	public DataMessage(T data) {
		super();
		this.data = data;
	}

	@Override
	public T getData() {
		return data;
	}
}
