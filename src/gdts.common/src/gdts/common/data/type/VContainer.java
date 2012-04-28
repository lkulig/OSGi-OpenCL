package gdts.common.data.type;

import gdts.common.data.VarType;

/**
 * Klasa abstrakcyjna reprezentująca zmienne typów kontenerowych. 
 * 
 * @author Maciej Milczarek
 */
public abstract class VContainer extends Variable {
	
	private static final long serialVersionUID = -8495336345019767865L;
	
	/**
	 * Metoda ustawiająca typ elementów, które zmienna kontenerowa ma przechowywać.
	 * 
	 * @param elementType Typ elementów, które zmienna kontenerowa ma przechowywać.
	 */
	public abstract void setElementType(VarType elementType);
	
	/**
	 * Metoda zwracająca typ elementów przechowywanych przez zmienną kontenerową.
	 * 
	 * @return Typ elementów, które zmienna kontenerowa przechowuje.
	 */
	public abstract VarType getElementType();
	
	/**
	 * Metoda wypełniająca cały kontener wartościami podanej zmiennej.
	 * Każda komórka konteneru jest wypełniania osobną kopią podanej zmiennej.
	 * 
	 * @param var Zmienna, której wartościami należy wypełnić kontener. 
	 */
	public abstract void fill(Variable var);
	
	@Override
	public abstract boolean equals(Object obj);
	@Override
	public abstract int hashCode();
	
}
