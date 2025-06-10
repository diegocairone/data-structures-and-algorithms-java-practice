package com.cairone.bst.traversal.dfs.postorder;

import com.cairone.bst.traversal.MyBinaryTree;
import com.cairone.bst.traversal.MyIntegerNode;

import java.util.ArrayList;
import java.util.List;

public class DfsPostOrderBinaryTree extends MyBinaryTree {

    public DfsPostOrderBinaryTree() {
    }

    public DfsPostOrderBinaryTree(Integer value) {
        super(value);
    }

    public List<Integer> getAllValues() {

        ArrayList<Integer> results = new ArrayList<>();

        class Traverse {
            // traverse first and then add
            public Traverse(MyIntegerNode currentNode) {
                if (currentNode.getLeftNode() != null) {
                    new Traverse(currentNode.getLeftNode());
                }
                if (currentNode.getRightNode() != null) {
                    new Traverse(currentNode.getRightNode());
                }
                results.add(currentNode.getValue());
            }
        }

        new Traverse(root);

        return results;
    }
}
