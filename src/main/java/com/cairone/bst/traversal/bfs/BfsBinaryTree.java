package com.cairone.bst.traversal.bfs;

import com.cairone.bst.traversal.MyBinaryTree;
import com.cairone.bst.traversal.MyIntegerNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BfsBinaryTree extends MyBinaryTree {

    public BfsBinaryTree() {
    }

    public BfsBinaryTree(Integer value) {
        super(value);
    }

    /**
     * Breath first search algorithm.
     * Use a Java queue.
     * Add the root element to the queue and iterate the queue while it is not empty.
     * For each element, add the value to the list and the children to the queue
     *
     * @return A list containing al values in the tree
     */
    public List<Integer> getAllValues() {

        ArrayList<Integer> result = new ArrayList<>();
        Queue<MyIntegerNode> queue = new LinkedList<>();

        MyIntegerNode currentNode = root;
        queue.add(currentNode);

        while (!queue.isEmpty()) {

            currentNode = queue.remove();
            Integer value = currentNode.getValue();
            result.add(value);

            if (currentNode.getLeftNode() != null) {
                queue.add(currentNode.getLeftNode());
            }
            if (currentNode.getRightNode() != null) {
                queue.add(currentNode.getRightNode());
            }
        }

        return result;
    }

}
