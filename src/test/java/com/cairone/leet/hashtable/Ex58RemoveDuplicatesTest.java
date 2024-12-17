package com.cairone.leet.hashtable;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class Ex58RemoveDuplicatesTest {

    @Test
    void test01() {

        List<Integer> myList = List.of(1, 2, 3, 4, 1, 2, 5, 6, 7, 3, 4, 8, 9, 5);
        List<Integer> newList = Ex58RemoveDuplicates.removeDuplicates(myList);

        List<Integer> expected = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

        Assertions.assertThat(newList).containsAll(expected);
    }

    @Test
    void test02() {

        List<Integer> myList = List.of(1, 2, 3, 4, 1, 2, 5, 6, 7, 3, 4, 8, 9, 5);
        List<Integer> newList = Ex58RemoveDuplicates.removeDuplicates2(myList);

        List<Integer> expected = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

        Assertions.assertThat(newList).containsAll(expected);
    }
}