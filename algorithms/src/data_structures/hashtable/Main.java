package data_structures.hashtable;

public class Main {

    public static void main(String[] args) {

        HashTable myHashTable = new HashTable();
        myHashTable.set("nails", 100);
        myHashTable.set("tile", 50);
        myHashTable.set("lumber", 80);

        myHashTable.set("bolts", 200);
        myHashTable.set("screws", 40);
        myHashTable.set("pins", 90);


//        System.out.println("The value is " + myHashTable.get("lumber"));
        System.out.println(myHashTable.keys());
    }
}
