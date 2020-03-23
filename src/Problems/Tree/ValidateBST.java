package Problems.Tree;

import BinarySearchTree.BinarySearchTree;
import BinarySearchTree.BTreePrinter;
import BinarySearchTree.BinarySearchTree.Node;

@SuppressWarnings("Duplicates")
public class ValidateBST {
    public static void main(String[] args) {

        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(9);
        tree.insert(4);
        tree.insert(6);
        tree.insert(20);
        tree.insert(170);
        tree.insert(15);
        tree.insert(1);
        tree.insert(7);
        tree.insert(5);

        BTreePrinter.printNode(tree.getRoot());

        // Validate the tree
        boolean result = isValidBST(tree.getRoot());
        System.out.println(result);
    }

    private static boolean isValidBST(Node root) {
        return isValidBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private static boolean isValidBST(Node node, int min, int max) {
        if (node == null) return true;
        if (node.value >= max || node.value <= min) return false;

        return isValidBST(node.left, min, node.value)
                && isValidBST(node.right, node.value, max);
    }

}