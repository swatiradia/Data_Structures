/* Problem Statement: PlusMinus
You are given an array of integers. Your task is to calculate the ratios of its elements that
are positive, negative, and zero. Print the decimal value of each ratio on a new line, formatted
to six decimal places.

Input Format
The first line contains an integer, n, the size of the array.
The second line contains n space-separated integers representing the array elements.
Output Format
Print the following 3 lines, each formatted to six decimal places:

The ratio of positive numbers in the array.
The ratio of negative numbers in the array.
The ratio of zeros in the array.

Input : -4 3 -9 0 4 1

Output : 0.500000
         0.333333
         0.166667
*/

package problems;

public class PositiveNegativeRatio {

    public static void positiveNegativeRatioSolution(int[] arr) {
        // Initialize counters for positive, negative, and zero numbers
        int positive = 0;
        int negative = 0;
        int zero = 0;

        // Loop through each element in the array to classify numbers
        for (int i : arr) {
            if (i < 0) {
                // Increment the counter for negative numbers
                negative++;
            } else if (i == 0) {
                // Increment the counter for zeros
                zero++;
            } else {
                // Increment the counter for positive numbers
                positive++;
            }
        }

        // Calculate the ratio of positive numbers to the total count
        float positiveRatio = (float) positive / arr.length;
        // Calculate the ratio of negative numbers to the total count
        float negativeRatio = (float) negative / arr.length;
        // Calculate the ratio of zeros to the total count
        float zeroRatio = (float) zero / arr.length;

        // Print the ratios with six decimal places
        System.out.printf("The ratio of positive numbers: %.6f%n", positiveRatio);
        System.out.printf("The ratio of negative numbers: %.6f%n", negativeRatio);
        System.out.printf("The ratio of zero numbers: %.6f%n", zeroRatio);
    }


    public static void main(String[] args) {
        int [] arr = { -1, -2, 0, 0, 3, 4, 5, 2, -8, -10, -3, 0};

        positiveNegativeRatioSolution(arr);

    }
}
