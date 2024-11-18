package Searching_Algorithms;

import java.io.*;
import java.util.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class linear_search {

//    Performs a linear search to find the index of the target value in the array.

    public static int search(int arr[], int length, int n) {
        // Iterate through each element in the array
        for (int i = 0; i < length; i++) {
            // Check if the current element is equal to the target value
            if (arr[i] == n)
                // If found, return the index
                return i;
        }
        // If the target value is not found in the array, return -1
        return -1;
    }

    public static void main(String[] args) {
        // Initialize an array of integers
        int[] array = {6, 2, 10, 4, 1, 3, 0};

        // Sort the array in ascending order, not necessary !!
//        Arrays.sort(array);

        // Define the target value to search for
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to find ");
        int x = input.nextInt();

        // Call the search method to find the index of the target value
        int result = search(array, array.length, x);

        // Check if the result is -1 (target value not found)
        if (result == -1) {
            // Print message if element is not present in the array
            System.out.println("Element is not present in the array");
        } else {
            // Print the index where the element is found
            System.out.println("Element is present in the array at index " + result);
        }
    }
}



