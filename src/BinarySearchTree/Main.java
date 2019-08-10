package BinarySearchTree;

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
        tree.insert(7);
        tree.insert(5);

        BTreePrinter.printNode(tree.getRoot());

        System.out.println(tree.get(15));

        boolean removed = tree.remove(4);

        System.out.println(removed);

        BTreePrinter.printNode(tree.getRoot());
    }
}