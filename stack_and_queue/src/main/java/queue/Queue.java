package queue;

public class Queue {

    private static class QueueNode {
        private int val;
        private QueueNode next;

        private QueueNode(int val) {
            this.val = val;
        }
    }

    private QueueNode head;
    private QueueNode tail;

    public int getHead() {
        return this.head.val;
    }

    public int getTail() {
        return this.tail.val;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public int peek() {
        return head.val;
    }

    public void add(int val) {
        QueueNode newNode = new QueueNode(val);
        if (this.head == null) {
            this.head = newNode;
        }
        if (this.tail != null) {
            this.tail.next = newNode;
        }
        this.tail = newNode;
    }

    public int remove() {
        if (head == null) {
            throw new RuntimeException("Not a valid operation, Queue is empty");
        }

        int val = this.head.val;
        this.head = head.next;

        if (this.head == null) {
            this.tail = null;
        }

        return val;
    }


}
