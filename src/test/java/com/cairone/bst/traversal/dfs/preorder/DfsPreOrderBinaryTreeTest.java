package com.cairone.bst.traversal.dfs.preorder;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DfsPreOrderBinaryTreeTest {

    @Test
    void getAllValues() {
        DfsPreOrderBinaryTree tree = new DfsPreOrderBinaryTree(47);
        tree.insert(21);
        tree.insert(18);
        tree.insert(27);
        tree.insert(76);
        tree.insert(52);
        tree.insert(82);

        List<Integer> result = tree.getAllValues();
        List<Integer> expected = List.of(47, 21, 18, 27, 76, 52, 82);

        System.out.println(result);
        Assertions.assertThat(result).isEqualTo(expected);
    }
}