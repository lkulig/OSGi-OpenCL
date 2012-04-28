package gdts.common.data.type;

/**
 * Klasa reprezentująca proste zmiennoprzecinkowe zmienne rzeczywiste typu VFloat.
 * 
 * @author Maciej Milczarek
 */
public class VFloat extends VNumeric {

	private static final long serialVersionUID = 6142887010484555002L;

	Double value;

	public VFloat() {
		value = null;
	}
	
	public VFloat(double value) {
		this.value = new Double(value);
	}

	public VFloat(Double value) {
		this.value = new Double(value.doubleValue());
	}

	public VFloat(VFloat value) {
		this.value = new Double(value.doubleValue());
	}

	@Override
	public void setValue(Variable value) {
		if (value == null) {
			this.value = null;
		} else {
			this.value = ((VFloat) value).doubleValue();
		}
	}

	public double doubleValue() {
		if (value != null) {
			return value.doubleValue();
		} else {
			throw new NullPointerException("VFloat value is null!");
		}
	}

	public VInteger toVInteger() {
		if (value != null) {
			return new VInteger(value.longValue());
		} else {
			throw new NullPointerException("VFloat is null!");
		}
	}

	@Override
	public Variable duplicate() {
		if (value != null) {
			return new VFloat(value.doubleValue());
		}
		return null;
	}
	
	@Override 
	public String toString() {
		StringBuilder sb = new StringBuilder("FLOAT<");
		sb.append(value);
		sb.append('>');
		
		return sb.toString();
	}
	
	public static VFloat valueOf(VInteger var) {
		return new VFloat(var.longValue());
	}

	@Override
	public VNumeric cast(VNumeric toCast) {
		if (toCast instanceof VFloat) {
			return (VNumeric) toCast.duplicate();
		}
		if (toCast instanceof VInteger) {
			return VFloat.valueOf((VInteger) toCast);
		}
		throw new ClassCastException("Cannot cast from "
				+ toCast.getClass().getSimpleName() + " to VInteger!");
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((value == null) ? 0 : value.hashCode());
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
		VFloat other = (VFloat) obj;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see gdts.common.data.type.Variable#isNull()
	 */
	@Override
	public boolean isNull() {
		return value == null;
	}
}
