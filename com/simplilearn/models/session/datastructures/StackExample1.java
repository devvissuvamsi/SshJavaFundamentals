package com.simplilearn.models.session.datastructures;

import java.util.Arrays;

class Stack {
	private int[] items = new int[5];
	private int count;
	
	public void push( int item) {
		if(count == items.length) {
			throw new StackOverflowError();
		}
		items[count++] = item;
	}
	
	public int pop() {
		if(count == 0) {
			throw new IllegalStateException();
		}
		return items[--count];
	}
	
	public int peek() {
		if(count==0) {
			throw new IllegalStateException();
		}
		return items[count-1];
	}
	
	public boolean isEmpty() {
		return count ==0;
	}
	
	@Override
	public String toString() {
		int[] content = Arrays.copyOfRange(items, 0, count);
		return Arrays.toString(content);
	}
}
public class StackExample1 {

	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(100);
		stack.push(200);
		stack.push(300);
		System.out.println(stack);
		System.out.println("Last Element: " + stack);
	}

}
