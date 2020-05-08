package com.simplilearn.models.assignments.threads;

class ThreadB extends Thread {
	
	int total = 0;
	public void run() {
		synchronized (this) {
			System.out.println(this.currentThread().getName() + " Starts calculation");
			for(int i=1;i<=100;i++) 
				total += i;
			System.out.println(this.currentThread().getName() + " trying to give notification");
			this.notify();
		}
	}
}

public class WaitAndNotifyExample  {
	public static void main(String[] args) throws InterruptedException {
		ThreadB b = new ThreadB();
		b.start();
		synchronized (b) {
			System.out.println(Thread.currentThread().getName() + " trying to call wait() method");
			b.wait();
			System.out.println("Total : " + b.total);
		}
	}
}
