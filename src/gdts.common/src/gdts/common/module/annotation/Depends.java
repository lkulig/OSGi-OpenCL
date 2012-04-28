package gdts.common.module.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Deprecated
@Target(ElementType.TYPE)
@Retention(value=RetentionPolicy.RUNTIME)
public @interface Depends {
	Module[] module();
}
