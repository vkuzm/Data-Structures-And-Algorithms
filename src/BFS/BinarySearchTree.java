package BFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

@SuppressWarnings("Duplicates")
public class BinarySearchTree {
    class Node {
        Node left;
        Node right;
        int value;

        Node(int value) {
            this.left = null;
            this.right = null;
            this.value = value;
        }
    }

    private Node root = null;

    public void insert(int value) {
        Node newNode = new Node(value);

        if (this.root == null) {
            this.root = newNode;
        } else {

            Node currentNode = this.root;
            while (true) {
                if (value < currentNode.value) {
                    if (currentNode.left == null) {
                        currentNode.left = newNode;
                        break;
                    }

                    currentNode = currentNode.left;

                } else {
                    if (currentNode.right == null) {
                        currentNode.right = newNode;
                        break;
                    }

                    currentNode = currentNode.right;
                }
            }
        }
    }

    public Node getRoot() {
        return this.root;
    }

    // Time complexity - O(n)
    // Space complexity - O(n)
    public boolean breadthFirstSearch(int searchValue) {
        Node currentNode = this.root;
        Queue<Node> queue = new LinkedList<>();

        queue.add(currentNode);

        while (!queue.isEmpty()) {
            currentNode = queue.remove();

            System.out.println(currentNode.value);

            if (currentNode.value == searchValue) {
                return true;
            }
            if (currentNode.left != null) {
                queue.add(currentNode.left);
            }
            if (currentNode.right != null) {
                queue.add(currentNode.right);
            }
        }

        return false;
    }

    public List<Integer> breadthFirstSearchRecursive(Queue<Node> queue, List<Integer> list) {
        if (queue.isEmpty()) {
            return list;
        }

        Node currentNode = queue.remove();
        list.add(currentNode.value);

        if (currentNode.left != null) {
            queue.add(currentNode.left);
        }
        if (currentNode.right != null) {
            queue.add(currentNode.right);
        }

        return breadthFirstSearchRecursive(queue, list);
    }

    // Time complexity - O(n)
    // Space complexity O(n) - (only queue)
    // O(n + m) - (queue + explored list)
    public List<Integer> breadthFirstSearchExplore() {
        Node currentNode = this.root;
        List<Integer> explored = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();

        queue.add(currentNode);

        while (!queue.isEmpty()) {
            currentNode = queue.remove();
            explored.add(currentNode.value);

            if (currentNode.left != null) {
                queue.add(currentNode.left);
            }
            if (currentNode.right != null) {
                queue.add(currentNode.right);
            }
        }

        return explored;
    }

}
