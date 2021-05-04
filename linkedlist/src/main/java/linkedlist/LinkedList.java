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

    public Node getFirst() {
        return this.head;
    }

    public Node getLast() {
        if (this.head == null || this.head.getNext() == null) {
            return this.head;
        } else {
            Node curr = head.getNext();
            while (curr.getNext() != null) {
                curr = curr.getNext();
            }
            return curr;
        }
    }

    public Node get(int n) {
        Node current = this.head;
        while (n > 0 && current != null) {
            current = current.getNext();
            n--;
        }
        if (current != null) {
            return current;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public int contains(int data) {
        if (head == null) {
            return -1;
        }

        Node curr = head;
        int index = 0;

        while (curr.getNext() != null) {
            if (curr.getData() == data) {
                return index;
            }
            curr = curr.getNext();
            index++;
        }
        return -1;
    }

    public void delete(int data) {
        int index = this.contains(data);
        if (index != -1) {
            Node previous = this.head;

            while (index > 1) {
                previous = previous.getNext();
                index--;
            }
            previous.setNext(previous.getNext().getNext());
        }
    }

    public void deleteByIndex(int index) {
        if (index == 0) {
            this.head = this.head.getNext();
        }

        if (index > 0) {
            Node previous = this.head;

            while (index > 1 && previous.getNext() != null) {
                previous = previous.getNext();
                index--;
            }
            if (index == 1) {
                previous.setNext(previous.getNext().getNext());
            } else {
                throw new IndexOutOfBoundsException();
            }
        }

    }
}
