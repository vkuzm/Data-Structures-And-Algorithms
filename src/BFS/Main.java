package BFS;

import Array.Array;
import BFS.BinarySearchTree.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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

        // Search
        boolean result = tree.breadthFirstSearch(6);
        System.out.println(result);

        // Search recursively
        //Queue<Node> queue = new LinkedList<>();
        //queue.add(tree.getRoot());

        //List<Integer> resultRecursive = tree.breadthFirstSearchRecursive(queue, new ArrayList<>());
        //System.out.println(resultRecursive.toString());

        // Explore
        //List<Integer> explored = tree.breadthFirstSearchExplore();
        //System.out.println(explored.toString());
    }
}