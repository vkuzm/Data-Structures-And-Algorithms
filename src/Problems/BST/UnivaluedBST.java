package Problems.BST;

import BinarySearchTree.BTreePrinter;
import BinarySearchTree.BinarySearchTree;
import BinarySearchTree.BinarySearchTree.Node;

@SuppressWarnings("Duplicates")
public class UnivaluedBST {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(1);
        tree.insert(1);
        tree.insert(1);
        tree.insert(1);

        boolean result = isUnivalTree(tree.getRoot());
        System.out.println(result);
    }

    public static boolean isUnivalTree(Node node) {
        if (node == null) {
            return true;
        }

        if (node.left != null) {
            if (node.value != node.left.value) {
                return false;
            }
        }

        if (node.right != null) {
            if (node.value != node.right.value) {
                return false;
            }
        }

        return isUnivalTree(node.left) && isUnivalTree(node.right);
    }
}
