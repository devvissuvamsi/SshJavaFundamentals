package com.simplilearn.assignments.problemstatements;

import com.simplilearn.models.assignments.innerclasses.AnonymousInnerClassExample;

public class AnanymousInnerClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnonymousInnerClassExample p1 = new AnonymousInnerClassExample() 
		{
			public void taste() {
				System.out.println("Spicy");
			}
		};	
		 p1.taste(); // this method is called via ananymous inner class creation
		
		AnonymousInnerClassExample p2 = new AnonymousInnerClassExample();
		
		p2.taste(); // this is actual implementation
		
		System.out.println(p1.getClass().getName());
		System.out.println(p2.getClass().getName());
		
	}

}
