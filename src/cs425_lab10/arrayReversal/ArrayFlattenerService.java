package cs425_lab10.arrayReversal;

import java.util.Arrays;

public class ArrayFlattenerService {
	
	public ArrayFlattenerService() {
		
	}
	public int[] flattenArray(int[][] arr) {
		int[] flatArr = null;
		if(arr != null)
			flatArr = Arrays.stream(arr).flatMapToInt(Arrays::stream).toArray();
		return flatArr;
	}
}
