package DoublyLinkedList;

public class Main {
    public static void main(String[] args) {

        DoublyLinkedList list = new DoublyLinkedList();

        list.append("Bear");
        list.append("Cat");
        list.append("Dog");
        list.append("Turtle");
        //list.prepend("Cow");
        //list.insert(2, "Bird");
        list.remove(1);

        // Get nodes
        list.getNodes(list.getHead());

        // Get tail
        String tailValue = list.getValue(list.getTail());
        System.out.println("Tail value: " + tailValue);
    }
}


