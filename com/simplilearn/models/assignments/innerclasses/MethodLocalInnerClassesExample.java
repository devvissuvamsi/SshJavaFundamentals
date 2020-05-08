package com.simplilearn.models.assignments.innerclasses;

public class MethodLocalInnerClassesExample {
	public void m1() {
		class Inner2 {
			public void sum(int x, int y) {
				System.out.println("Sum: " + (x+y));
			}
		}
		Inner2 i = new Inner2();
		i.sum(10, 20);
		i.sum(100, 200);
		i.sum(1000, 2000);
	}
	
}
