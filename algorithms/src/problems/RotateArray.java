/*
Problem Statement: Array Rotation
Implement a method rotate that rotates an array of integers to the right by 𝑘 steps, where
𝑘 is a non-negative integer.

Input:
An array of integers nums (non-empty).
A non-negative integer k, representing the number of steps to rotate the array.
Output:
The function modifies the input array nums in-place, rotating it to the right by
𝑘 steps. It does not return anything.

Example:
Input:
nums = {1, 2, 3, 4, 5, 6, 7}
k = 3

Output:
nums = {5, 6, 7, 1, 2, 3, 4}

* */
package problems;

import java.util.Arrays;

public class RotateArray {

    public static void rotateArrayByK(int[] nums, int k) {
        // Adjust k to ensure it is within the bounds of the array length.
        k = k % nums.length;

        // Step 1: Reverse the first part of the array (from start to nums.length - k - 1)
        for (int start = 0, end = nums.length - k - 1; start < end; start++, end--) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
        }
        System.out.println("After reversing the first part: " + Arrays.toString(nums));

        // Step 2: Reverse the second part of the array (from nums.length - k to the end)
        for (int start = nums.length - k, end = nums.length - 1; start < end; start++, end--) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
        }
        System.out.println("After reversing the second part: " + Arrays.toString(nums));

        // Step 3: Reverse the entire array to achieve the final rotated array
        for (int start = 0, end = nums.length - 1; start < end; start++, end--) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
        }

        // Final rotated array
        System.out.println("Final rotated array: " + Arrays.toString(nums));
    }


    public static void main(String[] args) {

        int [] nums = {1, 2, 3, 4, 5, 6, 7, 8};
        int k = 4;

        System.out.println(Arrays.toString(nums));
        rotateArrayByK(nums, k);

        System.out.println("The rotated array by" +k+ "steps is \n"  + Arrays.toString(nums));
    }
}
