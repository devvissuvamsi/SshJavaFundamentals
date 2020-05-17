package com.simplilearn.session.examples;

import com.simplilearn.models.session.searchalgo.BinarySearch;
import com.simplilearn.models.session.searchalgo.LinearSearch;

public class SearchExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = { 7, 1, 3, 6, 2 };
		LinearSearch ls = new LinearSearch();
		int index = ls.search(numbers, 3);
		System.out.println("Linear Search");
		System.out.println("Index of element:" + index);

		BinarySearch ob = new BinarySearch();
		int arr[] = { 2, 3, 4, 10, 40 };
		int n = arr.length;
		int x = 10;
		int result = ob.binarySearch(arr, 0, n - 1, x);
		System.out.println("Binary Search");
		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at index " + result);
	}

}
