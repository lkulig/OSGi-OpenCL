/**
 * Plik VString.java.
 * Autor: Maciej Milczarek
 * Utworzono Aug 20, 2011.
 */
package gdts.common.data.type;

/**
 * Klasa reprezentująca proste zmienne typu VString (łańcuchy znaków).
 * 
 * @author Maciej Milczarek
 */
public class VString extends Variable {

	private static final long serialVersionUID = 8814453044593980869L;

	String value;
	
	public VString() {
		this.value = null;
	}
	
	public VString(String value) {
		this.value = new String(value);
	}
	
	@Override
	public void setValue(Variable value) {
		
		this.value = value.toString();
	}

	@Override
	public Variable duplicate() {
		if(this.value != null) {
			return new VString(this.value);
		}
		return null;
	}

	@Override
	public String toString() {
		return new String(value);
	}

	/* (non-Javadoc)
	 * @see gdts.common.data.type.Variable#isNull()
	 */
	@Override
	public boolean isNull() {
		return value == null;
	}
}
