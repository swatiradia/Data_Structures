package Searching_Algorithms;

import java.util.Arrays;

import java.util.Arrays;

public class binary_search_recursive {

    // Recursive method to perform binary search on a sorted array
    public static int binary_search_recursive(int numbers[], int n, int left, int right) {
        // Base case: if left index is less than or equal to right index
        if (left <= right) {
            // Calculate the middle index
            int mid = (left + right) / 2;

            // Check if the middle element is equal to the target value
            if (numbers[mid] == n) {
                // Target value found, return the index
                return mid;
            }
            // If the middle element is less than the target value
            else if (numbers[mid] < n) {
                // Recursively search in the right half of the array
                return binary_search_recursive(numbers, n, mid + 1, right);
            }
            // If the middle element is greater than the target value
            else {
                // Recursively search in the left half of the array
                return binary_search_recursive(numbers, n, left, mid - 1);
            }
        }
        // Target value not found, return -1
        return -1;
    }

    // Main method to demonstrate the binary search functionality
    public static void main(String[] args) {
        // Initialize an array of integers
        int numbers[] = {1, 2, 23, 4, 5, 6, 34, 8, 9, 10};

        // Sort the array in ascending order
        Arrays.sort(numbers);

        // Define the target value to search for
        int x = 1;

        // Call the binary_search_recursive method and store the result
        int result = binary_search_recursive(numbers, x, 0, numbers.length - 1);

        // Check if the result is -1 (element not found)
        if (result == -1) {
            // Print message if element is not present in the array
            System.out.println("Element is not present in the array");
        } else {
            // Print the index where the element is found
            System.out.println("Element is found in the array at index " + result);
        }
    }
}
