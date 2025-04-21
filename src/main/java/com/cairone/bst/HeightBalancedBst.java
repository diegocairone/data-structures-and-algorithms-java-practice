package com.cairone.bst;

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

    public void sortedArrayToBST(int[] nums) {
        this.root = sortedArrayToBST(nums, 0, nums.length - 1);
    }

    private BstNode sortedArrayToBST(int[] nums, int left, int right) {
        // TODO
        return null;
    }
}
