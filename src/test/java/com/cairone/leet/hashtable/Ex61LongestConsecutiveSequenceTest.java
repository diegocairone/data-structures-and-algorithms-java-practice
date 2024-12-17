package com.cairone.leet.hashtable;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex61LongestConsecutiveSequenceTest {

    @Test
    @DisplayName("Consecutive Integers")
    void longestConsecutive_ConsecutiveIntegers() {

        int arraySize = Ex61LongestConsecutiveSequence.longestConsecutive(new int[] {1, 2, 3, 4, 5});
        Assertions.assertThat(arraySize).isEqualTo(5);
    }

    @Test
    @DisplayName("No Sequence")
    void longestConsecutive_NoSequence() {

        int arraySize = Ex61LongestConsecutiveSequence.longestConsecutive(new int[] {1, 3, 5, 7, 9});
        Assertions.assertThat(arraySize).isEqualTo(1);
    }

    @Test
    @DisplayName("Duplicates")
    void longestConsecutive_Duplicates() {

        int arraySize = Ex61LongestConsecutiveSequence.longestConsecutive(new int[] {1, 2, 2, 3, 4});
        Assertions.assertThat(arraySize).isEqualTo(4);
    }

    @Test
    @DisplayName("Negative Numbers")
    void longestConsecutive_NegativeNumbers() {

        int arraySize = Ex61LongestConsecutiveSequence.longestConsecutive(new int[] {1, 0, -1, -2, -3});
        Assertions.assertThat(arraySize).isEqualTo(5);
    }

    @Test
    @DisplayName("Empty Array")
    void longestConsecutive_EmptyArray() {

        int arraySize = Ex61LongestConsecutiveSequence.longestConsecutive(new int[] {});
        Assertions.assertThat(arraySize).isEqualTo(0);
    }

    @Test
    @DisplayName("Multiple Sequences")
    void longestConsecutive_MultipleSequences() {

        int arraySize = Ex61LongestConsecutiveSequence.longestConsecutive(new int[] {1, 2, 3, 10, 11, 12, 13});
        Assertions.assertThat(arraySize).isEqualTo(4);
    }

    @Test
    @DisplayName("Unordered Elements")
    void longestConsecutive_UnorderedElements() {

        int arraySize = Ex61LongestConsecutiveSequence.longestConsecutive(new int[] {5, 1, 3, 4, 2});
        Assertions.assertThat(arraySize).isEqualTo(5);
    }

    @Test
    @DisplayName("Single Element")
    void longestConsecutive_SingleElement() {

        int arraySize = Ex61LongestConsecutiveSequence.longestConsecutive(new int[] {1});
        Assertions.assertThat(arraySize).isEqualTo(1);
    }

    @Test
    @DisplayName("All Identical Elements")
    void longestConsecutive_AllIdenticalElements() {

        int arraySize = Ex61LongestConsecutiveSequence.longestConsecutive(new int[] {2, 2, 2, 2, 2});
        Assertions.assertThat(arraySize).isEqualTo(1);
    }
}