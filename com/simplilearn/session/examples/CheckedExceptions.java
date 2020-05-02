package com.simplilearn.session.examples;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

class CheckedExceptionsSub {
	
	public void FileNotFoundExceptionWithThrowsEx() throws FileNotFoundException   {
		PrintWriter pw = new PrintWriter("Abc.txt"); // Here unreported exception java.io.FileNotFoundException occurs
		System.out.println("Hello");
	}
	
	public void FileNotFoundExceptionWithTryCatchEx() throws FileNotFoundException   {
		try {
			PrintWriter pw = new PrintWriter("Abc.txt"); // Here unreported exception java.io.FileNotFoundException occurs
			System.out.println("Hello");
		} catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void FileNotFoundAndRunTimeExceptionWithThrowsEx() throws FileNotFoundException   {
		PrintWriter pw = new PrintWriter("Abc.txt"); // Here unreported exception java.io.FileNotFoundException occurs
		System.out.println("Hello");
		// System.out.println(10/0); // It compiles fine though runtimeexception occurs with this line
	}	
}

public class CheckedExceptions {
	public static void main(String[] args) throws FileNotFoundException {
		CheckedExceptionsSub sub = new CheckedExceptionsSub();
		sub.FileNotFoundAndRunTimeExceptionWithThrowsEx();
	}
}
