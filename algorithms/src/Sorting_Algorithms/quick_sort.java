package Sorting_Algorithms;

import java.util.Arrays;

public class quick_sort {

    public static void main(String[] args) {
        // Initialize the array with unsorted values
        int[] arr = {2, 6, 5, 7, 3, 1, 8, 4};

        // Print the array before sorting
        System.out.println("Before Sorting " + Arrays.toString(arr));

        // Call the quickSort function to sort the array
        quickSort(arr, 0, arr.length - 1);

        // Print the array after sorting
        System.out.println("After Sorting " + Arrays.toString(arr));
    }

    // Swap the elements at the specified indices in the array
    public static void swap(int[] array, int firstIndex, int secondIndex) {
        int temp = array[firstIndex]; // Temporarily store the value at firstIndex
        array[firstIndex] = array[secondIndex]; // Place the value at secondIndex into firstIndex
        array[secondIndex] = temp; // Place the temporary value into secondIndex
    }

    // The main QuickSort function that recursively sorts the array
    public static void quickSort(int[] arr, int left, int right) {
        // Base case: if left is not less than right, stop the recursion
        if (left < right) {
            // Find the pivot index that will divide the array into two parts
            int pivotIndex = pivot(arr, left, right);

            // Recursively sort the left side of the pivot
            quickSort(arr, left, pivotIndex - 1);

            // Recursively sort the right side of the pivot
            quickSort(arr, pivotIndex + 1, right);
        }
    }

    // This function finds the pivot and places it in the correct position
    private static int pivot(int[] arr, int pivotIndex, int endIndex) {
        int swapIndex = pivotIndex; // Initialize the swap index to be the pivot index

        // Loop through the array to rearrange elements based on comparison with the pivot
        for (int i = pivotIndex + 1; i <= endIndex; i++) {
            // If the current element is smaller than the pivot element
            if (arr[i] < arr[pivotIndex]) {
                swapIndex++; // Increment the swap index
                swap(arr, swapIndex, i); // Swap the elements to ensure smaller values are on the left
            }
        }

        // Place the pivot in its correct position by swapping it with the element at swapIndex
        swap(arr, pivotIndex, swapIndex);

        // Return the final position of the pivot element
        return swapIndex;
    }
}
