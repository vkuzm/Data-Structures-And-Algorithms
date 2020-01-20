package InvertBinaryTree;

import BinarySearchTree.BinarySearchTree;
import BinarySearchTree.BTreePrinter;
import BinarySearchTree.BinarySearchTree.Node;

import java.util.LinkedList;
import java.util.Queue;

@SuppressWarnings("Duplicates")
public class InvertBinaryTree {
    public static void main(String[] args) {

        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(4);
        tree.insert(2);
        tree.insert(7);
        tree.insert(1);
        tree.insert(3);
        tree.insert(6);
        tree.insert(9);

        BTreePrinter.printNode(tree.getRoot());

        System.out.println("REVERSED");
        Node reversedTree = reverseTree(tree.getRoot());
        BTreePrinter.printNode(reversedTree);
    }

    private static Node reverseTree(Node rootNode) {
        Queue<Node> queue = new LinkedList<>();

        queue.add(rootNode);
        while (!queue.isEmpty()) {
            Node current = queue.poll();
            Node temp = current.right;
            current.right = current.left;
            current.left = temp;

            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }
        }
        return rootNode;
    }
}