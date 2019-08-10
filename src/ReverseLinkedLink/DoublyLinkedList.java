package ReverseLinkedLink;

@SuppressWarnings("Duplicates")
public class DoublyLinkedList {

    private Node head;
    private Node tail;
    private int length = 0;

    public void append(String value) {
        if (head == null) {
            addFirst(value);
        } else {
            Node newNode = new Node(value);

            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;

            length++;
        }
    }

    public void prepend(String value) {
        if (head == null) {
            addFirst(value);
        } else {
            Node newNode = new Node(value);

            newNode.next = head;
            head.prev = newNode;
            head = newNode;

            length++;
        }
    }

    public void insert(int index, String value) {
        if (index >= length) {
            append(value);
        }

        Node newNode = new Node(value);

        Node leader = traverseToIndex(index - 1);
        Node follower = leader.next;

        leader.next = newNode;
        follower.prev = newNode;
        newNode.next = follower;
        newNode.prev = leader;

        length++;
    }

    public void remove(int index) {
        if (index <= length) {

            Node leader = traverseToIndex(index - 1);
            Node follower = leader.next;

            leader.next = follower.next;
            follower.next.prev = leader;

            length--;
        }
    }

    public String[] reverseValues() {
        int index = length - 1;
        String[] reverse = new String[length];
        Node currentNode = head;

        while (currentNode != null) {
            reverse[index--] = currentNode.value;

            currentNode = currentNode.next;
        }

        return reverse;
    }

    public void reverse() {
        Node first = head;
        tail = head;
        Node second = head.next;

        while (second != null) {
            Node third = second.next;

            second.next = first;
            first = second;
            second = third;
        }

        head.next = null;
        head = first;
    }

    private Node traverseToIndex(int index) {
        int counter = 0;
        Node currentNode = head;

        while (counter != index) {
            currentNode = currentNode.next;
            counter++;
        }

        return currentNode;
    }

    private void addFirst(String value) {
        head = new Node(value);

        tail = head;

        length++;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
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
        return length;
    }

    private class Node {
        private String value;
        private Node next;
        private Node prev;

        Node(String value) {
            this.value = value;
        }
    }

}
