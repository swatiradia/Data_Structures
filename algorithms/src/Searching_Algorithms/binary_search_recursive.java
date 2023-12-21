package Searching_Algorithms;

import java.util.Arrays;

public class binary_search_recursive {
    public static int binary_search_recursive(int numbers[], int n, int  left, int right) {

        if (left <= right) {
            int mid = (left + right)/2;
            if (numbers[mid] == n){
                return mid;
            } else if (numbers[mid] < n) {
                return binary_search_recursive(numbers, n, mid+1, right);
            }else {
                return binary_search_recursive(numbers, n, left, mid-1);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers [] = {1, 2, 23, 4, 5, 6, 34, 8, 9, 10};
        Arrays.sort(numbers);
        int x = 1;
        int result = binary_search_recursive(numbers, x, 0, numbers.length-1);

        if (result == -1){
            System.out.println("Element is not present in the array");
        }
        else{
            System.out.println("Element is found in the array");
        }
    }
}
