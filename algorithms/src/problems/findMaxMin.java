/*Problem Statement:

Given an array of integers, implement a method that determines the maximum and minimum numbers in the
array. The method should return an array where the first element is the maximum number and the second
element is the minimum number.

Ensure the solution handles arrays with various lengths and values appropriately.*/

package problems;

import java.util.Arrays;

public class findMaxMin {

    public static int[] findMaxMin(int[] array) {
        // Initialize the maximum and minimum values to the first element of the array.
        int maximum = array[0];
        int minimum = array[0];

        // Iterate through the array to find the maximum and minimum values.
        for (int i : array) {
            // Update the maximum value if the current element is greater than the current maximum.
            if (i > maximum) {
                maximum = i;
            }
            // Update the minimum value if the current element is smaller than the current minimum.
            else if (i < minimum) {
                minimum = i;
            }
        }

        // Return the maximum and minimum values as an array, with maximum at index 0 and minimum at index 1.
        return new int[]{maximum, minimum};
    }

    public static void main(String[] args) {
        // Define an array of integers to test the findMaxMin method.
        int[] array = {10, 10, 0, 2, -1, 3};

        // Call the findMaxMin method and store the result in a new array.
        int[] result = findMaxMin(array);

        // Print the maximum and minimum values in the array.
        System.out.println("The Max and Min in the array are " + Arrays.toString(result));
    }
}
