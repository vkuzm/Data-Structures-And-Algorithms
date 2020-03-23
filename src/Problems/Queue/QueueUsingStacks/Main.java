package Problems.Queue.QueueUsingStacks;

public class Main {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();

        queue.push(4);
        queue.push(8);
        queue.push(12);
        queue.push(22);
        System.out.println("Pop: " + queue.pop());
        System.out.println("Pop: " + queue.pop());
        queue.push(100);
        System.out.println("Pop: " + queue.pop());
    }
}
