package com.simplilearn.models.session.datastructures;

import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		queue.add(5);
		queue.add(1);
		queue.add(3);
		queue.add(2);
		System.out.println(queue);
		while (!queue.isEmpty() ) {
			System.out.println(queue.remove());
		}
	}

}
