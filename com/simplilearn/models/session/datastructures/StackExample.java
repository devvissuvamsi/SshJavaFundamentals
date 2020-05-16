package com.simplilearn.models.session.datastructures;

import java.util.Stack;

class StringReverser{
	public String reverse(String input) {
		if(input == null | input == "") {
			throw new IllegalArgumentException("Input can't be empty");
		}
		Stack<Character> stack = new Stack<>();
		String reversed = "";
		
		for(char ch : input.toCharArray()) {
			stack.push(ch);
		}
		
		while(!stack.isEmpty()) {
			reversed += stack.pop();
		}
		
		return reversed;
	}
}

public class StackExample {

	/*
	 * push() pop() peek() IsEmpty()
	 */
	
	public static void main(String[] args) {
		String input = "";
		StringBuilder input1 = new StringBuilder(); 
		
		input1.append(input);
		input1.reverse();
		
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(100);
		stack.push(200);
		stack.push(300);
		
		System.out.println(stack);
		System.out.println("Last Inserted element in stack: " + stack.peek());
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		
		StringReverser sr = new StringReverser();
		String result = "";
		try {
			result = sr.reverse(input);
			
		} catch(IllegalArgumentException ex) {
			System.out.println(ex.getMessage());
			System.out.println("Input can't be null or empty");
		}
		
		System.out.println("Reversed string: " + result);
	}
	
}
