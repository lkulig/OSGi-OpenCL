package gdts.common.data.type;

import gdts.common.data.VarType;

import java.util.ArrayList;
import java.util.List;

/**
 * Klasa reprezentująca zmienne typu kontenerowego VArray (tablica).
 * 
 * @author Maciej Milczarek
 */
public class VArray extends VContainer {

	private static final long serialVersionUID = 3943136036169788329L;

	private List<Variable> value = new ArrayList<Variable>();
	private VarType elementType;

	public VArray(VarType elementType) {
		this.elementType = elementType;
	}

	public VArray(VArray array) {
		this.value = new ArrayList<Variable>();
		for (Variable var : ((VArray) array).asList()) {
			this.value.add(var.duplicate());
		}
		this.elementType = array.getElementType();
	}

	@Override
	public void setValue(Variable value) {
		this.value = ((VArray) value.duplicate()).asList();
	}

	@Override
	public Variable duplicate() {
		return new VArray(this);
	}

	public void add(Variable value) {
		this.value.add(value);
	}

	public int size() {
		return this.value.size();
	}

	public Variable getElementAt(int index) {
		return value.get(index);
	}
	

	public Variable getElementAt(VInteger index) {
		return this.getElementAt((int)index.longValue());
	}

	public List<Variable> asList() {
		return this.value;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see gdts.common.data.type.VContainer#setElementType(java.lang.Class)
	 */
	@Override
	public void setElementType(VarType elementType) {
		this.elementType = elementType;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see gdts.common.data.type.VContainer#getElementType()
	 */
	@Override
	public VarType getElementType() {
		return this.elementType;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * gdts.common.data.type.VContainer#fill(gdts.common.data.type.Variable)
	 */
	@Override
	public void fill(Variable var) {
		for (int i = 0; i < value.size(); i++) {
			value.set(i, var.duplicate());
		}
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("VARRAY<");
		for (int i = 0; i < this.size(); i++) {
			sb.append(value.get(i));
			if(i + 1 != this.size()) {
				sb.append(", ");
			}
		}
		sb.append(">");

		return sb.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((elementType == null) ? 0 : elementType.hashCode());
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
		VArray other = (VArray) obj;
		if (elementType != other.elementType)
			return false;
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
		// TODO Auto-generated method stub
		return false;
	}

}
