package gdts.common.module;

import gdts.common.Version;

import java.util.Map;

/**
 * Deskryptor Modułu wykonawczego. Przechowuje informacje o jego identyfikatorze, wersji i
 * dostępnych komendach.
 * 
 * @author Maciej Milczarek
 */
public class ModuleDescr {
	
	private String id;
	private Version version;
	private Map<String, CommandDescr> commands;
	private ModuleDependency[] dependencies;
	
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

	public Map<String, CommandDescr> getCommands() {
		return commands;
	}

	public void setCommands(Map<String, CommandDescr> commands) {
		this.commands = commands;
	}

	public ModuleDependency[] getDependencies() {
		return dependencies;
	}

	public void setDependencies(ModuleDependency[] dependencies) {
		this.dependencies = dependencies;
	}	
	
	@Override
	public String toString() {
		return id + ": " + version;
	}
	
	@Override
	public boolean equals(Object module) {
		
		if(!(module instanceof ModuleDescr)) {
			return false;
		}
		
		if(((ModuleDescr)module).getId().equals(this.id) 
				&& ((ModuleDescr)module).getVersion().equals(this.version)) {
			return true;
		}
		
		return false;
	}	
}
