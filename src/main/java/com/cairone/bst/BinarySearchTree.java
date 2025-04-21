package com.cairone.bst;

import java.util.StringJoiner;

public class BinarySearchTree {

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(5);
        bst.insert(3);
        bst.insert(10);
        bst.insert(8);
        bst.insert(12);
        System.out.println(bst.root);
    }

    Node root;

    public BinarySearchTree() {
    }

    public BinarySearchTree(int value) {
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

    public boolean contains(int value) {
        if (root == null) {
            return false;
        }
        Node temp = root;
        while (temp != null) {
            if (value < temp.value) {
                temp = temp.left;
            } else if (value > temp.value) {
                temp = temp.right;
            } else {
                return true;
            }
        }
        return false;
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
