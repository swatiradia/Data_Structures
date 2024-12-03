/*Design and implement a program to count the number of vowels (a, e, i, o, u) in a given
input string provided by the user. The program should:

Take a string input from the user.
Check each character in the string to determine if it is a vowel (case-insensitive).
Maintain a count of all vowel occurrences in the string.
Output the total number of vowels in the input string.
The program should handle strings of varying lengths and include appropriate validation for
edge cases like empty strings or strings without vowels. */


package problems;

import java.util.Scanner;

public class countVowels {


    public static int countOfVowels(String userString){
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        int count = 0;
        for(int i = 0 ; i < userString.length(); i++){
            char currentChar = Character.toLowerCase(userString.charAt(i));
            for(char vowel : vowels){
                if(currentChar == vowel){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string \n");
        String userString = input.nextLine();
        int count = countOfVowels(userString);

        if(count > 0){
            System.out.println("The number of vowels in the string are "+count);
        }else {
            System.out.println("The number of vowels in the string is " +count);
        }
    }
}
