package com.hughes.collections;

import java.util.Hashtable;

public class HashTableTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] arr = {"bat", "rat", "cat", "mat", "TV", "Laptop"};

        Hashtable ht = new Hashtable<>();

        for (int i = 0; i < arr.length; i++) {
            ht.put(i, arr[i]);
        }

        System.out.println(ht);

	}

}
