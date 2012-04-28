package gdts.common;

import java.io.Serializable;

import gdts.common.exception.InvalidVersionException;

/**
 * Klasa określająca wersję modułów wykonawczych i Zadań.
 * 
 * @author Maciej Milczarek
 */
public class Version implements Serializable {

	private static final long serialVersionUID = 7476594481227836745L;
	
	private int primary;
	private int secondary;
	private int additional;

	public Version(int primary) {
		this(primary, 0);
	}

	public Version(int primary, int secondary) {
		this(primary, secondary, 0);
	}

	public Version(int primary, int secondary, int additional) {

		this.primary = primary;
		this.secondary = secondary;
		this.additional = additional;
	}

	public int getPrimary() {
		return primary;
	}

	public void setPrimary(int primary) {
		this.primary = primary;
	}

	public int getSecondary() {
		return secondary;
	}

	public void setSecondary(int secondary) {
		this.secondary = secondary;
	}

	public int getAdditional() {
		return additional;
	}

	public void setAdditional(int additional) {
		this.additional = additional;
	}

	public boolean isGreaterThen(Version version) {
		if (this.primary > version.getPrimary()) {
			return true;
		}
		if (this.secondary > version.getSecondary()) {
			return true;
		}
		if (this.additional > version.getAdditional()) {
			return true;
		}

		return false;
	}

	public boolean isLessThen(Version version) {
		if (this.primary < version.getPrimary()) {
			return true;
		}
		if (this.secondary < version.getSecondary()) {
			return true;
		}
		if (this.additional < version.getAdditional()) {
			return true;
		}

		return false;
	}

	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + additional;
		result = prime * result + primary;
		result = prime * result + secondary;
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
		Version other = (Version) obj;
		if (additional != other.additional)
			return false;
		if (primary != other.primary)
			return false;
		if (secondary != other.secondary)
			return false;
		return true;
	}

	/**
	 * Metoda statyczna do konwersji werji zapisanej w postaci stringa
	 * do obiektu klasy Version.
	 * 
	 * @param version Wersja w postaci "a.b.c".
	 * @return Obiekt klasy wersji.
	 * @throws InvalidVersionException Wyjątek jest rzucany, jeśli podany format jest niepoprawny.
	 */
	public static Version valueOf(String version) throws InvalidVersionException {
		
		if(version == null || version.equals("")) {
			return null;
		}
		
		String[] verArray = version.split("\\.");
		if (verArray.length == 1) {
			return new Version(Integer.parseInt(verArray[0]));
		} else if (verArray.length == 2) {
			return new Version(Integer.parseInt(verArray[0]),
					Integer.parseInt(verArray[1]));
		} else if (verArray.length == 3) {
			return new Version(Integer.parseInt(verArray[0]),
					Integer.parseInt(verArray[1]),
					Integer.parseInt(verArray[2]));
		} else {
			throw new InvalidVersionException();
		}
	}

	@Override
	public String toString() {
		return primary + "." + secondary + "." + additional;
	}

}
