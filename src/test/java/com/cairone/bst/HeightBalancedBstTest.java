package com.cairone.bst;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class HeightBalancedBstTest {

    @Test
    void getRootValue() {
        HeightBalancedBst bst = new HeightBalancedBst(100);
        Integer rootValue = bst.getRootValue();
        Assertions.assertThat(rootValue).isEqualTo(100);
    }

    @Test
    void givenBst_whenNoNode_thenHeightIsMinusOne() {

        HeightBalancedBst bst = new HeightBalancedBst();

        int height = bst.calculateHeight();
        System.out.println("Height: " + height);
        Assertions.assertThat(height).isEqualTo(-1);
    }

    @Test
    void givenBst_whenSingleNode_thenHeightIs0() {

        HeightBalancedBst bst = new HeightBalancedBst(7);

        int height = bst.calculateHeight();
        System.out.println("Height: " + height);
        Assertions.assertThat(height).isEqualTo(0);
    }

    @Test
    void givenBst_whenMultipleNodes_thenHeightIsPositive() {

        HeightBalancedBst bst = new HeightBalancedBst(7);
        bst.insert(9);
        bst.insert(5);
        bst.insert(10);
        bst.insert(3);
        bst.insert(15);
        bst.insert(17);

        int height = bst.calculateHeight();
        System.out.println("Height: " + height);
        Assertions.assertThat(height).isEqualTo(4);
    }

    @Test
    void givenBst_whenBalanced_thenIsBalancedIsTrue() {

        HeightBalancedBst bst = new HeightBalancedBst(9);
        bst.insert(7);
        bst.insert(11);
        bst.insert(3);
        bst.insert(8);
        bst.insert(5);
        bst.insert(10);
        bst.insert(15);
        bst.insert(14);

        bst.prettyPrint();
        int height = bst.calculateHeight();
        System.out.println("Height: " + height);
        Assertions.assertThat(bst.isBalanced()).isTrue();
    }

    @Test
    void test() {
        HeightBalancedBst bst = new HeightBalancedBst();
        bst.sortedArrayToBST(new int[] {3, 5, 7, 8, 9, 10, 11, 14, 15});
        bst.prettyPrint();

    }
}