package gdts.common.logger;

import gdts.common.exception.GDTSException;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Prosta, tymczasowa klasa loggera. Obecnie wypisuje logi na standardowe wyjście, co w przypadku
 * Equinox z Eclipse Indigo 3.7 oznacza wypisanie ich na konsolę OSGi. Nie implementuje poziomów
 * logowania.
 * Każdy wpis na wyjściu poprzedzony jest timestampem.
 * Każdy wpis logu jest dodatkowo zapisywany do prywatnego obiektu typu StringBuffer.
 * 
 * @author Maciej Milczarek
 */
public class SimpleLogger {

	private static final DateFormat format; 
	private static final String FORMAT_PATTERN = "HH:mm:ss:SSS";
	
	private static StringBuffer logContents = new StringBuffer();
	
	static {
		format = new SimpleDateFormat(FORMAT_PATTERN);
	}
	
	private SimpleLogger(){}
	
	public static void log(String message) {
		SimpleLogger.log(message, null);
	}
	
	public static void log(String message, GDTSException exception) {
		StringBuffer buffer = new StringBuffer();
		buffer.append(getTime());
		buffer.append(": ");
		buffer.append(message);
		if(exception != null) {
			buffer.append(", cause: ");
			buffer.append(exception.getClass());
			buffer.append(": ");
			buffer.append(exception.getMessage() != null ? exception.getMessage() : "unknown");
		}
		buffer.append("\n");
		
		logContents.append(buffer);
		
		System.out.println(buffer);
	}
	
	private static StringBuffer getTime() {
		StringBuffer buffer = new StringBuffer();
		buffer.append(format.format(new Date(System.currentTimeMillis())));
		
		return buffer;
	}
}