package com.simplilearn.models.assignments.threads;

public class ThreadGroupExample {
	public static void main(String[] args) {
		
		Thread t = Thread.currentThread();
		
		System.out.println(t.getName()); // main thread name - main
		System.out.println(t.getThreadGroup().getName()); // main thread group name - main
		System.out.println(t.getThreadGroup().getParent().getName()); // main thread group parent 
		
		ThreadGroup g1 = new ThreadGroup("First-Group"); // ThreadGroup is child group of main group
		System.out.println(g1.getParent().getName());
		
	}
}
