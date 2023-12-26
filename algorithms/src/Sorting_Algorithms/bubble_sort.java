package Sorting_Algorithms;

public class bubble_sort {
    public static void main(String[] args) {
        int[] arr = {66, 23, 1, 0, 4, 8, 9, 11};
        bubble_sort(arr);

    }

    private static void bubble_sort(int[] arr) {

        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr.length;j++){
                if(arr[i]<arr[j]){
                    arr[i] = arr[i]+arr[j];
                    arr[j] = arr[i]-arr[j];
                    arr[i] = arr[i]-arr[j];
                }
            }
            for (int values : arr){
                System.out.print(values+ " ");
            }
            System.out.println();
        }
    }
}
