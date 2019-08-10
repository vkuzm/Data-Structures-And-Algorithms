package QueueUsingStacks;

import java.util.Stack;

class MyQueue {

    private final Stack<Integer> input;
    private final Stack<Integer> output;

    public MyQueue() {
        input = new Stack<>();
        output = new Stack<>();
    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        input.push(x);
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public Integer pop() {
        peek();
        return output.pop();
    }

    /**
     * Get the front element.
     */
    public Integer peek() {
        if (output.empty()) {
            while (!input.empty()) {
                output.push(input.pop());
            }
        }

        return output.peek();
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        return input.empty() && output.empty();
    }

}
