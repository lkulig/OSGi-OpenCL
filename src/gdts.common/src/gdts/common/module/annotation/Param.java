package gdts.common.module.annotation;

import gdts.common.data.VarRole;
import gdts.common.data.type.Variable;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Adnotacja służąca do opisu parametru komendy.
 * 
 * @author Maciej Milczarek
 */
@Retention(value=RetentionPolicy.RUNTIME)
public @interface Param {
	
	/**
	 * @return Nazwa (identyfikator) parametru.
	 */
	String id();
	
	/**
	 * @return Klasa typu parametru.
	 */
	Class<? extends Variable> type();
	
	/**
	 * @return Rola parametru.
	 */
	VarRole role();
}
