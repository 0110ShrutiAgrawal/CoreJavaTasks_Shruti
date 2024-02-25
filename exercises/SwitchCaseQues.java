package com.hughes.exercises;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//if i give input as 1,
//then data shld be inserted
//input is 2
//then data shld be deleted
//input is 3
//then data shld be displayed
//input is 4
//then duplicate values shld be displayed
//use switch case

/**
 * @author 91959
 *
 */
public class SwitchCaseQues {
    public static void main(String[] args) {
    	
        ArrayList<Integer> data = new ArrayList<>();
        
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1---insert, 2----delete, 3---display, 4-----display duplicates, or 0---exit:");
            int entry = scanner.nextInt();
            scanner.close();

            switch (entry) {
                case 0:
                	
                    System.out.println("Exiting");
                    return;
                    
                case 1:
                	
                    System.out.println("Enter a number it will be inserted");
                    int num = scanner.nextInt();
                    data.add(num);
                    break;
                    
                case 2:
                	
                    if (data.isEmpty()) {
                        System.out.println("No data to delete.");
                    }
                    else {
                        
                    }
                    break;
                    
                case 3:
                	
                    System.out.println("Data:");
                    for (Integer value : data) {
                        System.out.print(value + " ");
                    }
                    System.out.println();
                    break;
                    
                case 4:
                    System.out.println("Duplicate values:");
                    Set<Integer> set = new HashSet<>();
                    Set<Integer> duplicates = new HashSet<>();
                    for (Integer value : data) {
                        if (!set.add(value)) {
                            duplicates.add(value);
                        }
                    }
                    for (Integer duplicate : duplicates) {
                        System.out.print(duplicate + " ");
                    }
                    System.out.println();
                    break;
                    
                default:
                    System.out.println("Invalid please try again");
                    break;
            }
        }
       
    }
}