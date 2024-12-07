/*
Problem Statement: Remove Element
You are given an array of integers, nums, and an integer value, val. Write a method removeElement(int[]
nums, int val) that removes all occurrences of val from the array in-place and returns the new length
of the modified array.

Requirements:
The array must be modified in-place, meaning no additional memory should be used to store another array.
The order of the elements in the array may change, but you do not need to maintain any specific order.
Elements beyond the new length of the array are not required to be in any specific state.
Example:
Input:
nums = [3, 2, 2, 3], val = 3

Output:
New length = 2
Modified array (first two elements): [2, 2]

Explanation:
After removing all occurrences of 3, the new length of the array is 2, and the first two elements
of the array are 2.*/

package problems;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveArrayElement {

    public static int removeElement(int [] nums, int val){
        // Initialize index j for writing elements in the array
        int j = 0;

        // Traverse the array from the start to end
        for (int i = 0; i < nums.length; i++){
            // If the current element is not equal to the given value
            if(nums[i] != val){
                //copy it to the position of the 'write' index j
                nums[j] = nums[i];
                //and increment the write index
                j++;
            }
            // If the current element equals val, it is skipped
        }
        // Return the number of elements not equal to val
        return j;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int length = input.nextInt();
        int [] nums = new int[length];
        System.out.println("Enter the array elements");
        for(int j=0; j<length; j++){
            nums[j] = input.nextInt();
        }
        System.out.println("Enter the value that needs to be removed");
        int val = input.nextInt();
        int count = removeElement(nums, val);
        System.out.println(Arrays.toString(Arrays.copyOfRange(nums, 0, count)));
        System.out.println("The count of the new array is " +count);

    }
}
