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

public class ArrayReversalWithNullInputTest {

	ArrayFlattenerService arrayFlattenerService = mock(ArrayFlattenerService.class);
	int arr [][] = null;
	
	@Before
	public void setUp() throws Exception {
	}
	
	
	@Test
	public void testReverseArray() {
		
	   
	    
	    when(arrayFlattenerService.flattenArray(arr)).thenReturn(null);
	    
	    ArrayReversor arReversor = new ArrayReversor(arrayFlattenerService);
	    
	    int[] expected = null;
	    int[] actual = arReversor.reverseArray(arr);
	    
	    assertArrayEquals(expected, actual);
	    
	    verify(arrayFlattenerService,times(1)).flattenArray(arr);
	}
	

}
