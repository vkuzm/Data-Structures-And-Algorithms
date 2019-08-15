package BFS;

@SuppressWarnings("Duplicates")
public class BinarySearchTree {
    class Node {
        Node left;
        Node right;
        int value;

        Node(int value) {
            this.left = null;
            this.right = null;
            this.value = value;
        }
    }

    private Node root = null;

    public void insert(int value) {
        Node newNode = new Node(value);

        if (this.root == null) {
            this.root = newNode;
        } else {

            Node currentNode = this.root;
            while (true) {
                if (value < currentNode.value) {
                    if (currentNode.left == null) {
                        currentNode.left = newNode;
                        break;
                    }

                    currentNode = currentNode.left;

                } else {
                    if (currentNode.right == null) {
                        currentNode.right = newNode;
                        break;
                    }

                    currentNode = currentNode.right;
                }
            }
        }
    }

    public Node getRoot() {
        return this.root;
    }

}
