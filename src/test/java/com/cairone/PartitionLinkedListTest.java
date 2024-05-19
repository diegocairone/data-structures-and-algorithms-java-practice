package com.cairone;

import com.cairone.leet.linkedlist.PartitionLinkedList;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

@Slf4j
class PartitionLinkedListTest {

    @Test
    void partitionList() {

        PartitionLinkedList list = new PartitionLinkedList(1);
        list.append(4);
        list.append(3);
        list.append(2);
        list.append(5);
        list.append(2);

        PartitionLinkedList.Node node = list.getHead();
        PartitionLinkedList.Node prev = null;
        list.partitionList(3);

        while (node != null) {
            log.info("Node: {}", node.value);
            prev = node;
            node = node.next;
        }

        Assertions.assertThat(prev.value).isEqualTo(5);
    }
}