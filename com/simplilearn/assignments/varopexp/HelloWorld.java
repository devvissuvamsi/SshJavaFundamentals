package com.simplilearn.assignments.varopexp;

public class HelloWorld {
	static {
		System.out.println("Hello World !!!");
		System.out.println("Static block !!!");
//		System.exit(0);
	}
	
	{
		System.out.println("Instance block !!!");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloWorld h = new HelloWorld();
		
	}

}
