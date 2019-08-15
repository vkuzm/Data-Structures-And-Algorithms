package BFS;

import BFS.BinarySearchTree.Node;

import java.util.*;

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

        //     9
        //  4     20
        //1  6  15  170

        //List<Integer> result = breadthFirstSearchValues(tree.getRoot());
        //System.out.println(result.toString());


        List<Node> result = breadthFirstSearch(tree.getRoot(), 170);

        for (Node node : result) {
            System.out.println(node.value);
        }
    }

    private static List<Node> breadthFirstSearch(Node startNode, int searchValue) {
        if (startNode.value == searchValue) {
            return Collections.singletonList(startNode);
        }

        Node currentNode = startNode;
        Queue<Node> queue = new LinkedList<>();
        List<Node> explored = new ArrayList<>();

        queue.add(currentNode);
        explored.add(currentNode);

        while (!queue.isEmpty()) {
            currentNode = queue.remove();

            if (currentNode.value == searchValue) {
                return explored;

            } else {

                if (currentNode.left != null) {
                    queue.add(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.add(currentNode.right);
                }
            }

            explored.add(currentNode);
        }

        return explored;
    }

    private static List<Integer> breadthFirstSearchValues(Node root) {
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