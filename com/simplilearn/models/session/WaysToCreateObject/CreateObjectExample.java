package com.simplilearn.models.session.WaysToCreateObject;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class CreateObjectExample {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException, CloneNotSupportedException, IOException {

		System.out.println("**************Method 1 - using new keyword **************");
		Student s1 = new Student();
		s1.colg_id = 100;
		System.out.println(s1.colg_id);
		
		System.out.println("\n**************Method 2 - using newInstance() of java.lang.Class **************");
		
		Student s2 = (Student)Class.forName("com.simplilearn.models.session.WaysToCreateObject.Student").newInstance();
		s2.colg_id = 200;
		System.out.println(s2.colg_id);
		
		System.out.println("\n**************Method 3 - using newInstance() of java.lang.reflect.Constructor **************");
		Constructor<Student> constr = Student.class.getConstructor();
		Student s3 = constr.newInstance();
		s3.colg_id = 300;
		System.out.println(s3.colg_id);
		
		System.out.println("\n**************Method 4 - using clone(), Note: Constructor will not be called for this **************");
		Student s4 = (Student)s1.clone();
		s4.colg_id = 400;
		System.out.println(s4.colg_id);
		
		System.out.println("\n**************Method 5 - using Deserialization() **************");
		/*
//		First Serialize Student object
		FileOutputStream fos = new FileOutputStream("student.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(new Student());
		*/
		
//		Now deserialize File object
		FileInputStream fis = new FileInputStream("student.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Student s5 = (Student)ois.readObject();
		s5.colg_id = 400;
		System.out.println("Col ID: " + s5.colg_id + ", College Name: " + s5.colg_name);
		
		
		
		System.out.println("\n**************shallow copy ( this will not create object instead marks reference to same object **************");
		Student s6 = s1;

		s6.colg_id = 50;
		System.out.println("s6 col_id: " + s6.colg_id + ", s1 col_id: " + s1.colg_id);
	}
}

class Student implements Cloneable,Serializable {
	private static final long serialVersionUID = 1L;
	public int colg_id = 10;
	transient String colg_name = "College Name";
	
	public Student() {
		System.out.println("Student class constructor");
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	
}