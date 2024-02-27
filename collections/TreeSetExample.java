package com.hughes.collections;

import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(89);
        ts.add(8);
        ts.add(13);
        ts.add(49);
        
        try{
        	TreeSet ts1 = (TreeSet) ts.clone();
        }
        
        catch(Exception e)
        {
        	e.printStackTrace();
        }
        

        // ts.add(null); // This line causes NullPointerException
        System.out.println(ts);
//        System.out.println(ts1);
        System.out.println(ts.first());
        System.out.println(ts.higher(8));
        System.out.println(ts.last());
        ts.pollFirst();
        System.out.println(ts.descendingSet());
        
    }

}
