package Sorting_Algorithms;

public class bubble_sort {

    public static void main(String[] args) {
        // Initialize an array of integers to be sorted
        int[] arr = {66, 23, 1, 0, 4, 8, 9, 11};

        // Call the bubble_sort method to sort the array
        bubble_sort(arr);
    }

    /**
     * Performs Bubble Sort on the given array.
     *
     * @param arr The array to be sorted.
     */
    private static void bubble_sort(int[] arr) {
        // Outer loop to control the number of passes
        for (int i = 0; i < arr.length; i++) {
            // Inner loop to perform comparisons and swaps
            for (int j = 0; j < arr.length - 1; j++) {
                // Compare adjacent elements
                if (arr[j] > arr[j + 1]) {
                    // Swap elements if they are in the wrong order
                    arr[j] = arr[j] + arr[j + 1];
                    arr[j + 1] = arr[j] - arr[j + 1];
                    arr[j] = arr[j] - arr[j + 1];
                }
            }
            // Print the array after each pass to show the progress
            for (int value : arr) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
