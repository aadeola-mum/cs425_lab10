package cs425_lab10.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import cs425_lab10.arrayFlattener.ArrayFlattener;

public class ArrayFlattenerWithNullArrayInputTest {

	ArrayFlattener af;
	@Before
	public void setUp() throws Exception {
		af = new ArrayFlattener();
	}

	@Test
	public void test() {
		int[] result = af.flattenArray(null);
		int[] expected = null;
		
		assertArrayEquals(expected, result);
	}

}
