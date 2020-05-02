package com.simplilearn.models.session.FileIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;

public class FileOperation extends Student {
	private String pathToFile, dataToWrite;

	public FileOperation(String pathToFile, int id,String name) {
		super(id,name);
		this.pathToFile = pathToFile;
	}
	
	public FileOperation(String pathToFile, String dataToWrite) {
		this.pathToFile = pathToFile;
		this.dataToWrite = dataToWrite;
	}

	public FileOperation(String pathToFile) {
		this.pathToFile = pathToFile;
	}

	public void FileOutputStreamEx() throws IOException {
		FileOutputStream fout = new FileOutputStream(pathToFile);
		byte data[] = dataToWrite.getBytes();
		fout.write(data);
		fout.close();
		System.out.println("Write file is complete");
	}

	public void FileInputStreamEx() throws IOException {
		try {
			FileInputStream fin = new FileInputStream(pathToFile);
			int i = 0;
			while ((i = fin.read()) != -1) {
				System.out.print((char) i);
			}
			fin.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void FileWriterExample() throws IOException {
		FileWriter fwriter = new FileWriter(pathToFile);
		fwriter.write(dataToWrite);
		fwriter.close();
	}

	public void FileReaderExample() throws IOException {
		FileReader fr = new FileReader(pathToFile);
		int i;
		while ((i = fr.read()) != -1)
			System.out.print((char) i);
		fr.close();
	}
}

class Student implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public int id;
	public String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public Student() {
		
	}
}
