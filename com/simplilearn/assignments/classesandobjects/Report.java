package com.simplilearn.assignments.classesandobjects;

import java.util.Scanner;

public class Report {

	private int adno;
	private String name;
	private float[] marks = new float[5];
	private float average;

	private void calcAvg() {
		float sum = 0.0f;
		int arrayLength;

		arrayLength = getMarks().length;

		for (int i = 0; i <= arrayLength - 1; i++) {
			sum += getMarks()[i];
		}
		setAverage(sum / arrayLength);
	}

	public void readInfo() {
		float[] tempMarks = new float[5];
		int counter;

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter Admission Number: ");
		this.adno = scan.nextInt();

		System.out.print("Enter student name: ");
		this.name = scan.next();

		for (int i = 0; i <= 4; i++) {
			counter = i+1;
			System.out.println("Enter subject " + counter + " marks: ");
			tempMarks[i] = scan.nextFloat();
		}

		if (tempMarks.length >= 0)
			setMarks(tempMarks);

	}
	
	public void displayInfo() {
		System.out.println("\nAdmission Number" + this.adno);
		System.out.println("Student NAME" + this.name);
		System.out.println("Average Marks obtained" + getAverage());
	}

	public static void main(String[] args) {
		Report r = new Report();
		r.readInfo();
		r.calcAvg();
		r.displayInfo();
	}

	public float getAverage() {
		return average;
	}

	public void setAverage(float average) {
		this.average = average;
	}

	public float[] getMarks() {
		return marks;
	}

	public void setMarks(float[] marks) {
		this.marks = marks;
	}
}
