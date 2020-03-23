package Problems.Queue.QueueUsingStacks2;

public class Main {
    public static void main(String[] args) {

        MyQueue queue = new MyQueue();

        queue.push(4);
        queue.push(8);
        queue.push(12);
        System.out.println("Pop: " + queue.pop());
        System.out.println("Peek: " + queue.peek());
        queue.push(22);
        System.out.println("Peek: " + queue.peek());

    }
}
