package gdts.common.module;

import gdts.common.Version;

import java.lang.reflect.Method;
import java.util.Map;

/**
 * Deskryptor Modułu wykonawczego. Przechowuje informacje o jego
 * identyfikatorze, wersji i dostępnych komendach.
 * 
 * @author Maciej Milczarek
 */
public class ModuleDescription {

	private String id;
	private Version version;
	private Map<String, Method> declaredMethods;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Version getVersion() {
		return version;
	}

	public void setVersion(Version version) {
		this.version = version;
	}

	public Map<String, Method> getDeclaredMethods() {
		return declaredMethods;
	}

	public void setDeclaredMethods(Map<String, Method> methods) {
		this.declaredMethods = methods;
	}

	@Override
	public String toString() {
		return id + ": " + version;
	}

	@Override
	public boolean equals(Object module) {

		if (!(module instanceof ModuleDescription)) {
			return false;
		}

		if (((ModuleDescription) module).getId().equals(this.id)
				&& ((ModuleDescription) module).getVersion().equals(
						this.version)) {
			return true;
		}

		return false;
	}
}