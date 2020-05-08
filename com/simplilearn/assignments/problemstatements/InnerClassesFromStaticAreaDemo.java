package com.simplilearn.assignments.problemstatements;

import com.simplilearn.models.assignments.innerclasses.Outer1;

public class InnerClassesFromStaticAreaDemo {

	public static void main(String[] args) {
		// first way of accessing an inner class method
		Outer1 o = new Outer1();
		Outer1.Inner1 i = o.new Inner1();
		i.m1();
		
		// second way
		Outer1.Inner1 i1 = new Outer1().new Inner1();
		i1.m1();
		
		// third way
		(new Outer1()).new Inner1().m1();
		
		// just calling outer class instance method which inturns calls inner class instance method here
		o.m2();
		
	}

}
