package com.simplilearn.models.session.abstractclasses;

public abstract class BankAccount {
	
	public BankAccount() {
		System.out.println(
				"Definition of Abstract Classes:\nAbstract classes need to be prefixed with abstract \nthey need to implemented in child classes as override methods \nwe cannot create object of an abstract class \ncan have zero or more abstract methods\nCan also have non abstract methods\n");
	}
	
	public abstract void balance();
	public abstract void withdraw();
	public abstract void deposit();
	
	protected void display() {
		System.out.println("Non abstract method !!!");
	}
}
