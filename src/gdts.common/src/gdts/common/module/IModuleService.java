package gdts.common.module;

import gdts.common.data.type.Variable;

import java.util.Map;

/**
 * Interfejs modułów wykonawczych.
 * 
 * @author Maciej Milczarek
 */
public interface IModuleService {

	/**
	 * Wywołanie metody wykonuje podaną komendą z zadanymi parametrami.
	 * 
	 * @param id Identyfikator komendy.
	 * @param params Lista nazwanych parametrów w postaci mapy.
	 */
	void execute(String id, Map<String, Variable> params);
	
	/**
	 * Metoda zwraca deskryptor modułu wykonawczego.
	 * 
	 * @return Deskryptor modułu wykonawczego.
	 */
	public ModuleDescr getModuleDescr();
}
