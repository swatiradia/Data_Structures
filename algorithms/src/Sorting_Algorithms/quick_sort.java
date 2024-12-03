package Sorting_Algorithms;

import java.util.Arrays;

public class quick_sort {

    public static void main(String[] args) {
        int[] arr = {2, 6, 5, 7, 3, 1, 8, 4};
        System.out.println("Before Sorting "+Arrays.toString(arr));
        quickSort(arr, 0, arr.length-1);
        System.out.println("After Sorting "+Arrays.toString(arr));
    }

    public static void swap (int [] array, int firstIndex, int secondIndex){
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }

    public static void quickSort(int []arr, int left, int right){
        if(left < right) {
            int pivotIndex = pivot(arr, left, right);
            quickSort(arr, left, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, right);
        }
    }

    private static int pivot(int[] arr, int pivotIndex, int endIndex) {

        int swapIndex = pivotIndex;

        for (int i= pivotIndex+1; i <=endIndex; i++){
            if(arr[i] < arr[pivotIndex]){
                swapIndex++;
                swap(arr, swapIndex, i);
            }
        }
        swap(arr, pivotIndex, swapIndex);
        return swapIndex;
    }
}
