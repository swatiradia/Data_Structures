package Sorting_Algorithms;

public class insertion_sort {

    public static void main(String[] args) {
        int[] nums = {6, 5, 2, 3, 1};

        insertion_Sort(nums);
    }

    private static void insertion_Sort(int[] arr) {

        for (int i =1; i<arr.length; i++){

            int key = arr[i];
            int j = i-1;

            while(j >= 0 && arr[j] > key){
                arr[j+1] =arr[j];
                j--;
            }
            arr[j+1] = key;
            for (int num : arr){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
