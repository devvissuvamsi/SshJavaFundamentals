package com.simplilearn.models.assignments.threads;


class A {
	public synchronized void d1(B b) {
		System.out.println("Thread1 start execution of d1 method");
		try {
			Thread.sleep(5000);
		}
		catch (InterruptedException ie) {
		}
		
		System.out.println("Thread1 trying to call B's last() method");
		b.last();
	}
	
	public synchronized void last() {
		System.out.println("Inside A last() method");
	}
}

class B {
	public synchronized void d2(A a) {
		System.out.println("Thread2 start execution of d2 method");
		try {
			Thread.sleep(5000);
		}
		catch (InterruptedException ie) {
		}
		
		System.out.println("Thread2 trying to call A's last() method");
		a.last();
	}
	
	public synchronized void last() {
		System.out.println("Inside B last() method");
	}
	
}

public class DeadLockExample extends Thread {

	A a = new A();
	B b = new B();	
	
	public void m1() {
		this.start();
		a.d1(b);
	}

	public void run() {
		b.d2(a);
	}
	
	public static void main(String[] args) {
		DeadLockExample t = new DeadLockExample();
		t.m1();
	}
}
