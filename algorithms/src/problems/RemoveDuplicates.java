package problems;

import java.util.Arrays;

public class RemoveDuplicates {


    // Method to remove duplicate elements from a sorted integer array
    // Returns the count of unique elements in the array
    public static int removeDuplicates(int[] numberArray) {
        // Initialize a pointer to track the position of unique elements
        int j = 1;

        // If the array is empty, there are no unique elements
        if (numberArray.length == 0) return 0;

        // Iterate through the array starting from the second element
        for (int i = 1; i < numberArray.length; i++) {
            // If the current element is different from the previous one, it is unique
            if (numberArray[i] != numberArray[i - 1]) {
                // Move the unique element to the 'j' index and increment 'j'
                numberArray[j] = numberArray[i];
                j++;
            }
        }

        // Return the count of unique elements
        return j;
    }


    public static void main(String[] args) {

        int [] numberArray = {1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4};
        int result = removeDuplicates(numberArray);
        System.out.println("The length of th new array is "+result+
                "\nThis is the new array " + Arrays.toString(numberArray));
    }
}
