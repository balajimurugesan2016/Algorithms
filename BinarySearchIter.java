package functionalInterface;

import java.util.Arrays;

public class BinarySearchIter {

	public int bsearch(int[] array,int se) {
		
		int start = 0;
		int end = array.length;
		int val = -1;
		
		while(start < end) {
			
			int mid = (start + end) >> 1;
			
		if(array[mid] == se)
		{
			val = array[mid];
			break;
		}
		else if (se < array[mid])
		{
			end = mid -1;
			
		}
		else
		{
			start = mid + 1;
		}		
			
		}
		
		return val;
		
		
	}
	
	
	
	public static void main(String[] args) {

		int arr[] = { 44, 56, 72, 98, 77, 66, 55 };
		Arrays.sort(arr);
		BinarySearchRecursion bsr = new BinarySearchRecursion();
		bsr.bsearch(arr, 1, arr.length, 72);

		int index = bsr.bsearch(arr, 1, arr.length, 72);
		if (index == -1) {

			System.out.println("Element not found");
		} else {
			System.out.println("Element found in Index" + " " + index);
		}

		index = bsr.bsearch(arr, 1, arr.length, 22);

		if (index == -1) {

			System.out.println("Element not found");
		} else {
			System.out.println("Element found in Index" + " " + index);
		}

	}
}
