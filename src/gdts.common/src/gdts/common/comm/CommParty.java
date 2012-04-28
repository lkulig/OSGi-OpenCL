package gdts.common.comm;

/**
 * Interfejs implementowany przez klasę stanowiacą stronę komunikacji. 
 * 
 * @author Maciej Milczarek
 */
public interface CommParty {
	
	/**
	 * Metoda wywoływana po nadejściu komunikatu adresowanego do strony komunikacji.
	 * 
	 * @param envelope Obiekt (koperta) opakowujący klasę komunikatu.
	 */
	public void receiveMessage(Envelope envelope);
	
	/**
	 * @return Unikalny identyfikator strony komunikacji.
	 */
	public Object getPartyId();
}
