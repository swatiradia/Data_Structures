package problems;

public class maxSubArray {

    public static void main(String[] args) {

        // Initialize the array with both positive and negative integers
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        // Call the findTheMaxSubArray method to find the maximum sum of a subarray
        int result = findTheMaxSubArray(arr);

        // Print the result, which is the maximum sum of the subarray
        System.out.println("The max value of the sub array is " + result);
    }

    // Method to find the maximum sum of a contiguous subarray using Kadane's Algorithm
    private static int findTheMaxSubArray(int[] arr) {
        // Initialize maxValue to the first element of the array
        int maxValue = arr[0];

        // Initialize maximum to the first element of the array (this will hold the overall maximum sum)
        int maximum = arr[0];

        // Loop through the array starting from the second element
        for (int i = 1; i < arr.length; i++) {
            /* Update maxValue to be the maximum of the current element or the current
            element plus the previous maxValue*/
            maxValue = Math.max(arr[i], maxValue + arr[i]);

            // Update maximum if the current maxValue is greater than the current maximum
            maximum = Math.max(maxValue, maximum);
        }

        // Return the overall maximum sum found
        return maximum;
    }

}
