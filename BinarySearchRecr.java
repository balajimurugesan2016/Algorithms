package functionalInterface;

import java.util.Arrays;

public class BinarySearchRecr {

	public int bsearch(int[] array, int start, int end, int se) {

		if (start > end) {

			return -1;
		}

		int mid = (start + end) >> 1;

		if (array[mid - 1] == se) {

			return mid;

		} else if (se < array[mid - 1]) {
			return bsearch(array, start, mid - 1, se);
		} else {
			return bsearch(array, mid + 1, end, se);
		}

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
