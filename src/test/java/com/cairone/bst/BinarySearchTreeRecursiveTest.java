package com.cairone.bst;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BinarySearchTreeRecursiveTest {

    @Test
    void minValueAlt() {
        BinarySearchTreeRecursive myBST = new BinarySearchTreeRecursive();
        myBST.insert(47);
        myBST.insert(21);
        myBST.insert(76);
        myBST.insert(18);
        myBST.insert(27);
        myBST.insert(52);
        myBST.insert(82);

        Assertions.assertEquals(myBST.minValueAlt(myBST.root), 18);
        Assertions.assertEquals(myBST.minValueAlt(myBST.root.right), 52);
    }
}