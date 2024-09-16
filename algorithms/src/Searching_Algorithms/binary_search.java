package Searching_Algorithms;

import java.util.Arrays;

public class binary_search {

    // Method to perform binary search on a sorted array
    public static int binary_search(int arr[], int n) {
        // Initialize left and right pointers
        int left = 0;                // Left pointer starts at the beginning of the array
        int right = arr.length - 1;  // Right pointer starts at the end of the array

        // Continue searching while left pointer is less than or equal to right pointer
        while (left <= right) {
            // Calculate the middle index
            int mid = (left + right) / 2;

            // Check if the middle element is equal to the target value
            if (arr[mid] == n) {
                // Target value found, return the index
                return mid;
            }
            // If the middle element is less than the target value
            else if (arr[mid] < n) {
                // Move the left pointer to the right of the middle index
                left = mid + 1;
            }
            // If the middle element is greater than the target value
            else {
                // Move the right pointer to the left of the middle index
                right = mid - 1;
            }
        }
        // Target value not found in the array, return -1
        return -1;
    }

    // Main method to demonstrate the binary search functionality
    public static void main(String[] args) {
        // Initialize an array of integers
        int array[] = {5, 6, 3, 21, 30, 49, 7, 19, 11, 10, 8, 2};

        // Sort the array in ascending order
        Arrays.sort(array);

        // Define the target value to search for
        int x = 1;

        // Call the binary_search method and store the result
        int result = binary_search(array, x);

        // Check if the result is -1 (element not found)
        if (result == -1) {
            // Print message if element is not present in the array
            System.out.println("Element is not present in the array");
        } else {
            // Print the index where the element is found
            System.out.println("Element is present in the array at index " + result);
        }
    }
}
