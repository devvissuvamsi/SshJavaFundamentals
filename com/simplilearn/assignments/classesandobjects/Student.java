package com.simplilearn.assignments.classesandobjects;
import java.util.Scanner;

public class Student {

	private int admno; 
	private String sname;
	private float eng,math,science,total;
	
	private float ctotal() {
		return eng + math + science;
	}
	
	public void takeData() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Admission Number: ");
		this.admno = scan.nextInt();

		System.out.print("Enter Student Name: ");
		this.sname = scan.next();
		
		System.out.print("Enter English Marks: ");
		this.eng = scan.nextFloat();
		
		System.out.print("Enter Math Marks: ");
		this.math = scan.nextFloat();
		
		System.out.print("Enter Science Marks: ");
		this.science = scan.nextFloat();
		
		this.total = ctotal();
	}
	
	public void showData() {
		System.out.println("\nAdmission Number: " + this.admno);
		System.out.println("Student Name: " + this.sname);
		System.out.println("English: " + this.eng);
		System.out.println("Math: " + this.math);
		System.out.println("Science: " + this.science);
		System.out.println("Total: " + this.total);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.takeData();
		s.showData();
	}

}
