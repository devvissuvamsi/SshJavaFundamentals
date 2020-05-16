package com.simplilearn.session.examples;

import java.util.Arrays;

import com.simplilearn.models.session.sortingalgo.BubbleSort;
import com.simplilearn.models.session.sortingalgo.InsertionSort;
import com.simplilearn.models.session.sortingalgo.MergeSort;
import com.simplilearn.models.session.sortingalgo.SelectionSort;

public class SortingExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		int[] numbers = {7,3,1,4,6,2};

		BubbleSort bs = new BubbleSort();
		bs.sort(numbers);
		System.out.println("Bubble Sort");
		System.out.println(Arrays.toString(numbers));
		
		int[] numbers1 = {7,3,5,4,1,2};
		SelectionSort ss = new SelectionSort();
		ss.sort(numbers1);
		System.out.println("Selection Sort");
		System.out.println(Arrays.toString(numbers1));
		
		
		int[] numbers2 = {4,5,1,3,2,8};
		InsertionSort is = new InsertionSort();
		is.sort(numbers2);
		System.out.println("Insertion Sort");
		System.out.println(Arrays.toString(numbers2));
		
		int[] numbers3 = {7,3,5,2,3,1,5,8};
		MergeSort ms = new MergeSort();
		ms.sort(numbers3);
		System.out.println("Merge Sort");
		System.out.println(Arrays.toString(numbers3));
		
	}

}
