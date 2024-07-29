package doublylinkedlist;

public class DoublyLinkedList {

    private Node head;
    private Node tail;
    private int length;

    public DoublyLinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public class Node{
        int value;
        Node prev;
        Node next;

        public Node(int value){
            this.value = value;
        }
    }

    public void getHead(){
        System.out.println("Head: " + head.value);
    }

    public void getTail(){
        System.out.println("Tail: " + tail.value);
    }

    public void getLength(){
        System.out.println("Length: " + length);
    }

    public void printList() {
        Node temp = head;

        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void append(int value){
        Node newNode = new Node(value);
//        When there are zero items in the DoublyLinkedList.
        if(length == 0){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        length++;
    }

    public Node removeLast(){
//        When there are zero items in the DoublyLinkedList.
        if(length == 0) return null;

        Node temp = tail;
//        When there is one item in the DoublyLinkedList.
        if(length == 1){
            head = null;
            tail = null;
        }else { //   When there are more items in the DoublyLinkedList.
            tail = temp.prev;
            tail.next = null;
            temp.prev = null;
        }
        length--;
        return temp;
    }

    public void prepend(int value){
        Node newNode = new Node(value);
        if(length == 0){
            head = newNode;
            tail = newNode;
        }
        else{
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    public Node removeFirst(){
        //        When there are zero items in the DoublyLinkedList.
        if(length == 0) return null;
        Node temp = head;
        //        When there is one item in the DoublyLinkedList.
        if(length == 1){
            head = null;
            tail = null;
        } else{ //   When there are more items in the DoublyLinkedList.
            head = temp.next;
            head.prev = null;
            temp.next = null;
        }
        length--;
        return temp;
    }

    public Node get(int index){
//        if the index is negative or greater than the length of the Doubly Linked List.
        if( index < 0 || index >= length){
            return null;
        }

        Node temp= head;
        if(index < length/2){
            for (int i = 0; i < index ; i++){
                temp = temp.next;
            }
        }else {
            temp = tail;
            for (int i = length-1; i > index; i--){
                temp = temp.prev;
            }
        }
        return temp;
    }

    public boolean set(int index, int value){
        Node temp = get(index);
        if(temp !=null){
            temp.value = value;
            return true;
        }
        return false;
    }

    public boolean insert(int index, int value){
        // if the index is negative or greater than the length of the Doubly Linked List.
        if(index < 0 || index > length) return false;

        // if the index is 0 just prepend the new node.
        if(index == 0){
            prepend(value);
            return true;
        }
        // if the index is equal to length just append the new node.
        if (index == length){
            append(value);
            return true;
        }
        // if the index is in  between.
        Node newNode = new Node(value);
        Node before = get(index -1);
        Node after = before.next;
        newNode.prev = before;
        before.next = newNode;
        newNode.next = after;
        after.prev = newNode;
        length++;
        return  true;
    }

    public Node remove(int index){
        // if the index is negative or greater than the length of the Doubly Linked List.
        if(index < 0 || index >= length) return null;
        // if the index is 0 just removeFirst the node.
        if (index == 0){
            return removeFirst();
        }
        // if the index is 0 just removeLast the node.
        if (index == (length -1)){
           return removeLast();
        }
        // if the index is in  between.
        Node temp = get(index);
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
        temp.next = null;
        temp.prev = null;
        length--;
        return temp;
    }
}
