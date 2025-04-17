package com.cairone.leet.heap;

import java.util.ArrayList;
import java.util.List;

/**
 * Heap: Maximum Element in a Stream
 * Implement a function named streamMax that processes a stream of integers and returns the maximum number encountered so far for each input number.
 * This function should take in an array of integers and return a list of integers.
 * Given an array of integers, your function should iterate over the array and for each number, it should find the maximum number in the array up until that point, including the current number.
 */
public class StreamMax {

    public static List<Integer> streamMax(int[] nums) {
        return alt1(nums);
    }

    private static List<Integer> alt1(int[] nums) {
        MinHeap heap = new MinHeap();
        int prev = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int actual = nums[i];
            if (actual > prev) {
                heap.insert(actual);
                prev = actual;
            } else {
                heap.insert(prev);
            }
        }
        return heap.getHeap();
    }

    private static List<Integer> alt2(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int prev = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int actual = nums[i];
            if (actual > prev) {
                result.add(actual);
                prev = actual;
            } else {
                result.add(prev);
            }
        }
        return result;
    }

    private static List<Integer> altSolutionFromCourse(int[] nums) {
        MaxHeap maxHeap = new MaxHeap();
        List<Integer> maxStream = new ArrayList<>();

        for (int num : nums) {
            maxHeap.insert(num);
            // The heap's root is always the maximum, so we add it to the result list
            maxStream.add(maxHeap.getHeap().get(0));
        }

        return maxStream;
    }
}
