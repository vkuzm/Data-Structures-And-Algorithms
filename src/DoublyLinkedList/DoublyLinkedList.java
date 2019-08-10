package DoublyLinkedList;

@SuppressWarnings("Duplicates")
public class DoublyLinkedList {

    private Node head;
    private Node tail;
    private int length = 0;

    private class Node {
        private String value;
        private Node next;
        private Node prev;

        Node(String value) {
            this.value = value;
        }
    }

    public void append(String value) {
        if (this.head == null) {
            this.addFirst(value);
        } else {
            Node newNode = new Node(value);

            newNode.prev = this.tail;
            this.tail.next = newNode;
            this.tail = newNode;

            this.length++;
        }
    }

    public void prepend(String value) {
        if (this.head == null) {
            this.addFirst(value);
        } else {
            Node newNode = new Node(value);

            newNode.next = this.head;
            this.head.prev = newNode;
            this.head = newNode;

            this.length++;
        }
    }

    public void insert(int index, String value) {
        if (index >= this.length) {
            append(value);
        }

        Node newNode = new Node(value);

        Node leader = traverseToIndex(index - 1);
        Node follower = leader.next;

        leader.next = newNode;
        follower.prev = newNode;
        newNode.next = follower;
        newNode.prev = leader;

        this.length++;
    }

    public void remove(int index) {
        if (index <= this.length) {

            Node leader = traverseToIndex(index - 1);
            Node follower = leader.next;

            leader.next = follower.next;
            follower.next.prev = leader;

            this.length--;
        }
    }

    private Node traverseToIndex(int index) {
        int counter = 0;
        Node currentNode = this.head;

        while (counter != index) {
            currentNode = currentNode.next;
            counter++;
        }

        return currentNode;
    }

    private void addFirst(String value) {
        this.head = new Node(value);

        this.tail = this.head;

        this.length++;
    }

    public Node getHead() {
        return this.head;
    }

    public Node getTail() {
        return this.tail;
    }

    public String getValue(Node node) {
        return node.value;
    }

    public Node getNodes(Node node) {
        if (node == null) {
            return null;
        }

        System.out.println("Value: " + node.value);

        if (node.next != null) {
            System.out.println("Next value: " + node.next.value);
        }

        if (node.prev != null) {
            System.out.println("Prev value: " + node.prev.value);
        }


        System.out.println("---------------");

        return getNodes(node.next);
    }

    public int size() {
        return this.length;
    }

}
