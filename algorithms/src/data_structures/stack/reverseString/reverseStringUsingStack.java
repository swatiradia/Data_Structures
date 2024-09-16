package data_structures.stack.reverseString;

import java.util.Stack;

public class reverseStringUsingStack {

    /**
     * Reverses the given string using a stack.
     * @param rS The string to be reversed.
     * @return The reversed string.
     */

    public static String reverseString(String rS) {
        // Create a stack to hold characters of the string
        Stack<Character> stack = new Stack<>();

        // Initialize an empty string to build the reversed string
        String reverseString = "";

        // Push each character of the input string onto the stack
        for (char c : rS.toCharArray()) {
            stack.push(c);
        }

        // Pop characters from the stack and append them to the reversed string
        while (!stack.isEmpty()) {
            reverseString += stack.pop();
        }

        // Return the reversed string
        return reverseString;
    }

    public static void main(String[] args) {
        // Define the string to be reversed
        String myString = "hello";

        // Call the reverseString method and store the result
        String reversedString = reverseString(myString);

        // Print the reversed string
        System.out.println(reversedString);

        /*
            EXPECTED OUTPUT:
            ----------------
            olleh
        */
    }
}
