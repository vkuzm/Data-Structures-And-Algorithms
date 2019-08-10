package ReverseLinkedLink;

public class Main {
    public static void main(String[] args) {

        DoublyLinkedList list = new DoublyLinkedList();

        list.append("Turtle");
        list.append("Bear");
        list.append("Cat");
        list.append("Dog");

        list.reverse();

        // Get nodes
        list.getNodes(list.getHead());

    }
}


