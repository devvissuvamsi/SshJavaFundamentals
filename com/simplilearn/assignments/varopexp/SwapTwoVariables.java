package com.simplilearn.assignments.varopexp;

import java.util.Scanner;

public class SwapTwoVariables {

	public static void main(String[] args) {
		int a, b;
		
		Scanner in = new Scanner(System.in);

		System.out.println("Input the first number: ");
		a = in.nextInt();
	
		System.out.println("Input the second number: ");
		b = in.nextInt();
		
		System.out.println("Before swapping : a, b = " + a + ", " + +b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After swapping : a, b = " + a + ", " + +b);
	}

}
