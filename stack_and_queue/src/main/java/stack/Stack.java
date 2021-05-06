package stack;

public class Stack {

    private static class StackNode {

        private int val;
        private StackNode next;

        private StackNode(int val) {
            this.val = val;
        }
    }

    private StackNode top;

    public boolean isEmpty() {
        return this.top == null;
    }

    public int peek() {
        return this.top.val;
    }

    public void push(int val) {
        StackNode newStackNode = new StackNode(val);
        newStackNode.next = this.top;
        this.top = newStackNode;
    }

    public int pop() {
        if (this.top == null) {
            throw new RuntimeException("Not a valid operation, Stack is empty");
        }

        int val = this.top.val;
        this.top = this.top.next;
        return val;
    }




}
