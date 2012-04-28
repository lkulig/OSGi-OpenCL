package gdts.common.data.type;

/**
 * Klasa reprezentująca zmienne typu kontenerowego VMatrix (macierz).
 * 
 * @author Maciej Milczarek
 */
import java.util.Arrays;

import gdts.common.data.VarType;
import gdts.common.util.Util;

/**
 * @author Maciej Milczarek
 * Utworzono 10-08-2011
 * 
 */
public class VMatrix extends VContainer {

	private static final long serialVersionUID = 8616119750318183545L;

	private VNumeric[][] value = new VNumeric[0][0];
	private int height = 0;
	private int width = 0;
	private VarType elementType;

	public VMatrix(VarType elementType) {
		this.elementType = elementType;
	}
	
	public VMatrix(VMatrix matrix) {
		value = new VNumeric[matrix.getHeight()][matrix.getWidth()];
		this.height = matrix.getHeight();
		this.width = matrix.getWidth();
		for(int i = 0; i < height; i++) {
			for(int j = 0; j < width; j++) {
				value[i][j] = (VNumeric)matrix.getValueAt(i, j).duplicate();
			}
		}
	}
	
	public void resizeAndClean(int height, int width) {
		this.height = height;
		this.width = width;
		
		value = new VNumeric[height][width];
		this.fill(Variable.createSimple(this.elementType));
	}
	
	@Override
	public void setElementType(VarType elementType) {
		this.elementType = elementType;
		
	}

	@Override
	public VarType getElementType() {
		return elementType;
	}

	@Override
	public void fill(Variable var) {
		for(int i = 0; i < height; i++) {
			for(int j = 0; j < width; j++) {
				value[i][j] = (VNumeric)var.duplicate();
			}
		}
	}

	@Override
	public void setValue(Variable value) {
		this.value = Util.arrayCast(Util.arrayClone(((VMatrix)value).getValue()));
	}
	
	public void addRow(VArray array) {
		VNumeric[] newRow = new VNumeric[array.size()];
		for(int i = 0; i < array.size(); i++) {
			newRow[i] = (VNumeric)array.getElementAt(i);
		}
		value = Arrays.copyOf(value, value.length + 1);
		value[value.length - 1] = newRow;
		
		this.height = value.length;
		this.width = value[0].length;
	}
	
	public VNumeric[][] getValue() {
		return value;
	}
	
	public VNumeric getValueAt(int y, int x) {
		return value[y][x];
	}

	@Override
	public Variable duplicate() {
		return new VMatrix(this);
	}

	public int getHeight() {
		return height;
	}

	public int getWidth() {
		return width;
	}
	
	public VArray getRow(int index) {
		VArray vector = new VArray(this.elementType);
		for(int i = 0; i < this.width; i++) {
			vector.add(this.getValueAt(index, i));
		}
		
		return vector;
	}
	
	public VArray getColumn(int index) {
		VArray vector = new VArray(this.elementType);
		for(int i = 0; i < this.height; i++) {
			vector.add(this.getValueAt(i, index));
		}
		
		return vector;
	}
	
	public static VMatrix valueOf(VNumeric[][] array) {
		
		String typeName = array.getClass().getSimpleName();
		typeName = typeName.substring(0, typeName.length() - 4);
		
		VMatrix matrix = new VMatrix(VarType.getVarType(typeName));
		matrix.value = array;
		
		matrix.height = array.length;
		if(array.length > 0) {
			matrix.width = array[0].length;
		} else {
			matrix.width = 0;
		}
		
		return matrix;
	}

	public VMatrix transpone() {
		VNumeric[][] tArray = new VNumeric[this.width][this.height];
		
		for(int i = 0; i < this.height; i++) {
			for(int j = 0; j < this.width; j++) {
				tArray[j][i] = (VNumeric)value[i][j].duplicate();
			}
		}
		
		return VMatrix.valueOf(tArray);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("VMatrix<\n");
		for(int i = 0; i < this.height; i++) {
			for(int j = 0; j < this.width; j++) {
				sb.append(value[i][j]);
				sb.append('\t');
			}
			sb.append('\n');
		}
		sb.append(">\n");
		
		return sb.toString();
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((elementType == null) ? 0 : elementType.hashCode());
		result = prime * result + height;
		result = prime * result + Arrays.hashCode(value);
		result = prime * result + width;
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
		VMatrix other = (VMatrix) obj;
		if (elementType != other.elementType)
			return false;
		if (height != other.height)
			return false;
		if (!Arrays.equals(value, other.value))
			return false;
		if (width != other.width)
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
