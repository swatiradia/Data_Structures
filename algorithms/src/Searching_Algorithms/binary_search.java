package Searching_Algorithms;

import java.util.Arrays;

public class binary_search {

    public  static int binary_search(int arr[], int n) {
        int left = 0;
        int right = arr.length-1;

        while (left <= right) {
            int mid = (left + right)/2;
            if (arr[mid] == n){
                return mid;
            } else if (arr[mid] < n) {
                left = mid +1;
            }else {
                right = mid -1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int array [] = {5, 6, 3, 21, 30, 49, 7, 19, 11, 10, 8, 2};
        Arrays.sort(array);
        int x = 1;
        int result = binary_search(array, x);
        if(result == -1){
            System.out.println("Element is not present in the array");
        }else {
            System.out.println("Element is present in the array at index " +result);
        }
    }
}
