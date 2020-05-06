package com.simplilearn.models.assignments.threads;

public class ThreadClassConstructors extends Thread {

	public static void main(String[] args) {
		
		/*
		 * Thread class constructors
		 */		
		System.out.println("Thread(): Allocates a new Thread object\r\n" + 
				"Thread(Runnable target): Allocates a new Thread object\r\n" + 
				"Thread(Runnable target, String name): Allocates a new Thread object\r\n" + 
				"Thread(String name): Allocates a new Thread object\r\n" + 
				"Thread(ThreadGroup group, Runnable target): Allocates a new Thread object\r\n" + 
				"Thread(ThreadGroup group, Runnable target, String name): Allocates a new Thread object so that it has target as its run object, has the specified name as its name, and belongs to the thread group referred to by group\r\n" + 
				"Thread(ThreadGroup group, Runnable target, String name, long stackSize): Allocates a new Thread object so that it has target as its run object, has the specified name as its name, and belongs to the thread group referred to by group, and has the specified stack size\r\n" + 
				"Thread(ThreadGroup group, String name): CAllocates a new Thread object");
		
		/*
		 * This prints current Thread name
		 */		
		System.out.println(ThreadClassConstructors.currentThread().getName());
	}

}
