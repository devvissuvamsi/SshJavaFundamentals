package com.simplilearn.models.session.datastructures;

import java.util.Arrays;

class ArrayQueue{
	private int[] items = new int[5];
	private int rear,front;
	private int count;
	
	public ArrayQueue(int capacity) {
		items = new int[capacity];
	}
	
	public void enqueue(int item) {
		if(count == items.length) {
			throw new IllegalStateException();
		}
		items[rear++] = item;
		count++;
	}
	
	public int dequeue() {
		int item =  items[front];
		items[front++] = 0;
		return item;
	}
	
	@Override
	public String toString() {
		int[] content = Arrays.copyOfRange(items, 0, count);
		return Arrays.toString(content);
	}	
}

public class ArrayQueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayQueue queue = new ArrayQueue(5);
		queue.enqueue(100);
		queue.enqueue(200);
		queue.enqueue(300);
		System.out.println(queue);
		queue.dequeue();
		System.out.println(queue);
		queue.enqueue(400);
		queue.enqueue(500);
		System.out.println(queue);
		
	}

}
