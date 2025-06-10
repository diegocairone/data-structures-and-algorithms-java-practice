package com.cairone.bst.traversal.dfs.preorder;

import com.cairone.bst.traversal.MyBinaryTree;
import com.cairone.bst.traversal.MyIntegerNode;

import java.util.ArrayList;
import java.util.List;

public class DfsPreOrderBinaryTree extends MyBinaryTree {

    public DfsPreOrderBinaryTree() {
    }

    public DfsPreOrderBinaryTree(Integer value) {
        super(value);
    }

    public List<Integer> getAllValues() {

        ArrayList<Integer> results = new ArrayList<>();

        class Traverse {
            // add first and then traverse
            public Traverse(MyIntegerNode currentNode) {
                results.add(currentNode.getValue());
                if (currentNode.getLeftNode() != null) {
                    new Traverse(currentNode.getLeftNode());
                }
                if (currentNode.getRightNode() != null) {
                    new Traverse(currentNode.getRightNode());
                }
            }
        }

        new Traverse(root);

        return results;
    }
}
