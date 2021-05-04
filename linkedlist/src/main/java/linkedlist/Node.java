package linkedlist;

public class Node {

    private Node next;
    private int data;

    public Node(int data) {
        this.data = data;
    }

    public int getData() {
        return this.data;
    }

    public Node getNext() {
        return this.next;
    }
}
