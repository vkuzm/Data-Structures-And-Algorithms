package DFS;

import java.util.ArrayList;
import java.util.List;

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
    // Space complexity - O(h) - height of the tree
    public List<Integer> DFSInOrder() {
        return traverseInOrder(this.root, new ArrayList<>());
    }

    // Time complexity - O(n)
    // Space complexity - O(h) - height of the tree
    public List<Integer> DFSPreOrder() {
        return traversePreOrder(this.root, new ArrayList<>());
    }

    // Time complexity - O(n)
    // Space complexity - O(h) - height of the tree
    public List<Integer> DFSPostOrder() {
        return traversePostOrder(this.root, new ArrayList<>());
    }

    private List<Integer> traverseInOrder(Node node, List<Integer> list) {
        System.out.println(node.value);

        if (node.left != null) {
            traverseInOrder(node.left, list);
        }

        //System.out.println("add " + node.value);
        list.add(node.value);

        if (node.right != null) {
            traverseInOrder(node.right, list);
        }

        return list;
    }

    private List<Integer> traversePreOrder(Node node, List<Integer> list) {
        System.out.println(node.value);

        list.add(node.value);

        if (node.left != null) {
            traversePreOrder(node.left, list);
        }
        if (node.right != null) {
            traversePreOrder(node.right, list);
        }

        return list;
    }

    private List<Integer> traversePostOrder(Node node, List<Integer> list) {
        System.out.println(node.value);

        if (node.left != null) {
            traversePostOrder(node.left, list);
        }
        if (node.right != null) {
            traversePostOrder(node.right, list);
        }

        list.add(node.value);

        return list;
    }

}
