package com.simplilearn.session.examples;

class UnCheckedExceptionsSub {

	public void ArithmeticExceptionWithTryCatchEx() {
		try {
			System.out.println(10/0);
		} catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}
}

public class UnCheckedExceptions {
	public static void main(String[] args) {
		UnCheckedExceptionsSub sub = new UnCheckedExceptionsSub();
		sub.ArithmeticExceptionWithTryCatchEx();
		//sub.ArithmeticExceptionWithThrowsEx();
	}
}
