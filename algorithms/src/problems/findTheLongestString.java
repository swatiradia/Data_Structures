/*Problem Statement
You need to write a method that takes a list of words (array of strings) and finds the longest word in the list. If two or more words are equally long, return the first one that appears in the list.

Example:
Input:
["apple", "banana", "cherry", "date"]

Output:
"banana"*/

package problems;

public class findTheLongestString {

    // A method to find the longest string in an array of strings
    public static String findTheLongestString(String[] fruits) {
        // Initialize an empty string to store the result
        String resultString = "";

        // Iterate through each string in the array
        for (String fruit : fruits) {
            // Check if the current string is longer than the current longest string
            if (fruit.length() > resultString.length()) {
                // Update the longest string
                resultString = fruit;
            }
        }
        // Return the longest string
        return resultString;
    }

    public static void main(String[] args) {
        // Declare and initialize an array of strings
        String[] fruits = {"apple", "banana", "cherry", "date", "mangosteen"};

        // Call the method to find the longest string and store the result
        String result = findTheLongestString(fruits);

        // Check if the result is non-empty and print the appropriate message
        if (result.length() != 0) {
            System.out.println("The longest string is " + result);
        } else {
            // Handle the case when the array is empty or has no valid strings
            System.out.println("The array of string is empty");
        }
    }

}
