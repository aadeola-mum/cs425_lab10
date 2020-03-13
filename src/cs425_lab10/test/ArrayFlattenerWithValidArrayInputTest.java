/**
 * 
 */
package cs425_lab10.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import cs425_lab10.arrayFlattener.ArrayFlattener;

/**
 * @author miu
 *
 */
public class ArrayFlattenerWithValidArrayInputTest {

	ArrayFlattener af;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		af = new ArrayFlattener();
	}

	/**
	 * Test method for {@link cs425_lab10.arrayFlattener.ArrayFlattener#flattenArray(int[][])}.
	 */
	@Test
	public void testFlattenArray() {
		int a [] = {1,2,6};
	    int b [] = {55,2};
	    int c [] = {33};
	    int arr [][] = new int[][]{a,b,c};
	    
	    int[] result = af.flattenArray(arr);
	    int[] expected = {1, 2, 6, 55, 2, 33};
		
	    assertArrayEquals(expected, result);
	}

}
