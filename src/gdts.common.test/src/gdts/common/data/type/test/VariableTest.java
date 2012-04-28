/**
 * Plik VariableTest.java.
 * Autor: Maciej Milczarek
 * Utworzono Aug 23, 2011.
 */
package gdts.common.data.type.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import gdts.common.data.VarType;
import gdts.common.data.type.VArray;
import gdts.common.data.type.VBoolean;
import gdts.common.data.type.VContainer;
import gdts.common.data.type.VFloat;
import gdts.common.data.type.VInteger;
import gdts.common.data.type.VMatrix;
import gdts.common.data.type.VString;
import gdts.common.data.type.Variable;

import org.junit.Before;
import org.junit.Test;

/**
 * VariableTest
 *
 */
public class VariableTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * Test method for {@link gdts.common.data.type.Variable#createSimple(java.lang.String)}.
	 */
	@Test
	public void testCreateSimpleString() {
		assertTrue(Variable.createSimple("INTEGER") instanceof VInteger);
		assertTrue(Variable.createSimple("FLOAT") instanceof VFloat);
		assertTrue(Variable.createSimple("BOOLEAN") instanceof VBoolean);
	}

	/**
	 * Test method for {@link gdts.common.data.type.Variable#createSimple(gdts.common.data.VarType)}.
	 */
	@Test
	public void testCreateSimpleVarType() {
		assertTrue(Variable.createSimple(VarType.INTEGER) instanceof VInteger);
		assertTrue(Variable.createSimple(VarType.FLOAT) instanceof VFloat);
		assertTrue(Variable.createSimple(VarType.BOOLEAN) instanceof VBoolean);
	}

	/**
	 * Test method for {@link gdts.common.data.type.Variable#createContainer(java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testCreateContainerStringString() {
		VContainer array = Variable.createContainer("ARRAY", "INTEGER");
		assertTrue(array instanceof VArray);
		assertTrue(array.getElementType() == VarType.INTEGER);
		
		VContainer matrix = Variable.createContainer("MATRIX", "INTEGER");
		assertTrue(matrix instanceof VMatrix);
		assertTrue(matrix.getElementType() == VarType.INTEGER);
	}

	/**
	 * Test method for {@link gdts.common.data.type.Variable#createContainer(gdts.common.data.VarType, gdts.common.data.VarType)}.
	 */
	@Test
	public void testCreateContainerVarTypeVarType() {
		VContainer array = Variable.createContainer(VarType.ARRAY, VarType.FLOAT);
		assertTrue(array instanceof VArray);
		assertTrue(array.getElementType() == VarType.FLOAT);
		
		VContainer matrix = Variable.createContainer(VarType.MATRIX, VarType.FLOAT);
		assertTrue(matrix instanceof VMatrix);
		assertTrue(matrix.getElementType() == VarType.FLOAT);
	}

	/**
	 * Test method for {@link gdts.common.data.type.Variable#createByValue(java.lang.String)}.
	 */
	@Test
	public void testCreateByValue() {
		
		VInteger int1 = (VInteger)Variable.createByValue("-12");
		VInteger int2 = (VInteger)Variable.createByValue("5");
		
		assertNotNull(int1);
		assertNotNull(int2);
		assertEquals(-12, int1.longValue());
		assertEquals(5, int2.longValue());
		
		VFloat float1 = (VFloat)Variable.createByValue("-12.0");
		VFloat float2 = (VFloat)Variable.createByValue("5.0");
		VFloat float3 = (VFloat)Variable.createByValue(".003");
		VFloat float4 = (VFloat)Variable.createByValue("-.003");
		
		assertNotNull(float1);
		assertNotNull(float2);
		assertNotNull(float3);
		assertNull(float4);
		assertEquals(-12.0, float1.doubleValue(), 0);
		assertEquals(5.0, float2.doubleValue(), 0);
		assertEquals(0.003, float3.doubleValue(), 0);
		
		VString string1 = (VString)Variable.createByValue("\"some string\"");
		VString string2 = (VString)Variable.createByValue("\"\"");
		
		assertNotNull(string1);
		assertNotNull(string2);
		assertEquals("some string", string1.toString());
		assertEquals("", string2.toString());
		
		VBoolean boolean1 = (VBoolean)Variable.createByValue("TRUE");
		VBoolean boolean2 = (VBoolean)Variable.createByValue("FALSE");
		
		assertNotNull(boolean1);
		assertNotNull(boolean2);
		assertTrue(boolean1.booleanValue());
		assertTrue(!boolean2.booleanValue());
	}
}
