package Problems.Queue.QueueUsingStacks2;

import java.util.Stack;

class MyQueue {

  private Stack<Integer> stack = new Stack<>();

  /**
   * Push element x to the back of queue.
   */
  public void push(int x) {
    Stack<Integer> tempStack = new Stack<>();

    if (stack.empty()) {
        stack.push(x);
    } else {
        while (!stack.empty()) {
            tempStack.push(stack.pop());
        }
        stack.push(x);
        while (!tempStack.empty()) {
            stack.push(tempStack.pop());
        }
    }
  }

  /**
   * Removes the element from in front of queue and returns that element.
   */
  public int pop() {
    return stack.pop();
  }

  /**
   * Get the front element.
   */
  public int peek() {
    return stack.peek();
  }

  /**
   * Returns whether the queue is empty.
   */
  public boolean empty() {
    return stack.empty();
  }
}