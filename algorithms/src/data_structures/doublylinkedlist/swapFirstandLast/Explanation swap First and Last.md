### Swap First and Last Values of the Doubly Linked List
The swapFirstLast method performs the following steps to swap the values of the first and last nodes in a doubly
linked list:

1. Check List Length: The method first checks if the length of the list is less than 2. This means the list has
either zero or one element. If so, there is no need to swap any values, so the method returns immediately.

2. Swap Values: If the list contains two or more nodes:

* The method calculates the new values for the head and tail nodes 
without using a temporary node.
* It updates the value of the head node to be the sum of its current
value and the value of the tail node.
* It then updates the value of the tail node to be the difference 
between the new head value and the old tail value.
* Finally, it updates the value of the head node to be the difference
between the new head value and the new tail value.
* By using these calculations, the values of the first and last nodes are effectively swapped.
This approach avoids using a temporary variable to store values explicitly.
