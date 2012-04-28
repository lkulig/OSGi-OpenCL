package gdts.common;

import gdts.common.data.type.Variable;
import gdts.common.module.ModuleDescr;

import java.util.Map;

/**
 * Interfejs dla klas wątków wykonujących przepływ,
 * potrzebny do wywoływania komend.
 * 
 * @author Maciej Milczarek
 */
public interface Executor {

	/**
	 * Wywołanie komendy.
	 * 
	 * @param id Identyfikator komendy.
	 * @param module Identyfikator modułu.
	 * @param params Parametry komendy w postaci mapy.
	 */
	public void commandCall(String id, ModuleDescr module, Map<String, Variable> params);
}
