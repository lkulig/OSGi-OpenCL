package gdts.common.util;

import java.io.File;
import java.io.FilenameFilter;

/**
 * Klasa filtra dla podanego rozszerzenia plików.
 * 
 * @author Maciej Milczarek
 */
public class ExtensionFilenameFilter implements FilenameFilter {

	private final String fileExtension;
	
	/**
	 * @param fileExtension Rozszerzenie wg którego następować będzie filtrowanie.
	 */
	public ExtensionFilenameFilter(String fileExtension) {
		this.fileExtension = fileExtension;
	}
	
	@Override
	public boolean accept(File dir, String name) {
		if(name.endsWith("." + fileExtension)) {
			return true;
		} else {
			return false;
		}
	}

}
