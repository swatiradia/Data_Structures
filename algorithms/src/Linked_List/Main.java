package Linked_List;

public class Main {

    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(1);

//        myLinkedList.getHead();
//        myLinkedList.getTail();
//        myLinkedList.getLength();
        myLinkedList.appendList(2);
        myLinkedList.appendList(3);
        myLinkedList.appendList(4);
        myLinkedList.appendList(5);
        myLinkedList.printList();
        myLinkedList.removeLast();


        myLinkedList.printList();
//        myLinkedList.removeFirst();
//        myLinkedList.printList();
    }
}
