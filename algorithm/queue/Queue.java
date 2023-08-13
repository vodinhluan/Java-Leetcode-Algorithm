public class Queue {
    private Node first;
    private Node last;
    private int length;

    class Node {
        int value;
        Node next;
    
        Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public Queue(int value) {
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
        length = 1;
    }

    public void getFirst() {
        System.out.println("First: "+first.value);
    }

    public void getLast() {
        System.out.println("Last: "+last.value);
    }

    public void getHeight() {
        System.out.println("Height: "+length);
    }
}
