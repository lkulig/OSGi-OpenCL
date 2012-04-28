package gdts.core.configservice;

import gdts.common.GDTSNetId;

import java.io.File;

/**
 * Publiczny interfejs usługi konfiguracyjnej.
 * 
 * @author Maciej Milczarek
 */
public interface IConfigService {

	/**
	 * Metoda służąca do pobrania identyfikatora Domeny.
	 * 
	 * @return Identyfikator domeny.
	 */
	public String getDomainId();

	/**
	 * Metoda służąca do pobrania katalogu repozotyrium, w którym
	 * zapisywane są pliki Zadań.
	 * 
	 * @return Katalog repozytorium dla Zadań.
	 */
	public File getTaskDir();

	/**
	 * Metoda służąca do pobrania katalogu repozytorium, w którym
	 * zapisywane są pliki Instancji.
	 * 
	 * @return Katalog repozytorium dla Instancji.
	 */
	public File getInstanceDir();

	/**
	 * Metoda służąca do pobrania sieciowego identyfikatora Nadzorcy.
	 * 
	 * @return Sieciowy identyfikator Nadzorcy.
	 */
	public GDTSNetId getMasterNetId();

	/**
	 * Metoda zwraca lokalny port, na którym powinien być prowadzony nasłuch.
	 * 
	 * @return Port nasłuchu.
	 */
	public int getLocalPort();
	
	/**
	 * Metoda służąca do określania, czy moduł konfiguracyjny pracuje w 
	 * środowisku Nadzorcy, czy Wykonawcy.
	 * 
	 * @return true, jeśli jest Nadzorcą, false jeśli jest Wykonawcą.
	 */
	public boolean isMaster();
}
