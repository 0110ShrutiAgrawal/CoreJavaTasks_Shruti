package com.hughes.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashsetExample {
	public static void main(String[] args) {

//		ArrayList al = new ArrayList();
//		al.add(67);
//		al.add(77);
//		al.add(67);
//
//		HashSet st = new HashSet();
//		st.add(new Integer(789));
//		st.add(new Integer(1789));
//		st.add(new Integer(1789));
//		st.add(new Integer(89));
//		st.add(null);
//		st.add(new Integer(9));
//		st.add(new String("Shruti"));
//		st.addAll(al);
//		System.out.println(st);
//		System.out.println("Size = " + st.size());
//		System.out.println("Array = " + st.toArray());
//		System.out.println("Contains = " + st.contains(90));
//
//		Iterator ir = st.iterator();
//		while (ir.hasNext()) {
//			System.out.println(ir.next());
//		}
		

		HashSet<Object> st = new HashSet<>();
		st.add(new Integer(789));
		st.add(new Integer(1789));
		st.add(null);
		st.add("Shruti");

		HashSet<Object> st1 = new HashSet<>();
		st1.add(new Integer(789));
		st1.add("ff");

		System.out.println(st);
		System.out.println(st1);
		System.out.println(st.retainAll(st1));
		System.out.println(st);
		System.out.println(st1);


	}

}
