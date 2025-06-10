package com.cairone.bst.traversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public abstract class MyBinaryTree {

    protected MyIntegerNode root;

    public MyBinaryTree() {
    }

    public MyBinaryTree(Integer value) {
        this.root = new MyIntegerNode(value);
    }

    public Integer getRootValue() {
        return root == null ? null : root.getValue();
    }

    public boolean insert(Integer value) {
        MyIntegerNode newNode = new MyIntegerNode(value);
        if (root == null) {
            this.root = newNode;
            return true;
        }
        return addNewNode(root, newNode);
    }

    protected boolean addNewNode(MyIntegerNode parent, MyIntegerNode newNode) {

        if (newNode.getValue().compareTo(parent.getValue()) > 0) {
            // new node must be inserted on the right side
            MyIntegerNode rightNode = parent.getRightNode();
            if (rightNode == null) {
                parent.setRightNode(newNode);
                return true;
            } else {
                return addNewNode(rightNode, newNode);
            }
        } else if (newNode.getValue().compareTo(parent.getValue()) < 0) {
            // new node must be inserted on the right side
            MyIntegerNode leftNode = parent.getLeftNode();
            if (leftNode == null) {
                parent.setLeftNode(newNode);
                return true;
            } else {
                return addNewNode(leftNode, newNode);
            }
        } else {
            return false;
        }
    }
}
