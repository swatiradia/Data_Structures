### Bubble Sort

The time complexity of Bubble Sort is \(O(n^2)\) in the worst case and \(O(n)\) in the best case.

1. Start at the beginning of the list: Begin with the first element in the list.
2. Compare adjacent elements: Compare the first two elements in the list. If the first element is larger than the second, swap them.
3. Move to the next pair: Move on to the next pair of elements (the second and the third) and compare them. Again, swap if they are in the wrong order.
4. Continue iterating: Continue this process, moving through the entire list and comparing and swapping adjacent elements as needed. This is like the "bubbles" of larger elements moving to the end of the list.
5. Repeat until sorted: Keep iterating through the list until no more swaps are needed. At this point, the list is sorted.

### Selection Sort

The time complexity of Selection Sort is \(O(n^2)\) in the worst case and \(O(n^2)\) in the best case.

1. Find the smallest element: Start by finding the smallest element in the unsorted part of the list.
2. Swap with the first unsorted element: Once you find the smallest element, swap it with the first element in the unsorted part of the list. Now, the smallest element is in its correct sorted position.
3. Expand the sorted part: Expand the sorted part of the list to include the element you just swapped.
4. Repeat: Repeat the process by finding the smallest element in the remaining unsorted part, swapping it with the first element in that part, and expanding the sorted part.
5. Continue until sorted: Keep repeating these steps until the entire list is sorted. The sorted part will keep growing, and the unsorted part will keep shrinking until there's nothing left in the unsorted part.

### Insertion Sort

The time complexity of Insertion Sort is \(O(n^2)\) in the worst case and \(O(n)\) in the best case.

1. Start with the second element: Begin with the second element in the list (index 1). The idea is that the first element is already considered "sorted" with respect to itself.
2. Compare and insert: Compare the second element with the first one. If the second element is smaller, swap them. Otherwise, leave them as they are.
3. Move to the next element: Move on to the third element. Compare it with the elements in the sorted part of the list (which is just one element at this point), and insert it into the correct position by shifting the larger elements to the right.
4. Repeat: Keep repeating this process for each subsequent element in the list. Each time, the sorted part of the list grows, and the unsorted part shrinks.
5. Continue until sorted: Continue this process until you've considered all elements in the list. At this point, the entire list is sorted.

### Quick Sort

The average time complexity of Quick Sort is O(n log n). However, in the worst case, it can degrade to \(O(n^2)\).

1. Choose a pivot: Pick an element from the array to act as a "pivot." The choice of the pivot can affect the algorithm's efficiency.
2. Partition the array: Rearrange the elements in the array so that all elements smaller than the pivot are on the left, and all elements larger than the pivot are on the right. The pivot is now in its final sorted position.
3. Recursively sort the sub-arrays: Apply the same process to the sub-arrays on the left and right of the pivot. Choose pivots for these sub-arrays, partition them, and repeat the process until the entire array is sorted.
4. Combine the results: As the recursion unfolds, the individual elements find their correct positions, and the entire array becomes sorted.

### Merge Sort

The time complexity of Merge Sort is O(n log n), where n is the number of elements in the array.

1. Divide the array: Start by dividing the unsorted list into two halves. If the list is empty or has one element, it is already sorted.
2. Recursively sort the halves: Apply the merge sort algorithm to each of the two halves. This involves further dividing each half into even smaller halves until you reach lists of size one or zero.
3. Merge the halves: Combine the two sorted halves into a single sorted list. This merging step is the key to the algorithm.
4. Repeat: Continue the process, recursively dividing, sorting, and merging until the entire list is sorted.