package com.cairone.leet.heap;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class KthSmallestElementTest {

    @Test
    void test01() {
        int[] nums1 = {7, 10, 4, 3, 20, 15};
        int k1 = 3;
        KthSmallestElement kthSmallestElement = new KthSmallestElement();
        int actual = kthSmallestElement.findKthSmallest(nums1, k1);
        int expected = 7;
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void test02() {
        int[] nums1 = {2, 1, 3, 5, 6, 4};
        int k1 = 2;
        KthSmallestElement kthSmallestElement = new KthSmallestElement();
        int actual = kthSmallestElement.findKthSmallest(nums1, k1);
        int expected = 2;
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void test03() {
        int[] nums1 = {9, 3, 2, 11, 7, 10, 4, 5};
        int k1 = 5;
        KthSmallestElement kthSmallestElement = new KthSmallestElement();
        int actual = kthSmallestElement.findKthSmallest(nums1, k1);
        int expected = 7;
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void test04() {
        int[] nums1 = {9};
        int k1 = 1;
        KthSmallestElement kthSmallestElement = new KthSmallestElement();
        int actual = kthSmallestElement.findKthSmallest(nums1, k1);
        int expected = 9;
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void test05() {
        int[] nums1 = {9, 9, 9, 9, 9, 9, 9, 9};
        int k1 = 5;
        KthSmallestElement kthSmallestElement = new KthSmallestElement();
        int actual = kthSmallestElement.findKthSmallest(nums1, k1);
        int expected = 9;
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}