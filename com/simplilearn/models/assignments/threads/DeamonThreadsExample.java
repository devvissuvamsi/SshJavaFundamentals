package com.simplilearn.models.assignments.threads;

class MyDeamonThreadExample extends Thread{
	public void run() {
		System.out.println("");
	}
}
public class DeamonThreadsExample {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().isDaemon()); // main thread always non-daemon
		MyThread t = new MyThread();
		System.out.println(t.isDaemon()); // child thread takes parent behaviour, here since main thread is non-daemon so child is also non-daemon
		t.setDaemon(true); // we cna change behaving this way
		System.out.println(t.isDaemon()); 
	}
}
