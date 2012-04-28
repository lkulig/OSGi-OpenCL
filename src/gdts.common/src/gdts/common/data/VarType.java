package gdts.common.data;

import gdts.common.data.type.VArray;
import gdts.common.data.type.VBoolean;
import gdts.common.data.type.VFloat;
import gdts.common.data.type.VInteger;
import gdts.common.data.type.VMatrix;
import gdts.common.data.type.VSlave;
import gdts.common.data.type.VSlaveTask;
import gdts.common.data.type.Variable;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Określa typy danych systemu GDTS i zapewnia pewne metody narzędziowe.
 * 
 * @author Maciej Milczarek
 */
public enum VarType {

	/**
	 * Typ dla liczb całkowitych, koresponduje z typem java.lang.Integer.
	 */
	INTEGER, 
	
	/**
	 * Typ dla liczb rzeczywistych, zmiennoprzecinkowych - koresponduje
	 * z typem java.lang.Double.
	 */
	FLOAT,
	
	/**
	 * Typ wartości boolowskich, koresponduje z typem java.lang.Boolean.
	 */
	BOOLEAN, 
	
	/**
	 * Typ łańcuchów znaków, koresponduje z typem java.lang.String.
	 */
	STRING,
	
	/**
	 * Typ reprezentujący Wykonawcę.
	 */
	SLAVEOBJ,
	
	/**
	 * Typ reprezentujący Podzadanie.
	 */
	SLAVETASKOBJ,
	
	/**
	 * Typ tablicowy.
	 */
	ARRAY, 
	
	/**
	 * Typ macierzowy (dwuwymiarowa tablica).
	 */
	MATRIX, 
	
	/**
	 * Kategoria typów prostych, w jej skład wchodzi {@link #INTEGER}, {@link #FLOAT}, {@link #BOOLEAN} i {@link #STRING}.
	 */
	SIMPLE,
	
	/**
	 * Kategoria typów kontenerowych, w jej skład wchodzi {@link #ARRAY} i {@link #MATRIX}.
	 */
	CONTAINER,
	
	/**
	 * Kategoria typów numerycznych, w jej skład wchodzi {@link #INTEGER} i {@link #FLOAT}.
	 */
	NUMERIC;
	
	private static Set<VarType> simple = new HashSet<VarType>();
	private static Set<VarType> container = new HashSet<VarType>();
	private static Set<VarType> numeric = new HashSet<VarType>();
	
	private static Map<String, VarType> all = new HashMap<String, VarType>();
	private static Map<VarType, Class<? extends Variable>> typeAssoc = new HashMap<VarType, Class<? extends Variable>>();
	
	static {
		simple.add(INTEGER);
		all.put("VInteger", INTEGER);
		simple.add(FLOAT);
		all.put("VFloat", FLOAT);
		simple.add(BOOLEAN);
		all.put("VBoolean", BOOLEAN);
		simple.add(SLAVEOBJ);
		all.put("VSlave", SLAVEOBJ);
		simple.add(SLAVETASKOBJ);
		all.put("VSlaveTask", SLAVETASKOBJ);
		
		container.add(ARRAY);
		container.add(MATRIX);
		
		numeric.add(INTEGER);
		numeric.add(FLOAT);
		
		for(VarType varType : VarType.values()) {
			all.put(varType.toString(), varType);
		}
		
		typeAssoc.put(INTEGER, VInteger.class);
		typeAssoc.put(FLOAT, VFloat.class);
		typeAssoc.put(BOOLEAN, VBoolean.class);
		typeAssoc.put(SLAVEOBJ, VSlave.class);
		typeAssoc.put(SLAVETASKOBJ, VSlaveTask.class);
		typeAssoc.put(ARRAY, VArray.class);
		typeAssoc.put(MATRIX, VMatrix.class);
	}
	
	/**
	 * Sprawdza, czy dany typ jest typem prostym.
	 * 
	 * @param type Typ do sprawdzenia.
	 * @return true jeśli podany typ jest typem prostym; w przeciwnym wypadku false
	 */
	public static boolean isSimple(VarType type) {
		return simple.contains(type);
	}
	
	/**
	 * Sprawdza, czy dany typ jest typem kontenerowym.
	 * 
	 * @param type Typ do sprawdzenia.
	 * @return true jeśli podany typ jest typem kontenerowym; w przeciwnym wypadku false
	 */
	public static boolean isContainer(VarType type) {
		return container.contains(type);
	}
	
	/**
	 * Sprawdza, czy podany typ jest typem numerycznym.
	 * 
	 * @param type Typ do sprawdzenia.
	 * @return true jeśli podany typo jest typem numerycznym; w przeciwnym wypadku false
	 */
	public static boolean isNumeric(VarType type) {
		return numeric.contains(type);
	}
	
	/**
	 * Sprawdza, czy typ o podanej nazwie jest typem prostym.
	 * 
	 * @param type nazwa typu do sprawdzenia.
	 * @return true jeśli podany typ jest typem prostym; w przeciwnym wypadku false
	 */
	public static boolean isSimple(String type) {
		return simple.contains(getVarType(type));
	}
	
	/**
	 * Sprawdza, czy typ o podanej nazwie jest typem kontenerowym.
	 * 
	 * @param type nazwa typu do sprawdzenia.
	 * @return true jeśli podany typ jest typem kontenerowym; w przeciwnym wypadku false
	 */
	public static boolean isContainer(String type) {
		return container.contains(getVarType(type));
	}
	
	/**
	 * Sprawdza, czy typ o podanej nazwie jest typem numerycznym.
	 * 
	 * @param type nazwa typu do sprawdzenia.
	 * @return true jeśli podany typo jest typem numerycznym; w przeciwnym wypadku false
	 */
	public static boolean isNumeric(String type) {
		return numeric.contains(getVarType(type));
	}
	
	/**
	 * Zwraca wartość VarType dla podanej nazwy typu.
	 * 
	 * @param name Nazwa typu.
	 * @return Odpowiednia wartość VarType typu.
	 */
	public static VarType getVarType(String name) {
		return all.get(name);
	}
	
	/**
	 * Zwraca obiekt Class dla podanego typu.
	 * 
	 * @param type Wartość VarType dla typu.
	 * @return Obiekt Class danego typu.
	 */
	public static Class<? extends Variable> getVarClass(VarType type) {
		return typeAssoc.get(type);
	}
	
	/**
	 * Zwraca obiekt Class dla typu o podanej nazwie.
	 * 
	 * @param type Wartość VarType dla typu o podanej nazwie.
	 * @return Obiekt Class danego typu.
	 */
	public static Class<? extends Variable> getVarClass(String type) {
		return typeAssoc.get(getVarType(type));
	}
}
