// O(n) is the time complexity
package dynamic_Programming;

import java.util.Scanner;

public class FibonacciMemoization {

    // Array to store the results of previously computed Fibonacci numbers (memoization)
    static Integer[] memo = new Integer[100];

    // Method to calculate the nth Fibonacci number using recursion and memoization
    public static int fib(int n) {
        // Check if the value for nth Fibonacci is already computed
        if (memo[n] != null) {
            return memo[n]; // Return the precomputed result
        }

        // Base cases: return n for Fibonacci(0) = 0 and Fibonacci(1) = 1
        if (n == 1 || n == 0) {
            return n;
        }

        // Recursively calculate Fibonacci for n-1 and n-2 and store the result in the memo array
        memo[n] = fib(n - 1) + fib(n - 2);

        return memo[n]; // Return the computed Fibonacci value for n
    }

    public static void main(String[] args) {
        // Prompt the user to enter a value for which Fibonacci number is to be calculated
        System.out.println("Enter the value:");
        Scanner input = new Scanner(System.in);

        // Read the integer input from the user
        int n = input.nextInt();

        // Calculate the nth Fibonacci number using the fib method
        int result = fib(n);

        // Output the result
        System.out.println("The Fibonacci number for " + n + " is: " + result);

        // Close the scanner resource to prevent memory leaks
        input.close();
    }
}

