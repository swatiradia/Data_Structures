package Doubly_LinkedList;

public class Main {

    public static void main(String[] args) {

        DoublyLinkedList myLinkedList = new DoublyLinkedList(1);
//        myLinkedList.append(1);
//        myLinkedList.append(2);
        myLinkedList.append(3);

//        myLinkedList.prepend(4);
//        myLinkedList.printList();
//        myLinkedList.append(3);
//        myLinkedList.getTail();
//        myLinkedList.removeFirst();
//        myLinkedList.removeFirst();
        myLinkedList.printList();
//        myLinkedList.removeFirst();

//        System.out.println(myLinkedList.get(1).value);
//        System.out.println(myLinkedList.get(2).value + "\n");
        myLinkedList.insert(1,2);
        myLinkedList.printList();
        myLinkedList.remove(1);

        myLinkedList.printList();

    }
}
