package Sorting_Algorithms;

public class selection_sort {

    public static void main(String[] args) {
        // Initialize two arrays to demonstrate selection sort
        int[] arr = {8, 6, 4, 2, 1, 0, 5, 7, 3};
        int[] arr1 = {77, 2, 0, 1, 9, 3, 11, 34};

        // Call the selection_sort_minimum method to sort the first array in ascending order
        selection_sort_minimum(arr);

        // Call the selection_sort_maximum method to sort the second array in descending order
        selection_sort_maximum(arr1);
    }

    // Selection Sort algorithm to sort the array in ascending order (minimum at the start)
    private static void selection_sort_minimum(int[] arr) {
        int minIndex = 0;

        // Outer loop to iterate over the array and select elements for sorting
        for (int i = 0; i < arr.length - 1; i++) {
            minIndex = i; // Assume the current index has the minimum element

            // Inner loop to find the smallest element in the unsorted part of the array
            for (int j = i + 1; j < arr.length; j++) {
                // If a smaller element is found, update minIndex
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the element at index i
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;

            // Print the current state of the array after each iteration
            for (int values : arr) {
                System.out.print(values + " ");
            }
            System.out.println(); // Move to the next line after printing the array
        }

        // Print empty lines to separate results visually for clarity
        System.out.println();
        System.out.println();
    }

    // Selection Sort algorithm to sort the array in descending order (maximum at the start)
    private static void selection_sort_maximum(int[] arr1) {
        int maxIndex = 0;
        int temp = 0;

        // Outer loop to iterate over the array and select elements for sorting in descending order
        for (int i = arr1.length - 1; i >= 0; i--) {
            maxIndex = i; // Assume the current index has the maximum element

            // Inner loop to find the largest element in the unsorted part of the array
            for (int j = i - 1; j >= 0; j--) {
                // If a larger element is found, update maxIndex
                if (arr1[maxIndex] < arr1[j]) {
                    maxIndex = j;
                }
            }

            // Swap the found maximum element with the element at index i
            temp = arr1[maxIndex];
            arr1[maxIndex] = arr1[i];
            arr1[i] = temp;

            // Print the current state of the array after each iteration
            for (int values : arr1) {
                System.out.print(values + " ");
            }
            System.out.println(); // Move to the next line after printing the array
        }
    }

}
