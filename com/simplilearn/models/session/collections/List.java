package com.simplilearn.models.session.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class List {
	public void ArrayListExample() {
		ArrayList<String> emps = new ArrayList<String>();
		
		emps.add("King");
		emps.add("Kochar");
		emps.add("Sarha");
		emps.add(2,"Vamsi");
		
		for(String sname: emps) {
			System.out.println(sname);
		}
		emps.remove(2);
		emps.set(2,"Kaushik");
		// emps.removeAll(emps);
		
		System.out.println("************");
		
		Iterator<String> iterator = emps.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
//		create another list
		ArrayList<String> otheremps = new ArrayList<String>();
		otheremps.add("Suyajna");
		otheremps.add("Amma");
		
		emps.addAll(otheremps);
		
		System.out.println("**************");
	
		for(String sname: emps) {
			System.out.println(sname);
		}
		
	}
	
	public void LinkedListExample( ) {
		LinkedList<String> linkedlist = new LinkedList<String>();
		linkedlist.add("Silu");
		linkedlist.add("Karthik");
		linkedlist.add("Anni");
		linkedlist.add("Bava");
		
		linkedlist.addFirst("Saripalli Family");
		linkedlist.addLast("Freeze family");
		
		for(String sname: linkedlist) {
			System.out.println(sname);
		}
	}
	
	public void VectorExample() {
		Vector<String> vector = new Vector<String>();
		System.out.println(vector.capacity());
		vector.addElement("Vamsi");
		vector.addElement("Vamsi");
		vector.addElement("Vamsi");
		vector.addElement("Vamsi");
		vector.addElement("Vamsi");
		vector.addElement("Vamsi");
		vector.addElement("Vamsi");
		vector.addElement("Vamsi");
		vector.addElement("Vamsi");
		vector.addElement("Vamsi");
		vector.addElement("Vamsi");
		vector.addElement("Vamsi");
		System.out.println(vector.size());
		System.out.println(vector.capacity());
	}
}
