package com.hughes.collections;

import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap mp = new TreeMap();
		TreeMap mp1 = new TreeMap();
		mp1.put("Hyd", "Hyderabad");
		mp1.put("Gur", "Gurugram");
		//In treemap all keys are of similar datatype. Else errors.
		
		mp.put(1, "Shruti");
		mp.put(1 + 1, "Agrawal");
		mp.put(1 + 1 + 1, "Java");
		// No null keys and values-null pointer exception
		// mp.put(null, null);

		//To use null use double quotes
		//We can use optional for using null using empty()
		mp.put(10/2, " ");
//		mp.put(key, value)
		System.out.println(mp);
		System.out.println(mp.values());
		

	}

}
