package com.simplilearn.models.session.searchalgo;

public class LinearSearch {
	
	public int search(int[] array, int target) {
		for(int i=0;i<= array.length-1;i++) {
			if(array[i] == target) {
				return i;
			}
		}
		return -1;
	}
}
