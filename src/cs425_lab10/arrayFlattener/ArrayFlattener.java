package cs425_lab10.arrayFlattener;

import java.util.Arrays;

public class ArrayFlattener {
	
//	public static void main(String[] args) {
////		int a [] = {1,2,6,7,2};
////	    int b [] = {2,44,55,2};
////	    int c [] = {2,44,511,33};
//		int a [] = {1,2,6};
//	    int b [] = {55,2};
//	    int c [] = {33};
//	    int arr [][] = new int[][]{a,b,c};
//		System.err.println("Array: "+Arrays.toString(flattenArray(arr)));
//	}
	
	public int[] flattenArray(int[][] arr) {
		int[] flatArr = null;//new int[arr.length];
		if(arr != null)
			flatArr = Arrays.stream(arr).flatMapToInt(Arrays::stream).toArray();
		return flatArr;
	}
}
