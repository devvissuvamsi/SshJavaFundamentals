package com.simplilearn.assignments.problemstatements;

import com.simplilearn.models.assignments.accessmodifiers.DefaultDemo;
import com.simplilearn.models.assignments.accessmodifiers.PrivateDemo;
import com.simplilearn.models.assignments.accessmodifiers.ProtectedDemo;

public class AccessModifiersDemo {

	public static void main(String[] args) {

//		Private
		PrivateDemo pd = new PrivateDemo(400);
		System.out.println("data: " + pd.getData());
		pd.displayMessage();

//		Default
		DefaultDemo obj = new DefaultDemo(); // class not visible since declared as default
		obj.msg();// msg() method not visible since declared as default

//  Protected
		ProtectedDemo p = new ProtectedDemo();

		/*
		 * p.msg() // msg() method not visible since its declared as protected
		 */

	}
}
