package reverseArray;

import java.util.Arrays;

public class Exercise1 {
	/*
	 * 1. Given an array of ints, return the array so that its contents are in
	 * reverse order. Eg. [123] -> [321]
	 * 
	 * One issue I had while doing this problem was not initially realizing that i needs to stop
	 * iterating through at half, hence i < arr.length/2 or else it will reverse my function
	 */
	
	
	public static void main(String[] args) {
		int[] intArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] revArray = reverseArray(intArray);
		System.out.println("The reversed array is: " + Arrays.toString(revArray));
	}

	public static int[] reverseArray(int[] arr) {
		
		System.out.println("The original array is: " + Arrays.toString(arr));

		if (arr != null) {
		for (int i = 0, j = arr.length - 1; i < arr.length/2; i++, j--) {
			int temp = arr[i]; //placeholder
			arr[i] = arr[j];
			arr[j] = temp;
		}}
		return arr;
	}
	
	}

