### Linear Search

The time complexity of Linear search is O(n).

1. Start from the beginning of the list.
2. Check each element one by one.
3. If the current element is the one you're looking for, stop the search.
4. If not, move on to the next element and repeat steps 2-3.
5. Continue this process until you find the desired element or reach the end of the list.

### Binary Search

The time complexity of Binary search is O(log n).

1. Start with a sorted list of items.
2. Look at the middle item of the list.
3. If the item you're looking for is equal to the middle item, you're done! You've found it.
4. If the item is less than the middle item, repeat the search in the left half of the list (since the list is sorted, you know the item won't be in the right half).
5. If the item is greater than the middle item, repeat the search in the right half.
6. Continue this process, narrowing down the search range each time, until you find the item or determine that it's not in the list.

### Binary Recursive Search

The time complexity of Binary recursive search is O(log n).

1. Start with a sorted list of items.
2. Define a function that takes the list, the item to find, and the range to search within (initially, the entire list).
3. Look at the middle item within the given range.
4. If the item is equal to the middle item, you're done! You've found it.
5. If the item is less than the middle item, make a recursive call to the function with the left half of the range.
6. If the item is greater than the middle item, make a recursive call to the function with the right half of the range.
7. Repeat these steps until you find the item or determine that it's not in the list.