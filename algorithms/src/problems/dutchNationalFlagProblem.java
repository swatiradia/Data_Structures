/*
Problem Statement: Dutch National Flag Problem
You are given an array consisting of only three distinct integers: 0, 1, and 2. Your task is to sort
the array in-place so that all 0s appear before 1s, and all 1s appear before 2s. The final array should
be sorted in the order [0, 1, 2].

Constraints:
The algorithm must sort the array in O(n) time complexity.
The algorithm should use O(1) additional space (in-place sorting).
The order of the elements should follow: all 0s first, followed by 1s, and finally all 2s.
Input:
An unsorted array arr of size n where:

arr[i] ∈ {0, 1, 2} for all valid i.
Output:
The same array arr, modified to be sorted as described above. */


package problems;

import java.util.Arrays;

public class dutchNationalFlagProblem {

    public static void dutchNationalFlagSolution(int[] numberArray) {
        // Initialize pointers
        int low = 0;         // Points to the position where the next 0 should be placed
        int mid = 0;         // Traverses the array
        int high = numberArray.length - 1; // Points to the position where the next 2 should be placed

        // Process elements until mid-crosses high
        while (mid <= high) {
            if (numberArray[mid] == 0) {
                // If the current element is 0, swap it with the element at 'low'
                // This places the 0 in its correct section
                int temp = numberArray[low];
                numberArray[low] = numberArray[mid];
                numberArray[mid] = temp;

                // Increment both 'low' and 'mid' as the 0 is placed correctly
                low++;
                mid++;
            } else if (numberArray[mid] == 1) {
                // If the current element is 1, it's already in the correct section
                // Simply move 'mid' to the next element
                mid++;
            } else if (numberArray[mid] == 2) {
                // If the current element is 2, swap it with the element at 'high'
                // This places the 2 in its correct section
                int temp = numberArray[high];
                numberArray[high] = numberArray[mid];
                numberArray[mid] = temp;

                // Decrement 'high' as the 2 is placed correctly
                // Do not increment 'mid' because the swapped element at 'mid'
                // still needs to be processed
                high--;
            }
        }
    }

    public static void main(String[] args) {
        // Input array containing 0s, 1s, and 2s in random order
        int[] numberArray = {1, 0, 2, 2, 2, 1, 1, 0, 2, 0, 0, 0, 1};

        // Unsorted array
        System.out.println("The unsorted array: " + Arrays.toString(numberArray));

        // Call the Dutch National Flag sorting solution
        dutchNationalFlagSolution(numberArray);

        // Final sorted array will be displayed after the function call
        System.out.println("The sorted array: " + Arrays.toString(numberArray));
    }
}

