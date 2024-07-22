### partitionList

This algorithm uses two dummy nodes and two pointers to maintain two separate partitions of the original list,
one containing nodes with values less than x, and the other containing nodes with values greater than or equal
to x. It then concatenates the two partitions and updates the head of the list accordingly.

1. Check if head is null. If it is, the list is empty, so simply return.
2. Create two dummy nodes, dummy1 and dummy2, and initialize two pointers, prev1 and prev2, pointing to these
   dummy nodes respectively. 
3. Initialize a pointer current pointing to the head of the list. 
4. Start a while loop that continues until current is null:
5. Check if the value of the current node is less than the given value x. i. If it is, update the next pointer
   of prev1 to point to current, and update prev1 to point to current. 
6. If it is not, update the next pointer of prev2 to point to current, and update prev2 to point to current. 
7. Move current one step ahead (i.e., current = current.next). 
8. Set the next pointer of prev2 to null, which terminates the second partition. 
9. Set the next pointer of prev1 to the first node of the second partition (i.e., prev1.next = dummy2.next). 
10. Update the head of the list to the first node of the first partition (i.e., head = dummy1.next).



