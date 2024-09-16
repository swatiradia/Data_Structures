package data_structures.hashtable;

import java.util.ArrayList;

// A class representing a Hash Table implementation
public class HashTable {

    // Step 1: Define the size of the dataMap array (number of buckets)
    private int size = 7;

    // Step 2: Declare the dataMap array to hold the hash table entries, initialized later
    public Node[] dataMap;

    // Constructor for the HashTable class
    HashTable() {
        // Step 3: Initialize the dataMap array with the defined size
        dataMap = new Node[size];
    }

    // Inner class representing a Node in the linked list
    public class Node {
        // Step 4: Key for the node (the unique identifier)
        private String key;

        // Step 5: Value associated with the key
        private int value;

        // Step 6: Pointer to the next node in case of collisions (linked list)
        private Node next;

        // Constructor for the Node class
        public Node(String key, int value) {
            // Step 7: Assign the key and value for this node
            this.key = key;
            this.value = value;
            // The next node is initialized to null by default
        }
    }

    // Method to print the contents of the hash table
    public void printTable() {
        // Step 1: Iterate through each index of the dataMap array
        for (int i = 0; i < dataMap.length; i++) {
            // Step 2: Print the current index
            System.out.println(i + ":");

            // Step 3: Initialize a temporary node to traverse the linked list at the current index
            Node temp = dataMap[i];

            // Step 4: Traverse through the linked list at the current index
            while (temp != null) {
                // Step 5: Print the key-value pair stored in the current node
                System.out.println(" { " + temp.key + "=" + temp.value + " }");

                // Step 6: Move to the next node in the linked list
                temp = temp.next;
            }
        }
    }


    // Method to compute the hash index for a given key
    private int hashMethod(String key) {
        // Step 1: Initialize the hash value to 0
        int hash = 0;

        // Step 2: Convert the string key into a character array
        char[] keyChars = key.toCharArray();

        // Step 3: Loop through each character in the key to compute the hash value
        for (int i = 0; i < keyChars.length; i++) {
            // Get the ASCII value of the current character
            int asciiValue = keyChars[i];

            // Step 4: Update the hash value using the ASCII value and a multiplier 23 (a prime number used to reduce collisions)
            // The modulus ensures the hash value stays within the bounds of the dataMap array
            hash = (hash + asciiValue * 23) % dataMap.length;
        }

        // Step 5: Return the computed hash value, which is the index for the key
        return hash;
    }


    // Method to insert a key-value pair into the HapMap data structure
    public void set(String key, int value) {
        // Step 1: Calculate the index by applying a hash method on the key
        int index = hashMethod(key);

        // Step 2: Create a new node with the provided key and value
        Node newNode = new Node(key, value);

        // Step 3: If no entry exists at the calculated index, directly insert the new node
        if (dataMap[index] == null) {
            dataMap[index] = newNode;
        } else {
            // Step 4: If an entry exists, traverse the linked list until reaching the last node
            Node temp = dataMap[index];
            while (temp.next != null) {
                temp = temp.next;
            }
            // Step 5: Insert the new node at the end of the linked list
            temp.next = newNode;
        }
    }

    // Method to retrieve the value associated with a given key
    public int get(String key) {
        // Step 1: Calculate the index for the key using the hash method
        int index = hashMethod(key);

        // Step 2: If no nodes exist at this index, return 0 (indicating key not found)
        if (dataMap[index] == null) {
            return 0; // Or you can throw an exception if 0 isn't suitable for your use case
        }

        // Step 3: Initialize a temporary node to traverse the linked list at the index
        Node temp = dataMap[index];

        // Step 4: Traverse through the linked list to find the key
        while (temp != null) {
            // Step 5: If the key matches, return the associated value
            if (temp.key == key) {
                return temp.value;
            }
            // Step 6: Move to the next node in the list
            temp = temp.next;
        }

        // Step 7: If key is not found, return 0
        return 0; // Or throw an exception if 0 isn't a valid default
    }


    /**
     * Retrieves all the keys from the hash table and returns them in an ArrayList.
     * @return An ArrayList containing all the keys in the hash table.
     */
    public ArrayList<String> keys() {
        // Create an ArrayList to store all the keys
        ArrayList<String> allKeys = new ArrayList<>();

        // Iterate through each index in the dataMap array
        for (int i = 0; i < dataMap.length; i++) {
            // Start with the node at the current index
            Node temp = dataMap[i];

            // Traverse the linked list at this index
            while (temp != null) {
                // Add the key of the current node to the ArrayList
                allKeys.add(temp.key);

                // Move to the next node in the linked list
                temp = temp.next;
            }
        }

        // Return the ArrayList containing all the keys
        return allKeys;
    }
}
