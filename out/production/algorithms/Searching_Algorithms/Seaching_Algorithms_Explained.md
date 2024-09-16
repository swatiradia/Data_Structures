### Linear Search
## Time Complexity:𝑂(𝑛)

Steps:
1. Start from the Beginning: Begin at the start of the list.
2. Check Each Element: Examine each element one by one.
3. Find the Element: If the current element matches the target, stop the search.
4. Move to the Next Element: If not, proceed to the next element and repeat the process.
5. Continue Until Found or End: Keep repeating steps 2-4 until you either find the target or reach the end of the list.

Explanation: Linear search examines each element in the list sequentially. It is straightforward but can be inefficient for large lists as it may require checking every element.

## Binary Search
## Time Complexity: 𝑂(log 𝑛)

#### Precondition: The list must be sorted.

Steps:
1. Start with a Sorted List: Ensure the list is sorted.
2. Check the Middle Item: Look at the middle item of the list.
3. Item Found: If the middle item is equal to the target, the search is complete.
4. Target Less Than Middle: If the target is less than the middle item, repeat the search in the left half of the list.
5. Target Greater Than Middle: If the target is greater than the middle item, repeat the search in the right half of the list.
6. Repeat Until Found or Range Exhausted: Continue this process, narrowing down the search range each time, until the item is found, or it is determined that the item is not in the list.

Explanation: Binary search is much faster than linear search for large lists because it repeatedly divides the search range in half. It is efficient but requires that the list be sorted.

### Binary Recursive Search
## Time Complexity: 𝑂(log 𝑛)

#### Precondition: The list must be sorted.

Steps:
1. Start with a Sorted List: Ensure the list is sorted.
2. Define the Recursive Function: Create a function that takes the list, the target item, and the range to search within (initially, the entire list).
3. Check the Middle Item: Look at the middle item within the given range.
4. Item Found: If the middle item is equal to the target, the search is complete.
5. Target Less Than Middle: If the target is less than the middle item, make a recursive call with the left half of the range.
6. Target Greater Than Middle: If the target is greater than the middle item, make a recursive call with the right half of the range.
7. Repeat Until Found or Range Exhausted: Continue the recursion until the item is found or the range is exhausted.

Explanation: Binary recursive search is similar to binary search but uses recursion rather than iteration. It efficiently narrows down the search range by recursively dividing it, provided the list is sorted.

