package data_structures.binarysearchtree;

// Class representing a binary tree structure
public class BinarySearchTree {

    // Step 1: Define the root of the tree, initialized to null
    Node root; // The root node of the binary tree

    // Inner class representing a node in the binary tree
    class Node {
        // Step 2: Value stored in the node
        int value;

        // Step 3: Pointers to the left and right child nodes
        Node right; // Reference to the right child
        Node left;  // Reference to the left child

        // Constructor for creating a new node with a specified value
        Node(int value) {
            // Step 4: Assign the value to the node
            this.value = value;

            // Step 5: Initialize left and right children to null by default
            this.right = null;
            this.left = null;
        }
    }

//    Constructor for creating binary tree with root node.
/*   public BinarySearchTree(int value){
        Node newNode = new Node(value);
        root = newNode;
    } */

// Constructor to initialize the Binary Search Tree with no node. (Redundant)
    public BinarySearchTree() {
        // Step 1: Set the root to null, indicating an empty tree
        root = null;
    }

    // Method to retrieve the root of the Binary Search Tree
    public Node getRoot() {
        // Step 2: Return the root node of the tree
        return root;
    }

    // Method to insert a new node with the given value into the Binary Search Tree
    public boolean insert(int value) {
        // Step 1: Create a new node with the given value
        Node newNode = new Node(value);

        // Step 2: If the tree is empty, set the root to the new node and return true
        if (root == null) {
            root = newNode;
            return true;
        }

        // Step 3: Start from the root node and traverse the tree to find the appropriate position
        Node temp = root;

        while (true) {
            // Step 4: If the new node's value is equal to the current node's value, return false (duplicate value)
            if (newNode.value == temp.value) {
                return false;
            }

            // Step 5: If the new node's value is less than the current node's value, go left
            if (newNode.value < temp.value) {
                // Step 6: If there's an open spot on the left, insert the new node there and return true
                if (temp.left == null) {
                    temp.left = newNode;
                    return true;
                }
                // Step 7: If not, move down the tree to the left
                temp = temp.left;

                // Step 8: If the new node's value is greater than the current node's value, go right
            } else {
                // Step 9: If there's an open spot on the right, insert the new node there and return true
                if (temp.right == null) {
                    temp.right = newNode;
                    return true;
                }
                // Step 10: If not, move down the tree to the right
                temp = temp.right;
            }
        }
    }

    // Method to check if a given value exists in the Binary Search Tree
    public boolean containsValue(int value) {
        // Step 1: Start at the root of the tree
        Node temp = root;

        // Step 2: Traverse the tree until the correct value is found or the tree ends
        while (temp != null) {
            // Step 3: If the value is less than the current node's value, go left
            if (value < temp.value) {
                temp = temp.left;

                // Step 4: If the value is greater than the current node's value, go right
            } else if (value > temp.value) {
                temp = temp.right;

                // Step 5: If the value matches the current node's value, return true
            } else {
                return true;
            }
        }

        // Step 6: If we reach a null node, the value doesn't exist in the tree
        return false;
    }

}
