package com.simplilearn.models.assignments.threads;

public class ThreadGroupExample1 {

	public static void main(String[] args) {
		ThreadGroup g = new ThreadGroup("tg");
		Thread t1 = new Thread(g,"Thread1");
		Thread t2 = new Thread(g,"Thread2");
		g.setMaxPriority(3);
		Thread t3 = new Thread(g,"Thread3");
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		System.out.println(t3.getPriority());
		
	}

}
