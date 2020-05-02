package com.simplilearn.assignments.classesandobjects;

import java.util.Scanner;

public class Batsman {

	private int bcode, innings, notout, runs;
	private String bname;
	private float batavg;

	public float getBatavg() {
		return batavg;
	}

	public void setBatavg(float batavg) {
		this.batavg = batavg;
	}

	private void calcAvg() {
		setBatavg(runs / (innings - notout));
	}

	public void readData() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Batsman Code: ");
		this.bcode = scan.nextInt();

		System.out.print("Enter Batsman Name: ");
		this.bname = scan.next();
		
		System.out.print("Enter Batsman innings: ");
		this.innings = scan.nextInt();
		
		System.out.print("Enter Batsman notouts: ");
		this.notout = scan.nextInt();

		System.out.print("Enter Batsman runs: ");
		this.runs = scan.nextInt();
	}

	public void displayData() {
	System.out.println("Batsman Code: " + this.bcode);	
	System.out.println("Batsman Name: " + this.bname);	
	System.out.println("Batsman Innings: " + this.innings);	
	System.out.println("Batsman Notouts: " + this.notout);	
	System.out.println("Batsman Runs: " + this.runs);	
	System.out.println("Batsman Average: " + getBatavg());	
	}
	
	public static void main(String[] args) {
		Batsman b = new Batsman();
		b.readData();
		b.calcAvg();
		b.displayData();
	}

}
