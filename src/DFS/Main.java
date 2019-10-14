package DFS;

import java.util.List;

@SuppressWarnings("Duplicates")
public class Main {
    public static void main(String[] args) {

        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(9);
        tree.insert(4);
        tree.insert(6);
        tree.insert(20);
        tree.insert(170);
        tree.insert(15);
        tree.insert(1);

        BTreePrinter.printNode(tree.getRoot());
        List<Integer> inOrder = tree.DFSInOrder();
        System.out.println("InOrder: " + inOrder.toString());

        List<Integer> preOrder = tree.DFSPreOrder();
        System.out.println("PreOrder: " + preOrder.toString());

        List<Integer> postOrder = tree.DFSPostOrder();
        System.out.println("PostOrder: " + postOrder.toString());
    }
}