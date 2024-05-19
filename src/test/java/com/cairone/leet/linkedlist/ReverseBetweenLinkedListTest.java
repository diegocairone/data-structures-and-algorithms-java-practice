package com.cairone.leet.linkedlist;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReverseBetweenLinkedListTest {

    @Test
    void reverseBetween() {

        ReverseBetweenLinkedList list = new ReverseBetweenLinkedList(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);
        list.append(6);
        list.append(7);
        list.append(8);
        list.append(9);

        list.reverseBetween(2, 7);
        Assertions.assertThat(list.asList()).containsExactly(1, 2, 8, 7, 6, 5, 4, 3, 9);
    }

    @Test
    void reverseEntire() {

        ReverseBetweenLinkedList list = new ReverseBetweenLinkedList(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);

        list.reverseBetween(0, 4);
        Assertions.assertThat(list.asList()).containsExactly(5, 4, 3, 2, 1);
    }


    @Test
    void reverseM2N2Entire() {

        ReverseBetweenLinkedList list = new ReverseBetweenLinkedList(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);

        list.reverseBetween(2, 2);
        Assertions.assertThat(list.asList()).containsExactly(5, 2, 3, 4, 1);
    }

    @Test
    void reverseM2N2Entire2() {

        ReverseBetweenLinkedList list = new ReverseBetweenLinkedList(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);
        list.append(6);
        list.append(7);

        list.reverseBetween(3, 3);
        List<Integer> result = list.asList();
        Assertions.assertThat(list.asList()).containsExactly(1, 2, 3, 4, 5, 6, 7);
    }
}