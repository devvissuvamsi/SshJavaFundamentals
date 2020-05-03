package com.simplilearn.session.examples;

class MyFirstThread extends Thread{
	public void run() {
		System.out.println("Thread Started !!!");
	}
}
public class ThreadExample {

	public static void main(String[] args) {
		System.out.println("Main thread started....");
		MyFirstThread thread = new MyFirstThread();
		thread.start();
	}

}

class MySecondThread implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}