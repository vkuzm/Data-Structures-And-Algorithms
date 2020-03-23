package Problems.Queue.QueueUsingStacks;

import java.util.Stack;

class MyQueue {

  private Stack<Integer> in = new Stack<>();
  private Stack<Integer> out = new Stack<>();

  /**
   * Push element x to the back of queue.
   */
  public void push(int x) {
    if (in.empty()) {
      while (!out.empty()) {
        in.push(out.pop());
      }
    }
    in.push(x);
  }

  /**
   * Removes the element from in front of queue and returns that element.
   */
  public int pop() {
    if (out.empty()) {
      while (!in.empty()) {
        out.push(in.pop());
      }
    }
    return out.pop();
  }

  /**
   * Get the front element.
   */
  public int peek() {
    if (out.empty()) {
      while (!in.empty()) {
        out.push(in.pop());
      }
    }
    return out.peek();
  }

  /**
   * Returns whether the queue is empty.
   */
  public boolean empty() {
    return in.isEmpty() && out.isEmpty();
  }
}