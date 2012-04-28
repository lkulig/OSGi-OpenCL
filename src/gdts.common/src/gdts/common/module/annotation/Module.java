package gdts.common.module.annotation;

import gdts.common.module.ModuleType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Adnotacja służąca do oznaczenia klasy implementacyjnej Modułu wykonawczego.
 * 
 * @author Maciej Milczarek
 */
@Target(ElementType.TYPE)
@Retention(value=RetentionPolicy.RUNTIME)
public @interface Module {
	
	/**
	 * @return Identyfikator Modułu.
	 */
	String id();
	
	/**
	 * @return Wersja Modułu.
	 */
	String version();
	
	/**
	 * @return Typ Modułu.
	 */
	ModuleType type();
}
