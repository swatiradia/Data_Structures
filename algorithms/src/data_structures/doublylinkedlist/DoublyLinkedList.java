package data_structures.doublylinkedlist;

// Class representing a Doubly Linked List
public class DoublyLinkedList {

    // Step 1: Private members for head, tail, and length of the list
    private Node head;   // Pointer to the first node in the list
    private Node tail;   // Pointer to the last node in the list
    private int length;  // Number of nodes in the list

    // Constructor to initialize the doubly linked list with a single node
    public DoublyLinkedList(int value) {
        // Step 2: Create a new node with the given value
        Node newNode = new Node(value);

        // Step 3: Set both head and tail to the new node
        head = newNode;
        tail = newNode;

        // Step 4: Initialize the length of the list to 1
        length = 1;
    }

    // Inner class representing a node in the doubly linked list
    public class Node {
        // Step 5: Node's value, previous node, and next node references
        int value;
        Node prev; // Reference to the previous node in the list
        Node next; // Reference to the next node in the list

        // Constructor for creating a new node with a specified value
        public Node(int value) {
            // Step 6: Initialize the value of the node
            this.value = value;

            // Step 7: Initialize prev and next pointers to null (default value)
            this.prev = null;
            this.next = null;
        }
    }

    // Method to print the value of the head node
    public void getHead() {
        // Step 8: Print the value of the head node
        if (head != null) {
            System.out.println("Head: " + head.value);
        } else {
            System.out.println("The list is empty.");
        }
    }

    // Method to print the value of the tail node
    public void getTail() {
        // Step 9: Print the value of the tail node
        if (tail != null) {
            System.out.println("Tail: " + tail.value);
        } else {
            System.out.println("The list is empty.");
        }
    }

    // Method to print the length of the list
    public void getLength() {
        // Step 10: Print the length of the list
        System.out.println("Length: " + length);
    }

    // Method to print all the values in the doubly linked list
    public void printList() {
        // Step 1: Start from the head of the list
        Node temp = head;

        // Step 2: Traverse the list until reaching the end (temp becomes null)
        while (temp != null) {
            // Step 3: Print the value of the current node
            System.out.println(temp.value);

            // Step 4: Move to the next node in the list
            temp = temp.next;
        }
    }


    // Method to add a new node with the given value to the end of the doubly linked list
    public void append(int value) {
        // Step 1: Create a new node with the specified value
        Node newNode = new Node(value);

        // Step 2: Check if the list is empty (length is zero)
        if (length == 0) {
            // The list is empty, so set both head and tail to the new node
            head = newNode;
            tail = newNode;
        } else {
            // The list is not empty, so add the new node at the end
            // Step 3: Set the next pointer of the current tail to the new node
            tail.next = newNode;

            // Step 4: Set the previous pointer of the new node to the current tail
            newNode.prev = tail;

            // Step 5: Update the tail to be the new node
            tail = newNode;
        }

        // Step 6: Increment the length of the list
        length++;
    }


    // Method to remove and return the last node from the doubly linked list
    public Node removeLast() {
        // Step 1: Check if the list is empty
        if (length == 0) {
            // If the list is empty, there is nothing to remove, so return null
            return null;
        }

        // Step 2: Store the current tail node in a temporary variable
        Node temp = tail;

        // Step 3: Check if the list contains only one node
        if (length == 1) {
            // If there is only one node, set both head and tail to null
            head = null;
            tail = null;
        } else {
            // Step 4: For lists with more than one node
            // Update the tail to the previous node
            tail = temp.prev;

            // Set the next pointer of the new tail to null (it will be the new end of the list)
            tail.next = null;

            // Set the prev pointer of the removed node to null (it is no longer part of the list)
            temp.prev = null;
        }

        // Step 5: Decrement the length of the list
        length--;

        // Step 6: Return the removed node
        return temp;
    }


    // Method to add a new node with the given value to the beginning of the doubly linked list
    public void prepend(int value) {
        // Step 1: Create a new node with the specified value
        Node newNode = new Node(value);

        // Step 2: Check if the list is empty (length is zero)
        if (length == 0) {
            // If the list is empty, set both head and tail to the new node
            head = newNode;
            tail = newNode;
        } else {
            // Step 3: For lists with one or more nodes
            // Set the previous pointer of the current head to the new node
            head.prev = newNode;

            // Set the next pointer of the new node to the current head
            newNode.next = head;

            // Update the head to be the new node
            head = newNode;
        }

        // Step 4: Increment the length of the list
        length++;
    }


    // Method to remove and return the first node from the doubly linked list
    public Node removeFirst() {
        // Step 1: Check if the list is empty
        if (length == 0) {
            // If the list is empty, there is nothing to remove, so return null
            return null;
        }

        // Step 2: Store the current head node in a temporary variable
        Node temp = head;

        // Step 3: Check if the list contains only one node
        if (length == 1) {
            // If there is only one node, set both head and tail to null
            head = null;
            tail = null;
        } else {
            // Step 4: For lists with more than one node
            // Update the head to the next node
            head = temp.next;

            // Set the previous pointer of the new head to null (no previous node)
            head.prev = null;

            // Set the next pointer of the removed node to null (it is no longer part of the list)
            temp.next = null;
        }

        // Step 5: Decrement the length of the list
        length--;

        // Step 6: Return the removed node
        return temp;
    }


    // Method to retrieve the node at a specific index in the doubly linked list
    public Node get(int index) {
        // Step 1: Check if the index is out of bounds (negative or greater than or equal to the length of the list)
        if (index < 0 || index >= length) {
            // If the index is invalid, return null
            return null;
        }

        // Step 2: Initialize a temporary node to traverse the list
        Node temp;

        // Step 3: Decide whether to traverse from the head or tail for efficiency
        if (index < length / 2) {
            // If the index is in the first half of the list, start from the head
            temp = head;
            for (int i = 0; i < index; i++) {
                // Move to the next node until the desired index is reached
                temp = temp.next;
            }
        } else {
            // If the index is in the second half of the list, start from the tail
            temp = tail;
            for (int i = length - 1; i > index; i--) {
                // Move to the previous node until the desired index is reached
                temp = temp.prev;
            }
        }

        // Step 4: Return the node at the specified index
        return temp;
    }


    // Method to update the value of the node at a specific index in the doubly linked list
    public boolean set(int index, int value) {
        // Step 1: Retrieve the node at the specified index
        Node temp = get(index);

        // Step 2: Check if the node exists (i.e., the index is valid)
        if (temp != null) {
            // Step 3: Update the value of the node
            temp.value = value;
            // Step 4: Return true to indicate that the value was successfully updated
            return true;
        }

        // Step 5: If the node does not exist (index was invalid), return false
        return false;
    }


    // Method to insert a new node with the given value at a specific index in the doubly linked list
    public boolean insert(int index, int value) {
        // Step 1: Check if the index is out of bounds (negative or greater than the length of the list)
        if (index < 0 || index > length) {
            // If the index is invalid, return false
            return false;
        }

        // Step 2: Check if the index is 0 (insert at the beginning of the list)
        if (index == 0) {
            // Prepend the new node to the beginning of the list
            prepend(value);
            // Return true to indicate the insertion was successful
            return true;
        }

        // Step 3: Check if the index is equal to the length (insert at the end of the list)
        if (index == length) {
            // Append the new node to the end of the list
            append(value);
            // Return true to indicate the insertion was successful
            return true;
        }

        // Step 4: For indices between 0 and length (insert in the middle of the list)
        // Create a new node with the given value
        Node newNode = new Node(value);

        // Retrieve the node before the specified index
        Node before = get(index - 1);

        // Retrieve the node after the specified index
        Node after = before.next;

        // Update pointers to insert the new node between before and after nodes
        newNode.prev = before;       // Set the previous pointer of the new node
        before.next = newNode;       // Set the next pointer of the before node
        newNode.next = after;        // Set the next pointer of the new node
        after.prev = newNode;        // Set the previous pointer of the after node

        // Increment the length of the list
        length++;

        // Return true to indicate the insertion was successful
        return true;
    }


    // Method to remove and return the node at a specific index in the doubly linked list
    public Node remove(int index) {
        // Step 1: Check if the index is out of bounds (negative or greater than or equal to the length of the list)
        if (index < 0 || index >= length) {
            // If the index is invalid, return null
            return null;
        }

        // Step 2: Check if the index is 0 (remove the first node)
        if (index == 0) {
            // Remove the first node using the removeFirst method and return it
            return removeFirst();
        }

        // Step 3: Check if the index is the last node (remove the last node)
        if (index == (length - 1)) {
            // Remove the last node using the removeLast method and return it
            return removeLast();
        }

        // Step 4: For indices in between, remove the node at the specified index
        // Retrieve the node to be removed
        Node temp = get(index);

        // Update the pointers to bypass the node to be removed
        temp.prev.next = temp.next;  // Link the previous node to the node after the removed node
        temp.next.prev = temp.prev;  // Link the next node to the node before the removed node

        // Clear the pointers of the removed node
        temp.next = null;  // Disconnect the removed node from the list
        temp.prev = null;  // Disconnect the removed node from the list

        // Decrement the length of the list
        length--;

        // Return the removed node
        return temp;
    }

}
