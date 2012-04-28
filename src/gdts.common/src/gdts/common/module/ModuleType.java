package gdts.common.module;

/**
 * Typ Modułu wykonawczego.
 * 
 * @author Maciej Milczarek
 */
public enum ModuleType {

	/**
	 * Moduł może być obecny na Nadzorcy.
	 */
	MASTER_SIDE,
	
	/**
	 * Moduł może być dostępny na Wykonawcy.
	 */
	SLAVE_SIDE,
	
	/**
	 * Moduł może być dostępny zarówno na Nadzorcy, jak i Wykonawcy.
	 */
	BOTH
}
