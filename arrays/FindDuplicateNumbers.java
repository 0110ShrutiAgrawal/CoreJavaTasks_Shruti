package com.hughes.arrays;

//Program to find duplicate numbers in an array if it contains multiple duplicates? ]

/**
 * @author 91959
 *
 */
public class FindDuplicateNumbers {
    public static void main(String[] args) {
    	
        // Sample array with duplicate elements
        int[] arr = {1,2,7,8,7,8,9,2,4,5,7,6,1,3,2};
        
        // Call the method to find and print duplicate numbers
        findDuplicates(arr);
    }

    public static void findDuplicates(int[] arr) {
    	
        // Print message before listing duplicate numbers
        System.out.print("Duplicate numbers in the given array are: ");
        
        // Iterate over the array
        for (int i = 0; i < arr.length; i++) {
        	
            // Compare element at index i with elements at higher indices
            for (int j = i + 1; j < arr.length; j++) {
            	
                // If duplicate is found, print it and break inner loop
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                    break; // To avoid printing the same duplicate multiple times
                }
            }
        }
    }
}
