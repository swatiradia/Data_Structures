package data_structures.hashtable;


public class HashTable {

    private int size = 7;
    public  Node[] dataMap;

    HashTable(){
        dataMap = new Node[size];
    }

    public class Node{
        private String key;
        private int value;
        private Node next;

        public Node(String key, int value){
            this.key = key;
            this.value = value;

        }
    }

    public void printTable(){
        for (int i = 0; i < dataMap.length; i++){
            System.out.println(i + ":");
            Node temp = dataMap[i];
            while(temp != null) {
                System.out.println(" {" + temp.key + "=" + temp.value + " }");
                temp = temp.next;
            }
        }
    }

    private int hashMethod(String key){
        int hash = 0;
        char[] keyChars = key.toCharArray();
        for(int i= 0; i < keyChars.length; i++){
            int asciiValue = keyChars[i];
            hash = (hash + asciiValue * 23) % dataMap.length;
        }
        return hash;
    }
}
