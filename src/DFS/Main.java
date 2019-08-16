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
        System.out.println("IN ORDER");
        List<Integer> inOrder = tree.DFSInOrder();
        System.out.println(inOrder.toString() + "\n");

        BTreePrinter.printNode(tree.getRoot());
        System.out.println("PRE ORDER");
        List<Integer> preOrder = tree.DFSPreOrder();
        System.out.println(preOrder.toString() + "\n");

        BTreePrinter.printNode(tree.getRoot());
        System.out.println("POST ORDER");
        List<Integer> postOrder = tree.DFSPostOrder();
        System.out.println(postOrder.toString() + "\n");
    }
}