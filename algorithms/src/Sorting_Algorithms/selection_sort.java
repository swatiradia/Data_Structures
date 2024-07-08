package Sorting_Algorithms;

public class selection_sort {

    public static void main(String[] args) {
        int[] arr = {8, 6, 4, 2, 1, 0, 5, 7, 3};
        int[] arr1 = {77, 2, 0, 1, 9, 3, 11, 34};

        selection_sort_minimum(arr);
        selection_sort_maximum(arr1);
    }

    private static void selection_sort_minimum(int[] arr) {
        int minIndex = 0;
        int temp =0;

        for (int i=0; i<arr.length-1;i++){
            minIndex=i;
            for (int j=i+1; j<arr.length; j++) {
                if (arr[minIndex] > arr[j])
                    minIndex = j;
            }
                temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;

                for (int values : arr){
                    System.out.print( values + " ");
                }
                System.out.println();
        }
        System.out.println();
        System.out.println();
    }

    private static void selection_sort_maximum(int[] arr1) {
        int maxIndex = 0;
        int temp =0;

        for (int i=arr1.length-1; i>=0;i--){
            maxIndex=i;
            for (int j=i-1; j>=0; j--){
                if(arr1[maxIndex]<arr1[j])
                    maxIndex =j;
            }
            temp = arr1[maxIndex];
            arr1[maxIndex] = arr1[i];
            arr1[i] = temp;

            for (int values : arr1){
                System.out.print( values + " ");
            }
            System.out.println();
        }
    }
}
