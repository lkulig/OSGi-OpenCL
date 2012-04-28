/**
 * Plik MatrixOperationsTest.java.
 * Autor: Maciej Milczarek
 * Utworzono Aug 28, 2011.
 */
package gdts.module.matrixoperations.test;

import static org.junit.Assert.assertEquals;
import gdts.common.data.VarType;
import gdts.common.data.type.VArray;
import gdts.common.data.type.VInteger;
import gdts.common.data.type.VMatrix;
import gdts.common.util.Util;
import gdts.module.matrixoperations.MatrixOperations;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * MatrixOperationsTest
 *
 */
public class MatrixOperationsTest {

	private long[][] firstMatrixArray = new long[][]
			{{1, 0, 2},
			{-1, 3, 1}};
	
	private long[][] secondMatrixArray = new long[][]
			{{3, 1},
			{2, 1},
			{1, 0}};
	
	private VMatrix firstMatrix;
	private VMatrix secondMatrix;
	
	private static MatrixOperations mo;
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		mo = new MatrixOperations();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		
		firstMatrix = VMatrix.valueOf(Util.arrayCast(firstMatrixArray));
		secondMatrix = VMatrix.valueOf(Util.arrayCast(secondMatrixArray));
	}

	/**
	 * Test method for {@link gdts.module.matrixoperations.MatrixOperations#verifyInput(gdts.common.data.type.VMatrix, gdts.common.data.type.VMatrix, gdts.common.data.type.VInteger)}.
	 */
	@Test
	public void testVerifyInput() {
		
		VInteger resultMatrixSize = new VInteger();
		mo.verifyInput(firstMatrix, secondMatrix, resultMatrixSize);
		
		assertEquals(new VInteger(2), resultMatrixSize);
	}

	/**
	 * Test method for {@link gdts.module.matrixoperations.MatrixOperations#sliceMatrixToMultiply(gdts.common.data.type.VMatrix, gdts.common.data.type.VMatrix, gdts.common.data.type.VArray, gdts.common.data.type.VArray)}.
	 */
	@Test
	public void testSliceMatrixToMultiply() {
		
		VArray vectorsFromFirst = new VArray(VarType.ARRAY);
		VArray vectorsFromSecond = new VArray(VarType.ARRAY);
		
		mo.sliceMatrixToMultiply(firstMatrix, secondMatrix, vectorsFromFirst, vectorsFromSecond);
		
		assertEquals(new VInteger(1), ((VArray)vectorsFromFirst.getElementAt(0)).getElementAt(0));
		assertEquals(new VInteger(0), ((VArray)vectorsFromFirst.getElementAt(0)).getElementAt(1));
		assertEquals(new VInteger(2), ((VArray)vectorsFromFirst.getElementAt(0)).getElementAt(2));
		
		assertEquals(new VInteger(-1), ((VArray)vectorsFromFirst.getElementAt(1)).getElementAt(0));
		assertEquals(new VInteger(3), ((VArray)vectorsFromFirst.getElementAt(1)).getElementAt(1));
		assertEquals(new VInteger(1), ((VArray)vectorsFromFirst.getElementAt(1)).getElementAt(2));
		
		assertEquals(new VInteger(3), ((VArray)vectorsFromSecond.getElementAt(0)).getElementAt(0));
		assertEquals(new VInteger(2), ((VArray)vectorsFromSecond.getElementAt(0)).getElementAt(1));
		assertEquals(new VInteger(1), ((VArray)vectorsFromSecond.getElementAt(0)).getElementAt(2));
		
		assertEquals(new VInteger(1), ((VArray)vectorsFromSecond.getElementAt(1)).getElementAt(0));
		assertEquals(new VInteger(1), ((VArray)vectorsFromSecond.getElementAt(1)).getElementAt(1));
		assertEquals(new VInteger(0), ((VArray)vectorsFromSecond.getElementAt(1)).getElementAt(2));
	}

	/**
	 * Test method for {@link gdts.module.matrixoperations.MatrixOperations#multiplyVectors(gdts.common.data.type.VArray, gdts.common.data.type.VArray, gdts.common.data.type.VInteger)}.
	 */
	@Test
	public void testMultiplyVectors() {
		
		VInteger result00 = new VInteger();
		VInteger result01 = new VInteger();
		VInteger result10 = new VInteger();
		VInteger result11 = new VInteger();
		
		VArray vectorsFromFirst = new VArray(VarType.ARRAY);
		VArray vectorsFromSecond = new VArray(VarType.ARRAY);
		
		mo.sliceMatrixToMultiply(firstMatrix, secondMatrix, vectorsFromFirst, vectorsFromSecond);
		mo.multiplyVectors((VArray)vectorsFromFirst.getElementAt(0), (VArray)vectorsFromSecond.getElementAt(0), result00);
		mo.multiplyVectors((VArray)vectorsFromFirst.getElementAt(0), (VArray)vectorsFromSecond.getElementAt(1), result01);
		mo.multiplyVectors((VArray)vectorsFromFirst.getElementAt(1), (VArray)vectorsFromSecond.getElementAt(0), result10);
		mo.multiplyVectors((VArray)vectorsFromFirst.getElementAt(1), (VArray)vectorsFromSecond.getElementAt(1), result11);
		
		assertEquals(new VInteger(5), result00);
		assertEquals(new VInteger(1), result01);
		assertEquals(new VInteger(4), result10);
		assertEquals(new VInteger(2), result11);
	}

}
