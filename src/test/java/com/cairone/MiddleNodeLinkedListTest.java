package com.cairone;

import com.cairone.leet.linkedlist.MiddleNodeLinkedList;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class MiddleNodeLinkedListTest {

    @Test
    void findMiddleNode_OneElems() {

        MiddleNodeLinkedList list = new MiddleNodeLinkedList(1);

        MiddleNodeLinkedList.Node node = list.findMiddleNode();
        Assertions.assertThat(node.value).isEqualTo(1);
    }

    @Test
    void findMiddleNode_twoElems() {

        MiddleNodeLinkedList list = new MiddleNodeLinkedList(1);
        list.append(2);

        MiddleNodeLinkedList.Node node = list.findMiddleNode();
        Assertions.assertThat(node.value).isEqualTo(2);
    }

    @Test
    void findMiddleNode_threeElems() {

        MiddleNodeLinkedList list = new MiddleNodeLinkedList(1);
        list.append(2);
        list.append(3);

        MiddleNodeLinkedList.Node node = list.findMiddleNode();
        Assertions.assertThat(node.value).isEqualTo(2);
    }

    @Test
    void findMiddleNode_fourElems() {

        MiddleNodeLinkedList list = new MiddleNodeLinkedList(1);
        list.append(2);
        list.append(3);
        list.append(4);

        MiddleNodeLinkedList.Node node = list.findMiddleNode();
        Assertions.assertThat(node.value).isEqualTo(3);
    }
}