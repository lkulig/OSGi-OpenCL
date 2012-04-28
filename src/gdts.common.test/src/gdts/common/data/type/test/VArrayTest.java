/**
 * Plik VArrayTest.java.
 * Autor: Maciej Milczarek
 * Utworzono Aug 23, 2011.
 */
package gdts.common.data.type.test;

import static org.junit.Assert.*;
import gdts.common.data.VarType;
import gdts.common.data.type.VArray;
import gdts.common.data.type.VInteger;
import gdts.common.data.type.Variable;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

/**
 * VArrayTest
 *
 */
public class VArrayTest {

	VArray arrayOfInteger = new VArray(VarType.INTEGER);
	VInteger element0 = new VInteger(10);
	VInteger element1 = new VInteger(20);
	VInteger element2 = new VInteger(-23);
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		arrayOfInteger.add(element0);
		arrayOfInteger.add(element1);
		arrayOfInteger.add(element2);
	}

	
	/**
	 * Test method for {@link gdts.common.data.type.VArray#VArray(gdts.common.data.type.VArray)}.
	 */
	@Test
	public void testVArrayVArray() {
		
		VArray array = new VArray(arrayOfInteger);
		
		assertNotSame(arrayOfInteger, array);
		assertEquals(arrayOfInteger.size(), array.size());
		assertEquals(arrayOfInteger.getElementType(), array.getElementType());
		
		assertNotSame(arrayOfInteger.getElementAt(0), array.getElementAt(0));
		assertEquals(arrayOfInteger.getElementAt(0), array.getElementAt(0));
		assertNotSame(arrayOfInteger.getElementAt(1), array.getElementAt(1));
		assertEquals(arrayOfInteger.getElementAt(1), array.getElementAt(1));
		assertNotSame(arrayOfInteger.getElementAt(2), array.getElementAt(2));
		assertEquals(arrayOfInteger.getElementAt(2), array.getElementAt(2));
	}

	
	/**
	 * Test method for {@link gdts.common.data.type.VArray#setValue(gdts.common.data.type.Variable)}.
	 */
	@Test
	public void testSetValue() {
		
		VArray array = new VArray(VarType.FLOAT);
		array.setValue(arrayOfInteger);
		
		assertEquals(3, arrayOfInteger.size());
		assertEquals(VarType.INTEGER, arrayOfInteger.getElementType());
		
		assertEquals(new VInteger(10), arrayOfInteger.getElementAt(0));
		assertEquals(new VInteger(20), arrayOfInteger.getElementAt(1));
		assertEquals(new VInteger(-23), arrayOfInteger.getElementAt(2));
	}

	/**
	 * Test method for {@link gdts.common.data.type.VArray#duplicate()}.
	 */
	@Test
	public void testDuplicate() {
		
		VArray array = (VArray)arrayOfInteger.duplicate();
		
		assertNotNull(array);
		assertEquals(3, array.size());
		assertEquals(new VInteger(10), array.getElementAt(0));
		assertEquals(new VInteger(20), array.getElementAt(1));
		assertEquals(new VInteger(-23), array.getElementAt(2));
		
		assertNotSame(arrayOfInteger.getElementAt(0), array.getElementAt(0));
		assertNotSame(arrayOfInteger.getElementAt(1), array.getElementAt(1));
		assertNotSame(arrayOfInteger.getElementAt(2), array.getElementAt(2));
	}

	/**
	 * Test method for {@link gdts.common.data.type.VArray#toString()}.
	 */
	@Test
	public void testToString() {
		assertEquals("VARRAY<INTEGER<10>, INTEGER<20>, INTEGER<-23>>", arrayOfInteger.toString());
	}

	/**
	 * Test method for {@link gdts.common.data.type.VArray#setElementType(gdts.common.data.VarType)}.
	 */
	@Test
	public void testSetElementType() {
		
		arrayOfInteger.setElementType(VarType.FLOAT);
		
		assertEquals(VarType.FLOAT, arrayOfInteger.getElementType());
	}

	/**
	 * Test method for {@link gdts.common.data.type.VArray#getElementType()}.
	 */
	@Test
	public void testGetElementType() {
		
		assertEquals(VarType.INTEGER, arrayOfInteger.getElementType());
	}

	/**
	 * Test method for {@link gdts.common.data.type.VArray#fill(gdts.common.data.type.Variable)}.
	 */
	@Test
	public void testFill() {
		
		arrayOfInteger.fill(new VInteger(5));
		
		assertEquals(new VInteger(5), arrayOfInteger.getElementAt(0));
		assertEquals(new VInteger(5), arrayOfInteger.getElementAt(1));
		assertEquals(new VInteger(5), arrayOfInteger.getElementAt(2));
		
		assertNotSame(arrayOfInteger.getElementAt(0), arrayOfInteger.getElementAt(2));
	}

	/**
	 * Test method for {@link gdts.common.data.type.VArray#add(gdts.common.data.type.Variable)}.
	 */
	@Test
	public void testAdd() {
		
		arrayOfInteger.add(new VInteger(234));
		arrayOfInteger.add(new VInteger(-434));
		
		assertEquals(5, arrayOfInteger.size());
		assertEquals(new VInteger(234), arrayOfInteger.getElementAt(3));
		assertEquals(new VInteger(-434), arrayOfInteger.getElementAt(4));
	}

	/**
	 * Test method for {@link gdts.common.data.type.VArray#size()}.
	 */
	@Test
	public void testSize() {
		
		assertEquals(3, arrayOfInteger.size());
		arrayOfInteger.add(new VInteger(4));
		assertEquals(4, arrayOfInteger.size());
	}

	/**
	 * Test method for {@link gdts.common.data.type.VArray#asList()}.
	 */
	@Test
	public void testAsList() {
		
		List<Variable> list = arrayOfInteger.asList();
		
		assertNotNull(list);
		assertEquals(3, list.size());
		
		assertSame(element0, list.get(0));
		assertSame(element1, list.get(1));
		assertSame(element2, list.get(2));
	}

}
