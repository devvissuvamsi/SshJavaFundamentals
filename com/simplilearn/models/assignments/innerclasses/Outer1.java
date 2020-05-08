package com.simplilearn.models.assignments.innerclasses;

public class Outer1 {
	public class Inner1 {
		public void m1() {
			System.out.println("Inner class instance method");
		}
	}
	
	public void m2() {
		System.out.println("Outer class instance method");
		
		Inner1 i = new Inner1();
		i.m1();
	}
}
