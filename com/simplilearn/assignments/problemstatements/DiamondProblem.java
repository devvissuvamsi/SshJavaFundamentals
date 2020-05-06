package com.simplilearn.assignments.problemstatements;

import java.util.*;

abstract class SuperClass {
	abstract void demo();
}

class Super1 extends SuperClass {

	@Override
	void demo() {
		System.out.println("demo method of super1");
	}
}

class Super2 extends SuperClass {

	@Override
	void demo() {
		System.out.println("demo method of super2");
	}
}

class PrintDiamond {
	static void printDiamond(int n) {
		int space = n - 1;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < space; j++)
				System.out.print(" ");
			for (int j = 0; j <= i; j++)
				System.out.print("* ");
			
			if(i==0)
				System.out.print("                       SuperClass");
			else if(i == n-1)
				System.out.print("        Super1                   Super2");
			System.out.print("\n");
			space--;
		}

		// Repeat again in
		// reverse order
		space = 0;

		for (int i = n; i > 0; i--) {
			for (int j = 0; j < space; j++)
				System.out.print(" ");
			for (int j = 0; j < i; j++)
				System.out.print("* ");
			if(i==1)
				System.out.print("                       SubClass");
			System.out.print("\n");
			space++;
		}
	}

}

//public class DiamondProblem extends Super1, Super2   {
	public class DiamondProblem {
		
	public static void main(String[] args) {
		DiamondProblem obj = new DiamondProblem();
		PrintDiamond.printDiamond(5);
	}
}