package com.simplilearn.models.assignments.threads;

class MyPriorityThread extends Thread {
	@Override
	public void run() {
		for(int i=0;i<=10;i++)
			System.out.println("Child Thread");
	}
}

public class ThreadPrioritiesDemo {

	public static void main(String[] args) {
		
	//	Thread.currentThread().setPriority(10); // Range is from 1 to 10 , 10 is HIGHEST priority
		
		MyPriorityThread t = new MyPriorityThread();
		
		t.setPriority(10); // At this point we are setting priority as 10 to child thread
		
		t.start(); // starting child thread
		
		for(int i=0;i<=10;i++)
			System.out.println("Main Thread");
		
		// Note: Expected output would be child thread followed by main thread 10 times, however we are not receiving the same since some platforms doesn't support thread priorities, to resolve we need to send mail to OS vendors and get the patch and install
		
//		System.out.println("Since MyPriorityThread parent is Thread and it is started by mainthread so it inherits parent thread priority: " + t.getPriority());
		
	//	Thread.currentThread().setPriority(15); // RuntimeException: IllegalArgumentException
	}

}
