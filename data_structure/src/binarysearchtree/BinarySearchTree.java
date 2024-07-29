package binarysearchtree;

public class BinarySearchTree {

    Node root; // root is set to null
    class Node{
        int value;
        Node right;
        Node left;

        Node(int value){
            this.value = value;
        }
    }

//    Constructor for creating binary tree with root node.
//    public BinarySearchTree(int value){
//        Node newNode = new Node(value);
//        root = newNode;
//    }

//    Constructor for creating binary tree with no node. (Redundant)
    public BinarySearchTree(){
        root = null;
    }

    public Node getRoot(){
        return root;
    }

    public boolean insert(int value){
        Node newNode = new Node(value);

        // When there are no nodes is the Binary Search Tree.
        if(root == null){
            root = newNode;
            return true;
        }

        Node temp = root;

        while(true){
            // When the value of the new node is same as the root node.
            if(newNode.value == temp.value) return false;

            // When the value of the new node is less than the root node.
            if(newNode.value < temp.value){
                // If the spot is open then place the new node there and return true.
                if(temp.left == null){
                    temp.left = newNode;
                    return true;
                // Go down there level to the left.
                }else{
                    temp = temp.left;
                }
            // When the value of the new node is greater than the root node.
            }else-if (newNode.value > temp.value){
                // If the spot is open then place the new node there and return true.
                if(temp.right == null){
                    temp.right = newNode;
                    return true;
                // Go down there level to the right.
                }else{
                    temp = temp.right;
                }
            }

        }
    }
    public boolean containsValue(int value){
        // if its a empty tree then return false;
        if (root == null) return false;

        Node temp = root;

        while(temp != null){
            if(value < temp.value){ // When the value is less than the temp value.
                temp = temp.left;
            }else-if (value > temp.value){ // When the value is less than the temp value.
                temp = temp.right;
            }else{ // When the value is equal to temp value.
                return true;
            }
        }
        // When the value does not exist in the tree.
        return false;
    }

}
