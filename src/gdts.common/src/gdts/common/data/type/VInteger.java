package gdts.common.data.type;

/**
 * Klasa reprezentująca proste zmienne całkowite typu VInteger.
 * 
 * @author Maciej Milczarek
 */
public class VInteger extends VNumeric {

	private static final long serialVersionUID = 7547255363438328958L;

	Long value;

	public VInteger() {
		value = null;
	}

	public VInteger(long value) {
		this(new Long(value));
	}

	public VInteger(Long value) {
		this.value = new Long(value.longValue());
	}

	@Override
	public void setValue(Variable value) {
		if (value == null) {
			value = null;
		} else {
			this.value = ((VInteger) value).longValue();
		}
	}

	public VInteger add(VInteger toAdd) {
		return VInteger.add(this, toAdd);
	}

	public VInteger substract(VInteger toSub) {
		return VInteger.substract(this, toSub);
	}

	public static VInteger add(VInteger first, VInteger second) {
		return new VInteger(first.longValue() + second.longValue());
	}

	public static VInteger substract(VInteger first, VInteger second) {
		return new VInteger(first.longValue() - second.longValue());
	}

	public static VInteger valueOf(VFloat value) {
		return new VInteger(Math.round(value.doubleValue()));
	}

	public long longValue() {
		if (value != null) {
			return value.longValue();
		} else {
			throw new NullPointerException("VInteger is null!");
		}
	}

	public VFloat toVFloat() {
		if (value != null) {
			return new VFloat(value.doubleValue());
		} else {
			throw new NullPointerException("VInteger is null!");
		}
	}
	
	@Override
	public VNumeric cast(VNumeric toCast) {
		if (toCast instanceof VInteger) {
			return (VNumeric) toCast.duplicate();
		}
		if (toCast instanceof VFloat) {
			return VInteger.valueOf((VFloat) toCast);
		}
		throw new ClassCastException("Cannot cast from "
				+ toCast.getClass().getSimpleName() + " to VInteger!");
	}

	@Override
	public Variable duplicate() {
		if (value != null) {
			return new VInteger(value.longValue());
		}
		return new VInteger();
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("INTEGER<");
		sb.append(value);
		sb.append('>');
		
		return sb.toString();
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
		VInteger other = (VInteger) obj;
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
