package gdts.common.data.type;

import gdts.common.exception.CompareException;

/**
 * Klasa bazowa dla wszystkich typów numerycznych.
 * 
 * @author Maciej Milczarek
 */
public abstract class VNumeric extends Variable implements Comparable<VNumeric> {

	private static final long serialVersionUID = -6029855619777399439L;

	/**
	 * Metoda wykonująca rzutowanie wartości jednego typu numerycznego na inny, określony
	 * przez daną klasę rozszerzającą.
	 * 
	 * @param toCast Zmienna numeryczna do rzutowania.
	 * @return Wynik.
	 */
	public abstract VNumeric cast(VNumeric toCast);
	
	@Override
	public final int compareTo(VNumeric o) {
		Variable toCompare = this.cast(o);

		if (this instanceof VInteger) {
			VInteger var1 = (VInteger) this;
			VInteger var2 = (VInteger) toCompare;
			if (var1.longValue() < var2.longValue()) {
				return -1;
			}
			if (var1.longValue() == var2.longValue()) {
				return 0;
			}
			if (var1.longValue() > var2.longValue()) {
				return 1;
			}
		}
		if (this instanceof VFloat) {
			VFloat var1 = (VFloat) this;
			VFloat var2 = (VFloat) toCompare;
			if (var1.doubleValue() < var2.doubleValue()) {
				return -1;
			}
			if (var1.doubleValue() == var2.doubleValue()) {
				return 0;
			}
			if (var1.doubleValue() > var2.doubleValue()) {
				return 1;
			}
		}

		throw new CompareException(
				"Compare impossibile. Is compare implemented for numeric type "
						+ o.getClass().getSimpleName() + "?");
	}

	@Override
	public abstract boolean equals(Object obj);

	@Override
	public abstract int hashCode();
}
