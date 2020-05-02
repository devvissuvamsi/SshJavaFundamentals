package com.simplilearn.session.examples;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.simplilearn.models.session.FileIO.FileOperation;

public class FileOperationEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOperation fo = new FileOperation("data.txt", "Hello World");
		try {
			System.out.println("*** FileOutputStream Example***");
			fo.FileOutputStreamEx();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			System.out.println("\n*** FileInputStream Example***");
			fo.FileInputStreamEx();
			System.out.println("\nReading data from file is complete");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		FileOperation fo1 = new FileOperation("data1.txt", "Hello World 1");
		try {
			System.out.println("\n*** FileWriter Example***");
			fo1.FileWriterExample();
			System.out.println("Writing data to file is complete");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			System.out.println("\n*** FileReader Example***");
			fo1.FileReaderExample();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			// Creating the object
			FileOperation fObject = new FileOperation("data.txt", 101, "Vamsi");
			// Creating stream and writing the object
			FileOutputStream fout = new FileOutputStream("f.txt");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			out.writeObject(fObject);
			out.flush();
			// closing the stream
			out.close();
			System.out.println("\nsuccess\n");
		} catch (Exception e) {
			System.out.println(e);
		}
		
		  try{  
			  //Creating stream to read the object  
			  ObjectInputStream in=new ObjectInputStream(new FileInputStream("f.txt"));  
			  FileOperation fObjectInput=(FileOperation)in.readObject();  
			  //printing the data of the serialized object  
			  System.out.println("Deserialized object data");
			  System.out.println("Student ID: " + fObjectInput.id);  
			  System.out.println("Student Name: " + fObjectInput.name);  
			  //closing the stream  
			  in.close();  
			  }catch(Exception e){System.out.println(e);}  		

	}

}
