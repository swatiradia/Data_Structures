package Searching_Algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class practice {

    public static void main(String[] args){
        int[] numbers = {2, 5, 7, 9, 10, 12, 23, 41, 3, 11, 13};
        Arrays.sort(numbers);
        System.out.println("Enter the number that you want to search");
        Scanner input = new Scanner(System.in);
        int input_num = input.nextInt();
        int x = binary_search_number(numbers, input_num, 0, numbers.length-1);
        if(x != -1){
            System.out.println("The number is present in the array " +x);
        }else {
            System.out.println("Number is not present in the array");
        }

    }

    public static int binary_search_number(int [] numbers, int input_num, int left, int right){
        while(left <= right){

            int mid = (left+right)/2;
            if(numbers[mid] == input_num){
                return mid;
            }
            else  if (numbers[mid] < input_num){
                return binary_search_number(numbers, input_num,  mid+1, right);
            }
            else{
               return binary_search_number(numbers, input_num, left, mid-1);
            }
        }

       return -1;
    }
}
