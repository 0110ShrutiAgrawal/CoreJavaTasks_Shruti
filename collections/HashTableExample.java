package com.hughes.collections;

import java.util.Hashtable;

public class HashTableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable ht = new Hashtable ();
		ht.put("k1", "Shruti");
		ht.put("k2", "Agrawal");
		ht.put("k3", "Java");
		ht.put("k4", "Python");
		System.out.println(ht);
		System.out.println(ht.keySet());
		System.out.println(ht.values());
		System.out.println(ht.get("k2"));
		ht.replace("k2","Agrawal", "Shruti");
		System.out.println(ht);
		
	}

}
