package gdts.common.module;

import gdts.common.Version;

import java.io.File;
import java.io.Serializable;

/**
 * Deskryptor Zadania. Przechowuje informacje o jego identyfikatorze,
 * wersji oraz może być uzupełniony o plik zadania w postaci instancji java.io.File.
 * 
 * @author Maciej Milczarek
 */
public class TaskDescriptor implements Serializable {

	private static final long serialVersionUID = 8865706296758250711L;

	private String id;
	private Version version;
	private File taskFile;

	/**
	 * @param id Identyfikator Zadania.
	 * @param version Wersja Zadania w postaci tekstowej.
	 */
	public TaskDescriptor(String id, String version) {
		this(id, Version.valueOf(version));
	}
	
	/**
	 * @param id Identyfikator Zadania.
	 * @param version Wersja Zadania.
	 */
	public TaskDescriptor(String id, Version version) {
		this.id = id;
		this.version = version;
	}
	
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
	
	public File getTaskFile() {
		return taskFile;
	}

	public void setTaskFile(File taskFile) {
		this.taskFile = taskFile;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((version == null) ? 0 : version.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TaskDescriptor other = (TaskDescriptor) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (version == null) {
			if (other.version != null)
				return false;
		} else if (!version.equals(other.version))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return id + "-" + version;
	}
}
