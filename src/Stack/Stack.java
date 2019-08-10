package Stack;

public class Stack {

    private Node top;
    private Node bottom;
    private int length = 0;

    private class Node {
        private String value;
        private Node next = null;

        public Node(String value) {
            this.value = value;
        }
    }

    public void push(String value) {
        Node newNode = new Node(value);

        if (this.length == 0) {
            this.top = newNode;
            this.bottom = newNode;
        } else {
            Node holdingPointer = this.top;
            this.top = newNode;
            this.top.next = holdingPointer;
        }

        this.length++;
    }

    public String peek() {
        return top.value;
    }

    public void pop() {
        if (this.top == this.bottom) {
            this.bottom = null;
        } else {
            this.top = this.top.next;
        }

        this.length--;
    }

    public String[] getValues() {
        String[] values = new String[this.length];
        Node currentNude = this.top;
        int counter = 0;

        while (currentNude != null) {
            values[counter++] = currentNude.value;
            currentNude = currentNude.next;
        }

        return values;
    }

    public int size() {
        return this.length;
    }

    public boolean isEmpty() {
        return this.top == null;
    }
}
