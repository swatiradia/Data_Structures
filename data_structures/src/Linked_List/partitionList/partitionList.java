package Linked_List.partitionList;

public class partitionList {

    private Node head;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public partitionList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        length = 1;
    }

    public Node getHead() {
        return head;
    }

    public int getLength() {
        return length;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (length == 0) {
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.value);
        }
        System.out.println("Length:" + length);
        System.out.println("\nLinked List:");
        if (length == 0) {
            System.out.println("empty");
        } else {
            printList();
        }
    }

    public void makeEmpty() {
        head = null;
        length = 0;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        length++;
    }

    public void partitionList(int x) {
        //Check for an empty list.
        // If the list is empty, there is nothing to partition, so we exit the method.
        if (head == null) return;

        //Create two dummy nodes.
        // These dummy nodes act as placeholders to simplify list manipulation.
        Node dummy1 = new Node(0);
        Node dummy2 = new Node(0);

        // Initialize pointers for new lists.
        // 'prev1' and 'prev2' will track the end nodes of the two lists that are being created.
        Node prev1 = dummy1;
        Node prev2 = dummy2;

        //Start with the head of the original list.
        Node current = head;

        //Iterate through the original list.
        while (current != null) {

            // Compare current node value with 'x'.
            // Nodes are partitioned based on their value being less than or greater than/equal to 'x'.

            //If value is less than 'x', add node to the first list.
            if (current.value < x) {
                prev1.next = current;  // Link node to the end of the first list.
                prev1 = current;       // Update the end pointer of the first list.
            } else {
                // If value is greater or equal, add node to the second list.
                prev2.next = current;  // Link node to the end of the second list.
                prev2 = current;       // Update the end pointer of the second list.
            }
            // Move to the next node in the original list.
            current = current.next;
        }

        //Terminate the second list. This prevents cycles in the list.
        prev2.next = null;
        //Connect the two lists. The first list is followed by the second list.
        prev1.next = dummy2.next;
        // Update the head of the original list.
        head = dummy1.next;
    }

    public static void main(String[] args) {

        // Create a new LinkedList and append values to it
        partitionList ll = new partitionList(3);
        ll.append(5);
        ll.append(8);
        ll.append(10);
        ll.append(2);
        ll.append(1);

        // Print the list before partitioning
        System.out.println("LL before partitionList:");
        ll.printList(); // Output: 3 5 8 10 2 1

        // Call the partitionList method with x = 5
        ll.partitionList(3);

        // Print the list after partitioning
        System.out.println("LL after partitionList:");
        ll.printList(); // Output: 3 2 1 5 8 10

        /*
            EXPECTED OUTPUT:
            ----------------
            LL before partition_list:
            3
            5
            8
            10
            2
            1
            LL after partition_list:
            3
            2
            1
            5
            8
            10

        */

    }
}
