package com.simplilearn.models.session.searchalgo;
import com.simplilearn.models.session.searchalgo.BinarySearch;

public class ExponentialSearch extends BinarySearch {
	public int search(int[] array, int target) {
		int bound = 1;
		while(array[bound] < target && bound < array.length)
			bound *= 2;
		
		int left = bound / 2;
		int right = Math.min(bound, array.length-1);
		return this.binarySearch(array, left, right, target);
	}
}
