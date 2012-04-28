package gdts.common.comm.messages;

import gdts.common.comm.messages.status.IStatusMessage;
import gdts.common.exception.GDTSException;

/**
 * Główny interfejs klas komunikatów.
 * 
 * @author Maciej Milczarek
 */
public interface IMessage {

	/**
	 * @return Czy komunikat wymaga odpowiedzi?
	 */
	public boolean responseRequired();
	
	@Deprecated
	public boolean responsePossible();
	
	/**
	 * @return Numer identyfikacyjny komunikatu.
	 */
	public long getMessageId();
	
	/**
	 * @return Identyfikar komunikatu, na który ten stanowi odpowiedź;
	 * -1 jeśli komunikat nie jest odpowiedzią. 
	 */
	public long getInReplyTo();
	
	/**
	 * @return Obiekt wyjątku niesiony przez komunikat.
	 */
	public GDTSException getException();
	
	/**
	 * @return Prosta odpowiedź - komunikat OK ("w porządku").
	 */
	public IStatusMessage statusOK();
	
	/**
	 * @return Prosta odpowiedź - komunikat Error ("błąd").
	 */
	public IStatusMessage statusError();
	
	/**
	 * @return Prosta odpowiedź - komunikat Cancel ("anuluj").
	 */
	public IStatusMessage statusCancel();
	
	/**
	 * @return Prosta odpowiedź - komunikat Busy ("zajęty").
	 */
	public IStatusMessage statusBusy();
	
	/**
	 * @param exc Wyjątek, który przenieść ma komunikat.
	 * @return Prosta odpowiedź z wyjątkiem - komunikat OK ("w porządku").
	 */	
	IStatusMessage statusOK(GDTSException exc);
	
	/**
	 * @param exc Wyjątek, który przenieść ma komunikat.
	 * @return Prosta odpowiedź z wyjątkiem - komunikat Error ("błąd").
	 */	
	IStatusMessage statusError(GDTSException exc);	
	
	/**
	 * @param exc Wyjątek, który przenieść ma komunikat.
	 * @return Prosta odpowiedź z wyjątkiem - komunikat Cancel ("anuluj").
	 */	
	IStatusMessage statusCancel(GDTSException exc);
	
	/**
	 * @param exc Wyjątek, który przenieść ma komunikat.
	 * @return Prosta odpowiedź z wyjątkiem - komunikat Busy ("zajęty").
	 */
	IStatusMessage statusBusy(GDTSException exc);
}
