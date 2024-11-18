package data_structures.heap;

import java.util.ArrayList;
import java.util.List;

public class Heap {

    // List to store elements in the heap
    private List<Integer> heap;

    // Constructor to initialize an empty heap
    public Heap(){
        this.heap = new ArrayList<>();
    }

    // Returns a copy of the current heap
    public List<Integer> getHeap(){
        return new ArrayList<>(heap);
    }

    // Calculates the index of the left child of a given node
    private int leftChild(int index){
        return 2 * index + 1;
    }

    // Calculates the index of the right child of a given node
    private int rightChild(int index){
        return 2 * index + 2;
    }

    // Calculates the index of the parent of a given node
    private int parentIndex(int index){
        return (index - 1) / 2;
    }

    // Swaps elements at the given indices in the heap
    private void swap(int index1 , int index2){
        int temp = heap.get(index1);
        heap.set(index1, heap.get(index2));
        heap.set(index2, temp);
    }

    // Method to maintain the heap property by sinking down the element at the given index
    private void sinkDown(int index) {
        // Initialize maxIndex as the current index (this is where the largest element might be)
        int maxIndex = index;

        // Continuously iterate until the heap property is restored
        while(true) {
            // Calculate the indices of the left and right children of the current node
            int leftIndex = leftChild(index);
            int rightIndex = rightChild(index);

            // Check if the left child exists and is larger than the current largest element (maxIndex)
            if (leftIndex < heap.size() && heap.get(leftIndex) > heap.get(maxIndex)) {
                maxIndex = leftIndex; // Update maxIndex if the left child is larger
            }

            // Check if the right child exists and is larger than the current largest element (maxIndex)
            if (rightIndex < heap.size() && heap.get(rightIndex) > heap.get(maxIndex)) {
                maxIndex = rightIndex; // Update maxIndex if the right child is larger
            }

            // If the maxIndex has changed, swap the elements at index and maxIndex
            if (maxIndex != index) {
                swap(index, maxIndex);
                index = maxIndex; // Update index to the new position to continue the process
            } else {
                // If no swap was made, the heap property is restored, so exit the loop
                return;
            }
        }
    }


    // Inserts a new value into the heap, maintaining the max-heap property
    public void insert(int value){
        // Add the new value at the end of the heap
        heap.add(value);

        // Start at the newly added element
        int current = heap.size() - 1;

        // Move the new element up the heap until the max-heap property is restored
        while (current > 0 && heap.get(current) > heap.get(parentIndex(current))){
            // Swap the current element with its parent if it is larger
            swap(current, parentIndex(current));
            // Update the current index to the parent's index
            current = parentIndex(current);
        }
    }

    public Integer remove(){
        if(heap.size() == 0){
            return null;
        }

        if (heap.size() == 1){
            return heap.remove(0);
        }

        int maxValue = heap.get(0);
        heap.set(0, heap.remove(heap.size()-1));
        sinkDown(0);

        return maxValue;
    }



}
