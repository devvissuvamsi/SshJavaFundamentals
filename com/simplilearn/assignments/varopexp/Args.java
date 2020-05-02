package com.simplilearn.assignments.varopexp;

public class Args {

	/*
	 * this needs to be run via run configurations to intake arguments from command
	 * line
	 */
	public static void main(String[] args) {
		for (String s : args) {
			System.out.println("Hello " + s);
		}
	}
}
