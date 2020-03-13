package cs425_lab10.test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

import cs425_lab10.arrayReversal.ArrayFlattenerService;
import cs425_lab10.arrayReversal.ArrayReversor;

public class ArrayReversalWithValidInputTest {

	ArrayFlattenerService arrayFlattenerService = mock(ArrayFlattenerService.class);
	int arr [][] = null;
	
	@Before
	public void setUp() throws Exception {
		int a [] = {1,2,6};
	    int b [] = {55,2};
	    int c [] = {33};
	    arr = new int[][]{a,b,c};
	}


	@Test
	public void testReverseArray() {
	    
	    when(arrayFlattenerService.flattenArray(arr)).thenReturn(new int[] {1,2,6,55,2,33});
	    
	    ArrayReversor arReversor = new ArrayReversor(arrayFlattenerService);
	    
	    int[] expected = {33,2,55,6,2,1};
	    int[] actual = arReversor.reverseArray(arr);
	    
	    verify(arrayFlattenerService,times(1)).flattenArray(arr);
	    
	    assertArrayEquals(expected, actual);
	}

}
