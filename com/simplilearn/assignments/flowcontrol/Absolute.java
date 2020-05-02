package com.simplilearn.assignments.flowcontrol;

import java.util.Scanner;

public class Absolute {
	public static void main(String[] args) {

		String absValue;

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter number: ");

		absValue = Integer.toString(Math.abs(Integer.parseInt(scan.next())));

		System.out.println("Abs value: " + absValue);

	}
}
