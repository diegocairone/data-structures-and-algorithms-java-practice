package com.cairone.leet.hashtable;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.List;

class Ex60FindPairsTest {

    @Test
    void test01() {

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 4, 6, 8, 10};
        int target = 7;

        List<int[]> pairs = Ex60FindPairs.findPairs(arr1, arr2, target);
        List<int[]> expected = List.of(
                new int[]{5, 2},
                new int[]{3, 4},
                new int[]{1, 6}
        );

        Assertions.assertThat(pairs).containsAll(expected);
    }

    @Test
    @Disabled
    void test02() {

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 4, 6, 3, 10};
        int target = 7;

        List<int[]> pairs = Ex60FindPairs.findPairs(arr1, arr2, target);
        List<int[]> expected = List.of(
                new int[]{5, 2},
                new int[]{3, 4},
                new int[]{1, 6}
        );

        Assertions.assertThat(pairs).containsAll(expected);
        Assertions.assertThat(expected).containsAll(pairs);
    }
}