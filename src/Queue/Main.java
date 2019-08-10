package Queue;

public class Main {
    public static void main(String[] args) {

        Queue queue = new Queue();

        queue.enqueue("Dog");
        queue.enqueue("Cat");
        queue.enqueue("Wolf");
        queue.enqueue("Bear");

        System.out.println("Get all values:");
        for (String s: queue.getValues()) {
            System.out.println(s);
        }

        System.out.println("\nGet first: ");
        System.out.println(queue.peek());

        queue.dequeue();
        System.out.println("\nGet all values after dequeue:");
        for (String s: queue.getValues()) {
            System.out.println(s);
        }
    }
}
