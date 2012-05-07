package gdts.common.module;

import static gdts.common.logger.SimpleLogger.log;
import static java.util.Arrays.asList;
import gdts.common.Version;
import gdts.common.data.type.Variable;
import gdts.common.module.annotation.Module;

import java.lang.reflect.Method;
import java.util.List;

/**
 * Klasa bazowa Modułów wykonawczych. Jest odpowiedzialna za analizę
 * implementacji każdego modułu i określenie na jej podstawie jego
 * identyfikatora oraz komend wraz z listami nazwanych parametrów.
 * 
 * @author Maciej Milczarek
 */
public abstract class ModuleBase implements IModuleService {

	private ModuleDescription moduleDescription;

	public ModuleBase() {
		this.moduleDescription = new ModuleDescription();
		Module moduleAnnotation = this.getClass().getAnnotation(Module.class);
		if (moduleAnnotation != null) {
			this.moduleDescription.setId(moduleAnnotation.id());
			this.moduleDescription.setVersion(Version.valueOf(moduleAnnotation
					.version()));
		}
		this.moduleDescription.setDeclaredMethods(asList(this.getClass()
				.getMethods()));
	}

	@Override
	public void execute(String methodName, List<Variable> parameters) {
		Method method = findMethodBy(methodName);
		if (method != null) {
			invoke(method, parameters.toArray());
		} else {
			log("Method with name: " + methodName + " not found!");
		}
	}

	private Method findMethodBy(String methodName) {
		for (Method method : this.getClass().getMethods()) {
			if (method.getName().equals(methodName)) {
				return method;
			}
		}
		return null;
	}

	private void invoke(Method method, Object[] parameters) {
		if (method != null) {
			try {
				method.invoke(this, parameters);
			} catch (Exception e) {
				log(e.getMessage());
			}
		}
	}

	@Override
	public ModuleDescription getModuleDescription() {
		return moduleDescription;
	}

	public String toString() {
		return moduleDescription.toString();
	}

	@Override
	public boolean equals(Object module) {
		return false;
	}
}