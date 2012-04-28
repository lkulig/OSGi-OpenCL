package gdts.core.commservice;

import gdts.common.GDTSNetId;
import gdts.common.comm.CommParty;
import gdts.common.comm.messages.IMessage;
import gdts.common.exception.GDTSConnectException;

/**
 * Interfejs usługi modułu komunikacyjnego.
 * 
 * @author Maciej Milczarek
 */
public interface ICommService {

	/**
	 * Rejestracja strony komunikacji.
	 * 
	 * @param party Strona komunikacji do zarejestrowania.
	 */
	public void registerParty(CommParty party);
	
	/**
	 * Usunięcie strony komunikacji z rejestru.
	 * 
	 * @param party Strona komunikacji do usunięcia z rejestru.
	 */
	public void unregisterParty(CommParty party);
	
	/**
	 * Metoda ustawia port nasłuchu. W wyniku jej wywołania moduł rozpoczyna
	 * nasłuch na podanym porcie.
	 * 
	 * @param port Port nasłuchu.
	 */
	public void configure(int port);
	
	/**
	 * Metoda służy do pobrania identyfikatora sieciowego elementu systemu,
	 * w którym pracuje moduł.
	 * 
	 * @return Identyfikator sieciowy elementu systemu.
	 */
	public GDTSNetId getNetId();
	
	/**
	 * Wysłanie komunikatu.
	 * 
	 * @param sender Nadawca komunikatu.
	 * @param receiver Odbiorca komunikatu.
	 * @param message Komunikat.
	 * @throws GDTSConnectException Wyjątek rzucany, gdy nie uda się nawiązać połączenia
	 * z odbiorcą.
	 */
	void sendTo(CommParty sender, GDTSNetId receiver, IMessage message) throws GDTSConnectException;

}
