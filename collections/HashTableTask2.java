package com.hughes.collections;

import java.util.Hashtable;
import java.util.Set;

public class HashTableTask2 {

    public static void main(String[] args) {

        Hashtable<Integer, String> ht = new Hashtable<>();
        ht.put(1, "Shruti");
        ht.put(2, "shruti");
        ht.put(3, "laptop");
        ht.put(4, "Laptop");
        ht.put(5, "Edu");
        ht.put(6, "Tech");

        Set<Integer> setOfKeys = ht.keySet();

        for (Integer key1 : setOfKeys) {
            for (Integer key2 : setOfKeys) {
                if (ht.get(key1).toLowerCase().equals(ht.get(key2).toLowerCase()) && key1 != key2) {
                    System.out.println(key1);
                }
            }
        }
    }
}
