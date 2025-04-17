package com.cairone.leet.heap;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class StreamMaxTest {

    @Test
    void streamMax_test01() {
        int[] nums = {1, 5, 2, 9, 3, 6, 8};
        List<Integer> actual = StreamMax.streamMax(nums);
        List<Integer> expected = List.of(1, 5, 5, 9, 9, 9, 9);
        Assertions.assertThat(actual)
                .usingRecursiveComparison()
                .isEqualTo(expected);
    }

    @Test
    void streamMax_test02() {
        int[] nums = {10, 2, 5, 1, 0, 11, 6};
        List<Integer> actual = StreamMax.streamMax(nums);
        List<Integer> expected = List.of(10, 10, 10, 10, 10, 11, 11);
        Assertions.assertThat(actual)
                .usingRecursiveComparison()
                .isEqualTo(expected);
    }

    @Test
    void streamMax_test03() {
        int[] nums = {3, 3, 3, 3, 3};
        List<Integer> actual = StreamMax.streamMax(nums);
        List<Integer> expected = List.of(3, 3, 3, 3, 3);
        Assertions.assertThat(actual)
                .usingRecursiveComparison()
                .isEqualTo(expected);
    }
}