package Sorting_Algorithms;

import java.util.Arrays;

public class merge_sort {

    // Method to perform Merge Sort on an array
    private static int[] mergeSort(int[] arr) {
        // Base case: if the array has only one element, it is already sorted
        if (arr.length == 1) return arr;

        // Find the midpoint of the array
        int mid = arr.length / 2;

        // Recursively sort the left half of the array

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));


        // Recursively sort the right half of the array
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));


        // Merge the two sorted halves and return the sorted array
        return merge(left, right);
    }

    // Method to merge two sorted arrays into one sorted array
    private static int[] merge(int[] array1, int[] array2) {
        // Create an array to hold the combined elements

        int[] combined = new int[array1.length + array2.length];

        // Initialize indices for combined array and both input arrays
        int index = 0;
        int i = 0;
        int j = 0;

        // Compare elements from both arrays and add the smaller one to the combined array
        while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j]) {
                combined[index] = array1[i];
                index++;
                i++;
            } else {
                combined[index] = array2[j];
                index++;
                j++;
            }
        }

        // Add any remaining elements from the first array to the combined array
        while (i < array1.length) {
            combined[index] = array1[i];
            index++;
            i++;
        }

        // Add any remaining elements from the second array to the combined array
        while (j < array2.length) {
            combined[index] = array2[j];
            index++;
            j++;
        }

        // Return the fully merged and sorted array
        return combined;
    }

    public static void main(String[] args) {
        // Example input array
        int originalArray[] = {4, 5, 1, 3, 6, 2};

        // Perform merge sort on the array
        int sortedArray[] = mergeSort(originalArray);

        // Print the original array
        System.out.println("This is the original array: " + Arrays.toString(originalArray));

        // Print the sorted array
        System.out.println("This is the sorted array: " + Arrays.toString(sortedArray));
    }

}
