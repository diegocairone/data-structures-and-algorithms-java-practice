package com.cairone.coderbyte;

import java.util.HashMap;
import java.util.Map;

public class TwoSumProblem {

    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> numToIndex = new HashMap<>();

        // 3, 5, 2, -4, 8, 11
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numToIndex.containsKey(complement)) {
                return new int[] { numToIndex.get(complement), i };
            }
            numToIndex.put(nums[i], i);
        }

        return new int[] {0,0};
    }

    public static void main(String[] args) {
        int[] nums = {3, 5, 2, -4, 8, 11};
        int target = 7;
        int[] result = twoSum(nums, target);
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }
}
