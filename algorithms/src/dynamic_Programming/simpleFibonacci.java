// O(n) is the time complexity actually O(2n-1) removing constants make it O(n).
package dynamic_Programming;

import java.util.Scanner;

public class simpleFibonacci {

    // Method to calculate the nth Fibonacci number using an iterative approach
    public static int fibonacci(int n) {
        // Base case: the first two Fibonacci numbers are 0 and 1
        int first = 0;
        int second = 1;
        int result = 0;

        // Loop through from 1 to n-1 (as we already know the first two Fibonacci numbers)
        for (int i = 1; i < n; i++) {
            // Calculate the next Fibonacci number by adding the previous two
            result = first + second;

            // Update the previous two Fibonacci numbers for the next iteration
            first = second;
            second = result;
        }
        // Return the nth Fibonacci number
        return result;
    }

    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input the number of Fibonacci terms they want to calculate
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();

        // Call the fibonacci method to calculate the nth Fibonacci number
        int result = fibonacci(n);

        // Output the result (nth Fibonacci number)
        System.out.println(result);

        // Close the scanner object
        scanner.close();
    }
}
