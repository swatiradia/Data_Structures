package stack;

public class Main {

    public static void main(String[] args) {

        Stack myStack = new Stack(3);

        myStack.push(2);
        myStack.push(1);
        myStack.printStack();
        myStack.pop();
        myStack.printStack();
    }
}
