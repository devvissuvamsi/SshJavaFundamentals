package com.simplilearn.models.session.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Set;
import java.util.Map;

public class MapEx {
	private Object HashTable;

	public void HashMapExample() {
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(1, "Vamsi");
		hashMap.put(2, "Kaushik");
		hashMap.put(3, "Jyothi");
		hashMap.put(4, "Suyajna");
		hashMap.put(5, "Pappu Family");
		
		System.out.println(hashMap);
		System.out.println(hashMap.get(1));
		System.out.println(hashMap.get(10));
		
		Set<Integer> keys = hashMap.keySet();
		System.out.println(keys);

		Collection<String> values = hashMap.values();
		System.out.println(values);
		
		 for (Map.Entry m: hashMap.entrySet()) { 
	            System.out.println(m.getKey()+" "+m.getValue()); 
	        } 
		
	}
	
	public void HashTableExample() {
		Hashtable<Integer,String> hashTable = new Hashtable<Integer, String>();
		hashTable.put(1, "Vamsi");
		hashTable.put(2, "Kaushik");
		System.out.println(hashTable);
		
		  for (Map.Entry m: hashTable.entrySet()) { 
	            System.out.println(m.getKey()+" "+m.getValue()); 
	        } 
	}
	
	 
	
}
