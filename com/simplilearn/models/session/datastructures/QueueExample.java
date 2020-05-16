package com.simplilearn.models.session.datastructures;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.Stack;

public class QueueExample {

	public static void reverse(Queue<Integer> queue) {
		Stack<Integer> s = new Stack<>();
	}
	
	/*
	 * enqueue() dequeue() peek() isEmpty() isFull()
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> queue = new ArrayDeque<Integer>();
		queue.add(10);
		queue.add(20);
		queue.add(30);
		
		System.out.println(queue);
		System.out.println("Elements at front of the queue: " + queue.element());
		System.out.println(queue.remove());
		System.out.println(queue);
		
	
		
		for (Iterator iterator = queue.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
		}
		
	
	}

}
