package gdts.common.data.type;

/**
 * Klasa reprezentująca proste zmienne boolowskie typu VBoolean.
 * 
 * @author Maciej Milczarek
 */
public class VBoolean extends Variable {

	private static final long serialVersionUID = 8991055281079601905L;

	Boolean value;
	
	public VBoolean() {
		value = null;
	}
	
	public VBoolean(Boolean value) {
		this.value = value;
	}
	
	
	
	public boolean booleanValue() {
		if(value != null) {
			return value.booleanValue();
		} else {
			throw new NullPointerException("VBoolean value is null!");
		}
	}
	
	@Override
	public void setValue(Variable value) {
		if(value == null) {
			value = null;
		} else {
			this.value = ((VBoolean) value).booleanValue();	
		}
	}

	@Override
	public Variable duplicate() {
		if(value != null) {
			return new VBoolean(value.booleanValue());
		}
		return new VBoolean();
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("BOOLEAN<");
		sb.append(value);
		sb.append('>');
		
		return sb.toString();
	}

	/* (non-Javadoc)
	 * @see gdts.common.data.type.Variable#isNull()
	 */
	@Override
	public boolean isNull() {
		return value == null;
	}
}
