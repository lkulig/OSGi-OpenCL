package gdts.common.util;

import gdts.common.exception.NotDirectoryException;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Tymczasowa klasa narzędziowa służąca do monitorowania zawartości katalogu.
 * Jej funkcjonalność na chwilę obecną pozwala jedynie na odczyt listy plików na żądanie.
 * Klasę należy doimplementować, bądź wykorzystać nowe funkcjonalności Javy 7.
 * 
 * @author Maciej Milczarek
 */
public class DirWatcher {

	File directory;
	FilenameFilter filter;

	/**
	 * @param directory Katalog do monitorowania.
	 * @param filter Filtr plików do monitorowania w katalogu.
	 * @throws NotDirectoryException Wyjątek rzucany, jeśli podany obiekt File nie jest katalogiem.
	 */
	public DirWatcher(File directory, FilenameFilter filter)
			throws NotDirectoryException {
		
		this.directory = directory;
		this.filter = filter;
		if (!directory.isDirectory()) {
			throw new NotDirectoryException();
		}
	}

	/**
	 * @param dirPath Ścieżka katalogu do monitorowania.
	 * @param filter Filtr plików do monitorowania w katalogu.
	 * @throws NotDirectoryException Wyjątek rzucany, jeśli podana ścieżka nie odnosi się do katalogu.
	 */
	public DirWatcher(String dirPath, FilenameFilter filter)
			throws NotDirectoryException {
		this(new File(dirPath), filter);
	}

	/**
	 * @return Lista plików o nazwach zgodnych z filtrem w monitorowanym katalogu.
	 */
	public List<File> getFiles() {
		List<File> files = new ArrayList<File>();
		Collections.addAll(files, directory.listFiles(filter));
		return files;
	}
}
