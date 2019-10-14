package BinarySearchTree;

@SuppressWarnings("Duplicates")
public class BinarySearchTree {
    public class Node {
        public Node left;
        public Node right;
        public int value;

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

    public Integer get(int value) {
        if (this.root == null) {
            return null;
        }

        Node currentNode = this.root;
        while (currentNode != null) {
            if (value < currentNode.value) {
                currentNode = currentNode.left;

            } else if (value > currentNode.value) {
                currentNode = currentNode.right;

            } else if (value == currentNode.value) {
                return currentNode.value;
            }
        }

        return null;
    }

    public Node getNode(int value) {
        if (this.root == null) {
            return null;
        }

        Node currentNode = this.root;
        while (currentNode != null) {
            if (value < currentNode.value) {
                currentNode = currentNode.left;

            } else if (value > currentNode.value) {
                currentNode = currentNode.right;

            } else if (value == currentNode.value) {
                return currentNode;
            }
        }

        return null;
    }

    public boolean remove(int value) {
        if (this.root == null) {
            return false;
        }

        Node currentNode = this.root;
        Node parentNode = null;

        while (currentNode != null) {
            if (value < currentNode.value) {
                parentNode = currentNode;
                currentNode = currentNode.left;

            } else if (value > currentNode.value) {
                parentNode = currentNode;
                currentNode = currentNode.right;

            } else if (value == currentNode.value) {
                // Option 1: Not right child
                if (currentNode.right == null) {
                    if (parentNode == null) {
                        this.root = currentNode.left;

                    } else {
                        //if parent > current value, make current left child a child of parent
                        if (currentNode.value < parentNode.value) {
                            parentNode.left = currentNode.left;

                        } else if (currentNode.value > parentNode.value) {
                            parentNode.right = currentNode.left;
                        }
                    }

                    //Option 2: Right child which doesnt have a left child
                } else if (currentNode.right.left == null) {
                    currentNode.right.left = currentNode.left;

                    if (parentNode == null) {
                        this.root = currentNode.right;

                    } else {
                        //if parent > current, make right child of the left the parent
                        if (currentNode.value < parentNode.value) {
                            parentNode.left = currentNode.right;

                            //if parent < current, make right child a right child of the parent
                        } else if (currentNode.value > parentNode.value) {
                            parentNode.right = currentNode.right;
                        }
                    }

                    //Option 3: Right child that has a left child
                } else {
                    //find the Right child's left most child
                    Node leftMost = currentNode.right.left;
                    Node leftMostParent = currentNode.right;

                    while (leftMost.left != null) {
                        leftMostParent = leftMost;
                        leftMost = leftMost.left;
                    }

                    //Parent's left subtree is now leftmost's right subtree
                    leftMostParent.left = leftMost.right;
                    leftMost.left = currentNode.left;
                    leftMost.right = currentNode.right;

                    if (parentNode == null) {
                        this.root = leftMost;

                    } else {
                        if (currentNode.value < parentNode.value) {
                            parentNode.left = leftMost;

                        } else if (currentNode.value > parentNode.value) {
                            parentNode.right = leftMost;
                        }
                    }
                }

                return true;
            }
        }

        return false;
    }

    public Node getRoot() {
        return this.root;
    }
}
