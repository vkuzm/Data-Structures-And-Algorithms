package BFS;

import BFS.BinarySearchTree.Node;

import java.util.*;

@SuppressWarnings("Duplicates")
public class BFS_Explore {
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

        //     9
        //  4     20
        //1  6  15  170

        List<Integer> result = breadthFirstSearchExplore(tree.getRoot());
        System.out.println(result.toString());
    }

    private static List<Integer> breadthFirstSearchExplore(Node root) {
        Node currentNode = root;
        List<Integer> list = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();

        queue.add(currentNode);

        while (!queue.isEmpty()) {
            currentNode = queue.remove();
            list.add(currentNode.value);

            if (currentNode.left != null) {
                queue.add(currentNode.left);
            }
            if (currentNode.right != null) {
                queue.add(currentNode.right);
            }
        }

        return list;
    }
}