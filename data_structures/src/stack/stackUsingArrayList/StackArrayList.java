package stack.stackUsingArrayList;
import java.util.ArrayList;

public class StackArrayList {
    private ArrayList<Integer> stackList = new ArrayList<>();

    public ArrayList<Integer> getStackList() {
        return stackList;
    }

    public void printStack() {
        for (int i = stackList.size()-1; i >= 0; i--) {
            System.out.println(stackList.get(i));
        }
    }

    public boolean isEmpty() {
        return stackList.size() == 0;
    }

    public int peek() {
        if (isEmpty()) {
            return 0;
        } else {
            return stackList.get(stackList.size() - 1);
        }
    }

    public int size() {
        return stackList.size();
    }

    public void push(int value) {
        // add the given value to the end of the stackList
        stackList.add(value);
    }

    // Removes and returns the top element from the stack
    public int pop() {
        // Check if the stack is empty, if so return null

        if (isEmpty()) return 0;
        // Removes the element from the end of the list
        // (which is the top of the stack) and returns it

        return stackList.remove(stackList.size() - 1);
    }



    public static void main(String[] args) {

        StackArrayList myStack = new StackArrayList();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);

        System.out.println("Stack before pop():");
        myStack.printStack();

        System.out.println("\nPopped node:");
        System.out.println(myStack.pop());

        System.out.println("\nStack after pop():");
        myStack.printStack();

        /*
            EXPECTED OUTPUT:
            Stack before pop():
            3
            2
            1

            Popped node:
            3

            Stack after pop():
            2
            1

        */

    }

}
