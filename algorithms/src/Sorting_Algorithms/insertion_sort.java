package Sorting_Algorithms;

import java.util.Arrays;

public class insertion_sort {

    public static void main(String[] args) {
        // Initialize an array with unsorted integers
        int[] nums = {4, 2, 6, 5, 1, 3};
//        for (int num : nums) {
//            System.out.print(num + " ");
//        }
        System.out.println(Arrays.toString(nums));
        // Call the insertion sort function to sort the array
        insertion_Sort(nums);
    }

    /**
     * This method implements the insertion sort algorithm to sort an array.
     * It iterates through the array, shifting elements as needed to maintain
     * a sorted portion at the start of the array.
     *
     * @param arr The array to be sorted
     */
    private static void insertion_Sort(int[] arr) {
        // Loop through the array starting from the second element (index 1)
        for(int i = 1; i < arr.length; i++){

            int key = arr[i];
            // Initialize a variable 'j' to track the position of elements to compare with the key
            int j = i-1;

            // Shift elements of the sorted portion of the array that are greater than the key
            while(j >=0 && arr[j] > key){
                // Place the key in its correct position in the sorted portion
               arr[j+1] = arr[j];
               arr[j] = key;
               j--;
            }

            // Print the array after each iteration to show sorting progress
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println(); // Print a newline for better readability
        }
    }
}
