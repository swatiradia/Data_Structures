package Searching_Algorithms;

import java.io.*;
import java.util.Arrays;

public class linear_search {
    public static int search(int arr[], int length, int n) {
        for (int i = 0; i < length; i++) {
            if (arr[i] == n)
                return i;
        }
            return -1;
    }

        public static void main (String[]args){
            int[] array = {6, 2, 10, 4, 1, 3, 0};
            Arrays.sort(array);
            int x = 4;
            int result = search(array, array.length, x);
            if (result == -1) {
                System.out.println("Element is not present in the array");
            } else {
                System.out.println("Element is present in the array at the index " + result);
            }

        }
}


