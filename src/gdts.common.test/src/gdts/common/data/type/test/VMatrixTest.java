/**
 * Plik VMatrixTest.java.
 * Autor: Maciej Milczarek
 * Utworzono Aug 23, 2011.
 */
package gdts.common.data.type.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import gdts.common.data.VarType;
import gdts.common.data.type.VArray;
import gdts.common.data.type.VInteger;
import gdts.common.data.type.VMatrix;
import gdts.common.util.Util;

import org.junit.Before;
import org.junit.Test;

/**
 * VMatrixTest
 * 
 */
public class VMatrixTest {

	long[][] matrixArray = new long[][] 
			{ { 15, 24, -3 }, 
			{ 3, -5, 1 } };;
	VMatrix matrix;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		matrix = VMatrix.valueOf(Util.arrayCast(matrixArray));
	}

	/**
	 * Test method for
	 * {@link gdts.common.data.type.VMatrix#setValue(gdts.common.data.type.Variable)}
	 * .
	 */
	@Test
	public void testSetValue() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link gdts.common.data.type.VMatrix#duplicate()}.
	 */
	@Test
	public void testDuplicate() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link gdts.common.data.type.VMatrix#toString()}.
	 */
	@Test
	public void testToString() {
		// VMatrix matrix = VMatrix.valueOf(Util.arrayCast(matrixArray));
		// System.out.println(matrix);
		fail("not yet implemented");
	}

	/**
	 * Test method for
	 * {@link gdts.common.data.type.VMatrix#setElementType(gdts.common.data.VarType)}
	 * .
	 */
	@Test
	public void testSetElementType() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link gdts.common.data.type.VMatrix#getElementType()}.
	 */
	@Test
	public void testGetElementType() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link gdts.common.data.type.VMatrix#fill(gdts.common.data.type.Variable)}
	 * .
	 */
	@Test
	public void testFill() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link gdts.common.data.type.VMatrix#VMatrix(gdts.common.data.VarType)}.
	 */
	@Test
	public void testVMatrixVarType() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link gdts.common.data.type.VMatrix#VMatrix(gdts.common.data.type.VMatrix)}
	 * .
	 */
	@Test
	public void testVMatrixVMatrix() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link gdts.common.data.type.VMatrix#getValue()}.
	 */
	@Test
	public void testGetValue() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link gdts.common.data.type.VMatrix#getValueAt(int, int)}.
	 */
	@Test
	public void testGetValueAt() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link gdts.common.data.type.VMatrix#getHeight()}.
	 */
	@Test
	public void testGetHeight() {
		assertEquals(2, matrix.getHeight());
	}

	/**
	 * Test method for {@link gdts.common.data.type.VMatrix#getWidth()}.
	 */
	@Test
	public void testGetWidth() {
		assertEquals(3, matrix.getWidth());
	}

	
	/**
	 * Test method for {@link gdts.common.data.type.VMatrix#getRow(int)}.
	 */
	@Test
	public void testGetRowInt() {
		VArray row0 = matrix.getRow(0);
		VArray row1 = matrix.getRow(1);
		
		assertEquals(3, row0.size());
		assertEquals(3, row1.size());
		
		assertEquals(new VInteger(15), row0.getElementAt(0));
		assertEquals(new VInteger(24), row0.getElementAt(1));
		assertEquals(new VInteger(-3), row0.getElementAt(2));
		
		assertEquals(new VInteger(3), row1.getElementAt(0));
		assertEquals(new VInteger(-5), row1.getElementAt(1));
		assertEquals(new VInteger(1), row1.getElementAt(2));
	}

	/**
	 * Test method for {@link gdts.common.data.type.VMatrix#getColumn(int)}.
	 */
	@Test
	public void testGetColumnInt() {
		
		VArray col0 = matrix.getColumn(0);
		VArray col1 = matrix.getColumn(1);
		VArray col2 = matrix.getColumn(2);
		
		assertEquals(2, col0.size());
		assertEquals(2, col1.size());
		assertEquals(2, col2.size());
		
		assertEquals(new VInteger(15), col0.getElementAt(0));
		assertEquals(new VInteger(3), col0.getElementAt(1));
		
		assertEquals(new VInteger(24), col1.getElementAt(0));
		assertEquals(new VInteger(-5), col1.getElementAt(1));
		
		assertEquals(new VInteger(-3), col2.getElementAt(0));
		assertEquals(new VInteger(1), col2.getElementAt(1));
	}


	/**
	 * Test method for
	 * {@link gdts.common.data.type.VMatrix#valueOf(gdts.common.data.type.VNumeric[][])}
	 * .
	 */
	@Test
	public void testValueOf() {

		assertEquals(VarType.INTEGER, matrix.getElementType());
		assertEquals(2, matrix.getHeight());
		assertEquals(3, matrix.getWidth());

		assertEquals(new VInteger(15), matrix.getValueAt(0, 0));
		assertEquals(new VInteger(24), matrix.getValueAt(0, 1));
		assertEquals(new VInteger(-3), matrix.getValueAt(0, 2));
		assertEquals(new VInteger(3), matrix.getValueAt(1, 0));
		assertEquals(new VInteger(-5), matrix.getValueAt(1, 1));
		assertEquals(new VInteger(1), matrix.getValueAt(1, 2));
	}

	/**
	 * Test method for {@link gdts.common.data.type.VMatrix#transpone()}.
	 */
	@Test
	public void testTranspone() {
		VMatrix tMatrix = matrix.transpone();

		assertEquals(VarType.INTEGER, matrix.getElementType());
		assertEquals(3, tMatrix.getHeight());
		assertEquals(2, tMatrix.getWidth());

		assertEquals(new VInteger(15), tMatrix.getValueAt(0, 0));
		assertEquals(new VInteger(3), tMatrix.getValueAt(0, 1));
		assertEquals(new VInteger(24), tMatrix.getValueAt(1, 0));
		assertEquals(new VInteger(-5), tMatrix.getValueAt(1, 1));
		assertEquals(new VInteger(-3), tMatrix.getValueAt(2, 0));
		assertEquals(new VInteger(1), tMatrix.getValueAt(2, 1));

	}

}
