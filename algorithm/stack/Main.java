public class Main {
    public static void main(String[] args) {
        Stack myStack = new Stack(4);

        // myStack.getTop();
        // myStack.getHeight();
        myStack.printStack();
        myStack.push(11);
        myStack.pop();
        myStack.printStack();
    }
}

