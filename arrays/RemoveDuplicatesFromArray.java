package com.hughes.arrays;

import java.util.Arrays;

/**
 * @author 91959
 *
 */

//Write a Java program to remove duplicate elements from a given array and return the updated array length.
//Sample array: [20, 20, 30, 40, 50, 50, 50]
//After removing the duplicate elements the program should return 4 as the new length of the array.

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
    	
        // Sample array with duplicate elements
        int[] arr = {20, 20, 30, 40, 50, 50, 50};
        
        // Call the method to remove duplicates and get the modified array
        int[] modifiedArr = removeDuplicatesInArray(arr);
        
        // Print the new length of the modified array
        System.out.println("New length of the array after removing duplicates: " + modifiedArr.length);
        
        // Print the modified array
        System.out.println("Modified array:");
        
        for (int num : modifiedArr) {
            System.out.print(num + " ");
        }
    }

    public static int[] removeDuplicatesInArray(int[] arr) {
    	
        // Check if the array is empty, return an empty array if so
        if (arr.length == 0) {
            return new int[0];
        }

        // Sort the array to bring duplicate elements together
        Arrays.sort(arr);

        // Initialize a list to store unique elements
        int[] uniqueArr = new int[arr.length];
        int index = 0;

        // Iterate over the sorted array
        for (int i = 0; i < arr.length; i++) {
            // If the current element is different from the previous element
            if (i == 0 || arr[i] != arr[i - 1]) {
                // Add the current element to the unique array
                uniqueArr[index++] = arr[i];
            }
        }

        // Trim the unique array to remove unused space
        return Arrays.copyOfRange(uniqueArr, 0, index);
    }
}
