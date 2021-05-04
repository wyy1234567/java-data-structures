package linkedlist;

public class LinkedList {

    private Node head;


    public Node getHead() {
        return this.head;
    }

    public boolean isEmpty() {
        return (head == null);
    }

    public void add(int data) {
        if (head == null) {
            head = new Node(data);
        } else {
            Node curr = head;
            while (curr.getNext() != null) {
                curr = curr.getNext();
            }
            curr.setNext(new Node(data));
        }
    }
}
