package Doubly_LinkedList.swapFirstandLast;

public class swapFirstLast {
    private Node head;
    private Node tail;
    private int length;

        class Node {
            int value;
            Node next;
            Node prev;

            Node(int value) {
                this.value = value;
            }
        }

        public swapFirstLast(int value) {
            Node newNode = new Node(value);
            head = newNode;
            tail = newNode;
            length = 1;
        }

        public Node getHead() {
            return head;
        }

        public Node getTail() {
            return tail;
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
                System.out.println("Tail: null");
            } else {
                System.out.println("Head: " + head.value);
                System.out.println("Tail: " + tail.value);
            }
            System.out.println("Length:" + length);
            System.out.println("\nDoubly Linked List:");
            if (length == 0) {
                System.out.println("empty");
            } else {
                printList();
            }
        }

        public void makeEmpty() {
            head = null;
            tail = null;
            length = 0;
        }

        public void append (int value) {
            Node newNode = new Node(value);
            if(length == 0) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            }
            length++;
        }

//        One way to swapping interger values without using temp variable
        public void swapFirstLast(){
            if(length < 2) {
                System.out.println("length of the doubly linked list id leass 2");

            }
            else {
                head.value = head.value + tail.value;
                tail.value = head.value - tail.value;
                head.value = head.value - tail.value;
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
