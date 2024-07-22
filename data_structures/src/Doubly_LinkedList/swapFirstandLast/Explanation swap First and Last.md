### Swap First and Last values of the Doubly Linked List.


The method checks if the length of the list is less than 2, meaning that the list has either zero
or one element, in which case there is no need to swap anything, and the method just returns.

Otherwise, the method creates a temporary variable temp to store the value of the head node, which 
is the first node in the list.  Then, it assigns the value of the tail node, which is the last node 
in the list, to the value of the head node.  Finally, it assigns the value of the temporary variable
temp to the value of the tail node.

By doing so, the values of the first and last nodes in the list are swapped.

