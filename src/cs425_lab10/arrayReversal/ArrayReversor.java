package cs425_lab10.arrayReversal;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayReversor {
	
	ArrayFlattenerService afs;

	/**
	 * @param afs
	 */
	public ArrayReversor(ArrayFlattenerService afs) {
		super();
		this.afs = afs;
	}

	public static void main(String[] args) {
		int a [] = {1,2,6};
	    int b [] = {55,2};
	    int c [] = {33};
	    int arr [][] = new int[][]{a,b,c};
	    ArrayReversor arrayReversor = new ArrayReversor(new ArrayFlattenerService());
		System.err.println("Array: "+Arrays.toString(arrayReversor.reverseArray(arr)));
	}
	
	public int[] reverseArray(int[][] arr) {
		
		final int[] reversedArr;
		reversedArr = afs.flattenArray(arr);
		if(reversedArr != null) {
			return IntStream.range(0, reversedArr.length)
			        .map(i -> reversedArr[reversedArr.length - 1 - i])
			        .toArray();
		}
		return reversedArr;
	}
}
