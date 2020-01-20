package InvertBinaryTree;

import BinarySearchTree.BinarySearchTree;
import BinarySearchTree.BTreePrinter;
import BinarySearchTree.BinarySearchTree.Node;

@SuppressWarnings("Duplicates")
public class InvertBinaryRecursively {
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
        if (rootNode == null) {
            return null;
        }
        Node right = reverseTree(rootNode.right);
        Node left = reverseTree(rootNode.left);

        rootNode.left = right;
        rootNode.right = left;
        return rootNode;
    }
}