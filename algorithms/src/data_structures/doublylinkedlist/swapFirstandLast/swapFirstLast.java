package data_structures.doublylinkedlist.swapFirstandLast;

public class swapFirstLast {
    private Node head;  // Reference to the first node in the doubly linked list
    private Node tail;  // Reference to the last node in the doubly linked list
    private int length; // Number of nodes in the list

    // Node class representing a single node in the doubly linked list
    class Node {
        int value;      // Value stored in the node
        Node next;     // Pointer to the next node
        Node prev;     // Pointer to the previous node

        // Constructor to initialize a node with a value
        Node(int value) {
            this.value = value;
        }
    }

    // Constructor to initialize the doubly linked list with a single node
    public swapFirstLast(int value) {
        Node newNode = new Node(value); // Create a new node
        head = newNode;                // Set both head and tail to the new node
        tail = newNode;
        length = 1;                    // List starts with one node
    }

    // Method to get the head node
    public Node getHead() {
        return head;
    }

    // Method to get the tail node
    public Node getTail() {
        return tail;
    }

    // Method to get the length of the list
    public int getLength() {
        return length;
    }

    // Method to print the values of all nodes in the list
    public void printList() {
        Node temp = head; // Start from the head
        while (temp != null) { // Traverse until the end of the list
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    // Method to print details of the list including head, tail, and length
    public void printAll() {
        // Print head and tail values or indicate if the list is empty
        if (length == 0) {
            System.out.println("Head: null");
            System.out.println("Tail: null");
        } else {
            System.out.println("Head: " + head.value);
            System.out.println("Tail: " + tail.value);
        }
        System.out.println("Length: " + length);
        System.out.println("\nDoubly Linked List:");

        // Print list or indicate if it's empty
        if (length == 0) {
            System.out.println("empty");
        } else {
            printList();
        }
    }

    // Method to empty the list by setting head and tail to null and length to 0
    public void makeEmpty() {
        head = null;
        tail = null;
        length = 0;
    }

    // Method to append a new node with the given value to the end of the list
    public void append(int value) {
        Node newNode = new Node(value); // Create a new node
        if (length == 0) { // If the list is empty
            head = newNode;  // Set head and tail to the new node
            tail = newNode;
        } else {
            tail.next = newNode; // Link the new node to the current tail
            newNode.prev = tail; // Set the previous pointer of the new node
            tail = newNode;      // Update the tail to the new node
        }
        length++; // Increment the length of the list
    }

    // Method to swap the values of the first and last nodes
    public void swapFirstLast() {
        // Check if the list has fewer than 2 nodes
        if (length < 2) {
            System.out.println("Length of the doubly linked list is less than 2");
        } else {
            // Swap values without using a temporary variable
            head.value = head.value + tail.value; // Add values of head and tail
            tail.value = head.value - tail.value; // Compute new tail value
            head.value = head.value - tail.value; // Compute new head value
        }
    }

//        Another way to swapping interger values with using temp variable
//    public void swapFirstLast() {
//        if (length < 2) return;
//        int temp = head.value;
//        head.value = tail.value;
//        tail.value = temp;
//    }


    public static void main(String[] args) {

        swapFirstLast myDLL = new swapFirstLast(1);
        myDLL.append(2);
        myDLL.append(3);
        myDLL.append(4);
        myDLL.append(5);

        System.out.println("DLL before swap:");
        myDLL.printList();

        myDLL.swapFirstLast();

        System.out.println("\nDLL after swap:");
        myDLL.printList();


        /*
       		EXPECTED OUTPUT:
        	----------------
            DLL before swap:
            1
            2
            3
            4
            5

            DLL after swap:
            5
            2
            3
            4
            1

     	*/

    }
}
