package com.cairone.bst;

import java.util.StringJoiner;

public class BinarySearchTreeRecursive {

    public static void main(String[] args) {
        BinarySearchTreeRecursive bst = new BinarySearchTreeRecursive();
        bst.insert(5);
        bst.insert(3);
        bst.insert(10);
        bst.insert(8);
        bst.insert(12);
        System.out.println(bst.root);
    }

    Node root;

    public BinarySearchTreeRecursive() {
    }

    public BinarySearchTreeRecursive(int value) {
        this.root = new Node(value);
    }

    public boolean insert(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            this.root = newNode;
            return true;
        }
        Node temp = root;
        while (true) {
            if (temp.value == newNode.value) {
                return false;
            }
            if (newNode.value < temp.value) {
                if (temp.left == null) {
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            } else {
                if (temp.right == null) {
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }
        }
    }

    public void insertRecursively(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            this.root = newNode;
            return;
        }
        add(root, newNode);
    }

    private void add(Node parent, Node node) {
        if (parent.value > node.value) {
            // add node to the left
            if (parent.left == null) {
                parent.left = node;
            } else {
                add(parent.left, node);
            }
        } else if (parent.value < node.value) {
            // add node to the right
            if (parent.right == null) {
                parent.right = node;
            } else {
                add(parent.right, node);
            }
        }
    }

    public Node rInsert(Node currentNode, int value) {
        if (currentNode == null) return new Node(value);
        if (value < currentNode.value) {
            currentNode.left = rInsert(currentNode.left, value);
        } else if (value > currentNode.value) {
            currentNode.right = rInsert(currentNode.right, value);
        }
        return currentNode;
    }

    private void rInsert(int value) {
        if (root == null) root = new Node(value);
        rInsert(root, value);
    }

    public Node deleteNode(Node currentNode, int value) {
        // if the value is not in the tree ...
        if (currentNode == null) return null;

        // code to traverse the tree
        if (value < currentNode.value) {
            currentNode.left = deleteNode(currentNode.left, value);
        } else if (value > currentNode.value) {
            currentNode.right = deleteNode(currentNode.right, value);
        } else {
            // if value is in the tree and in the current node
            // we have 4 possibilities ...
            // it is a leaf node
            if (currentNode.left == null && currentNode.right == null) {
                return null;
            } else if (currentNode.left != null && currentNode.right == null) {
                Node temp = currentNode.left;
                currentNode = temp;
                return currentNode;
            } else if (currentNode.left == null && currentNode.right != null) {
                currentNode = currentNode.right;
                return currentNode;
            } else {
                // node has 2 child nodes ...
                // required to determine minimum value in the subtree from the right and delete it
                int subTreeMin = minValue(currentNode.right);
                currentNode.value = subTreeMin;
                currentNode.right = deleteNode(currentNode.right, subTreeMin);
            }
        }

        return currentNode;
    }

    public int minValueAlt(Node currentNode) {
        if (currentNode.left == null) {
            return currentNode.value;
        }
        return minValueAlt(currentNode.left);
    }

    public int minValue(Node currentNode) {
        while (currentNode.left != null) {
            currentNode = currentNode.left;
        }
        return currentNode.value;
    }

    private void deleteNode(int value) {
        deleteNode(root, value);
    }

    public boolean rContains(int value) {
        return rContains(root, value);
    }

    private boolean rContains(Node currentNode, int value) {
        if (currentNode == null) return false;
        if (currentNode.value == value) return true;
        if (value < currentNode.value) {
            return rContains(currentNode.left, value);
        } else {
            return rContains(currentNode.right, value);
        }
    }


    class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", Node.class.getSimpleName() + "[", "]")
                    .add("value=" + value)
                    .toString();
        }
    }
}
