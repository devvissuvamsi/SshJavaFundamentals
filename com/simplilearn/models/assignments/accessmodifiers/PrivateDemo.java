package com.simplilearn.models.assignments.accessmodifiers;

public class PrivateDemo {
	private int data;  

	public PrivateDemo(int data) {
		setData(data);
	}
	
	public  int getData() {
		return data;
	}
	
	public  void setData(int data) {
		this.data = data;
	}
	
	private void msg(){System.out.println("Private method msg() called from public method");}  
	
	public void displayMessage() {
		msg();
	}
}
