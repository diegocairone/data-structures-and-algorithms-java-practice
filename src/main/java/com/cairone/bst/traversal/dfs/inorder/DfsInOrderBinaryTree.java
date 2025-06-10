package com.cairone.bst.traversal.dfs.inorder;

import com.cairone.bst.traversal.MyBinaryTree;
import com.cairone.bst.traversal.MyIntegerNode;

import java.util.ArrayList;
import java.util.List;

public class DfsInOrderBinaryTree extends MyBinaryTree {

    public DfsInOrderBinaryTree() {
    }

    public DfsInOrderBinaryTree(Integer value) {
        super(value);
    }

    public List<Integer> getAllValues() {

        ArrayList<Integer> results = new ArrayList<>();

        class Traverse {

            public Traverse(MyIntegerNode currentNode) {
                if (currentNode.getLeftNode() != null) {
                    new Traverse(currentNode.getLeftNode());
                }

                // to the left first, then add, and finally go the right
                results.add(currentNode.getValue());

                if (currentNode.getRightNode() != null) {
                    new Traverse(currentNode.getRightNode());
                }
            }
        }

        new Traverse(root);

        return results;
    }
}
