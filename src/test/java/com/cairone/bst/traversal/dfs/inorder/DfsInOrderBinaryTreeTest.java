package com.cairone.bst.traversal.dfs.inorder;

import com.cairone.bst.traversal.dfs.preorder.DfsPreOrderBinaryTree;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DfsInOrderBinaryTreeTest {

    @Test
    void getAllValues() {

        DfsInOrderBinaryTree tree = new DfsInOrderBinaryTree(47);
        tree.insert(21);
        tree.insert(18);
        tree.insert(27);
        tree.insert(76);
        tree.insert(52);
        tree.insert(82);

        List<Integer> result = tree.getAllValues();
        List<Integer> expected = List.of(18, 21, 27, 47, 52, 76, 82);

        System.out.println(result);
        Assertions.assertThat(result).isEqualTo(expected);
    }
}