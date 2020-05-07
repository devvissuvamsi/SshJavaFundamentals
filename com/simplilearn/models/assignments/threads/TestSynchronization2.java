package com.simplilearn.models.assignments.threads;

//example of java synchronized method  
class Table1 {
	synchronized void printTable1(int n) {// synchronized method
		for (int i = 1; i <= 5; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(400);
			} catch (Exception e) {
				System.out.println(e);
			}
		}

	}
}

class MyThread11 extends Thread {
	Table1 t;

	MyThread11(Table1 t) {
		this.t = t;
	}

	public void run() {
		t.printTable1(5);
	}

}

class MyThread22 extends Thread {
	Table1 t;

	MyThread22(Table1 t) {
		this.t = t;
	}

	public void run() {
		t.printTable1(100);
	}
}

public class TestSynchronization2 {
	public static void main(String args[]) {
		Table1 obj = new Table1();// only one object
		MyThread11 t1 = new MyThread11(obj);
		MyThread22 t2 = new MyThread22(obj);
		t1.start();
		t2.start();
	}
}