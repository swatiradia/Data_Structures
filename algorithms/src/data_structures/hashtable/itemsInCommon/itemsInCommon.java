package data_structures.hashtable.itemsInCommon;

import java.util.HashMap;

public class itemsInCommon {

    /**
     * Checks if there is any common item between two integer arrays.
     *
     * @param array1 The first integer array.
     * @param array2 The second integer array.
     * @return true if there is at least one common item, false otherwise.
     * Time Complexity is O(n).
     */
    public static boolean itemInCommon(int[] array1, int[] array2) {
        // Create a HashMap to store elements from the first array
        HashMap<Integer, Boolean> newHashMap = new HashMap<>();

        // Add all elements from the first array to the HashMap
        for (int i : array1) {
            newHashMap.put(i, true);
        }

        // Check if any element from the second array exists in the HashMap
        for (int j : array2) {
            if (newHashMap.get(j) != null) {
                // If the element is found, return true
                return true;
            }
        }

        // If no common element is found, return false
        return false;
    }

    public static void main(String[] args) {
        // Define two integer arrays for testing
        int[] array1 = {1, 3, 5};
        int[] array2 = {2, 4, 5};

        // Call the itemInCommon method and print the result
        System.out.println(itemInCommon(array1, array2));

    }
}

