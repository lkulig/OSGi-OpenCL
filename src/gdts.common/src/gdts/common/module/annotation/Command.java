package gdts.common.module.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Adnotacja służąca do oznaczenia metody komendy.
 * 
 * @author Maciej Milczarek
 */
@Target(ElementType.METHOD)
@Retention(value=RetentionPolicy.RUNTIME)
public @interface Command {
	/**
	 * @return Identyfikator komendy.
	 */
	String id();
	
	/**
	 * @return Lista parametrów komendy.
	 */
	Param[] params();
}
