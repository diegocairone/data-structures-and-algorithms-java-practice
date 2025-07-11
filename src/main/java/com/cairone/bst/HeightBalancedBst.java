package com.cairone.bst;

import java.util.ArrayList;
import java.util.List;

public class HeightBalancedBst {

    private BstNode root;

    public HeightBalancedBst() {
    }

    public HeightBalancedBst(Integer value) {
        this.root = new BstNode(value);
    }

    public int getRootValue() {
        return this.root == null ? null : this.root.getValue();
    }

    public void prettyPrint() {
        BstPrettyPrint.prettyPrint(root);
    }

    public boolean insert(Integer value) {
        BstNode newNode = new BstNode(value);
        if (root == null) {
            this.root = newNode;
            return true;
        }
        return addNewNode(root, newNode);
    }

    private boolean addNewNode(BstNode parent, BstNode newNode) {

        if (newNode.getValue().compareTo(parent.getValue()) > 0) {
            // new node must be inserted on the right side
            BstNode rightNode = parent.getRightNode();
            if (rightNode == null) {
                parent.setRightNode(newNode);
                return true;
            } else {
                return addNewNode(rightNode, newNode);
            }
        } else if (newNode.getValue().compareTo(parent.getValue()) < 0) {
            // new node must be inserted on the right side
            BstNode leftNode = parent.getLeftNode();
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

    /**
     * This method return the height of a <b>balanced tree</b>.
     *
     * @param node root node from where to start
     * @return height
     */
    private int getBalancedHeight(BstNode node) {
        if (node == null) {
            return 0;
        }
        int leftHeight = getBalancedHeight(node.getLeftNode());
        if (leftHeight == -1) {
            return -1;
        }
        int rightHeight = getBalancedHeight(node.getRightNode());
        if (rightHeight == -1) {
            return -1;
        }
        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        }
        return 1 + Math.max(leftHeight, rightHeight);
    }

    public boolean isBalanced() {
        return getBalancedHeight(root) != -1;
    }

    public int calculateHeight() {
        return calculateHeight(root) - 1;
    }

    private int calculateHeight(BstNode parent) {
        if (parent == null) {
            return 0;
        }
        int countRight = calculateHeight(parent.getRightNode()) + 1;
        int countLeft = calculateHeight(parent.getLeftNode()) + 1;
        return Math.max(countRight, countLeft);
    }

    // BST: Convert Sorted Array to Balanced BST ( ** Interview Question)
    public void sortedArrayToBST(int[] nums) {
        this.root = sortedArrayToBST(nums, 0, nums.length - 1);
    }

    private BstNode sortedArrayToBST(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }

        int mid = left + (right - left) / 2;

        BstNode root = new BstNode(nums[mid]);
        root.setLeftNode(sortedArrayToBST(nums, left, mid - 1));

        root.setRightNode(sortedArrayToBST(nums, mid + 1, right));
        return root;
    }

    // BST: Invert Binary Tree ( ** Interview Question)
    public void invert() {
        root = invertTree(root);
    }

    private BstNode invertTree(BstNode node) {
        // The base case for the recursion is when the node is null. [cite: 39]
        // If the tree is empty, it returns null. [cite: 7]
        if (node == null) {
            return null;
        }

        // A temporary node is used to facilitate the swap of the left and right children. [cite: 41]
        BstNode temp = node.getLeftNode();
        // The swap happens by assigning the inverted right subtree to the left child.
        node.setLeftNode(invertTree(node.getRightNode()));
        // And assigning the original left child (stored in temp) to the right child after it has been inverted.
        node.setRightNode(invertTree(temp));

        // The method returns the node after its subtree has been inverted. [cite: 37]
        return node;
    }

    public List<Integer> convertToAnInOrderList() {
        List<Integer> result = new ArrayList<>();
        inorderHelper(this.root, result);
        return result;
    }

    private void inorderHelper(BstNode node, List<Integer> result) {
        if (node == null) return;
        inorderHelper(node.getLeftNode(), result);
        result.add(node.getValue());
        inorderHelper(node.getRightNode(), result);
    }
}
