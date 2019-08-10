package Queue;

@SuppressWarnings("Duplicates")
public class Queue {

    private Node first;
    private Node last;
    private int length = 0;

    private class Node {
        private String value;
        private Node next = null;

        public Node(String value) {
            this.value = value;
        }
    }

    public String peek() {
        if (this.first != null) {
            return first.value;
        }

        return null;
    }

    public void enqueue(String value) {
        Node newNode = new Node(value);

        if (this.length == 0) {
            this.first = newNode;
            this.last = newNode;
        } else {
            this.last.next = newNode;
            this.last = newNode;
        }

        this.length++;
    }

    public void dequeue() {
        if (this.first != null) {
            if (this.length == 0) {
                this.last = null;
            }

            this.first = this.first.next;
            this.length--;
        }
    }

    public String[] getValues() {
        String[] values = new String[this.length];
        Node currentNude = this.first;
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
        return this.length == 0;
    }
}
