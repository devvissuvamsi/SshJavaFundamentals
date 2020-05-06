package com.simplilearn.models.assignments.threads;

class MyRunnable implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<=10;i++)
			System.out.println("Child Thread");
	}
}

public class RunnableDemo {

	public static void main(String[] args) {
		MyRunnable r = new MyRunnable();
		Thread t = new Thread(r); // This is known as Target runnable, passing Myrunnable object to thread
		t.start();
		for(int i=0;i<=10;i++)
			System.out.println("Main Thread");
	}

}
