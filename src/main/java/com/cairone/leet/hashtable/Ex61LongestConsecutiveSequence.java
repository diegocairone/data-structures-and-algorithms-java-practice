package com.cairone.leet.hashtable;

import java.util.HashSet;
import java.util.Set;

public class Ex61LongestConsecutiveSequence {

    public static int longestConsecutive(int[] nums) {
        // remove duplicated elements
        // O(n)
        Set<Integer> numSet = new HashSet<>();
        int e = 0;
        for (int num : nums) {
            numSet.add(num);
            e = Math.min(e, num);
        }

        if (numSet.isEmpty()) {
            return 0;
        }

        int size = 1;

        for (int num : numSet) {

            int previousConsecutive  = num - 1;
            if (numSet.contains(previousConsecutive)) {
                size += 1;
            } else if (previousConsecutive < e) {
                // do nothing
            } else {
                size = 1;
            }
        }

        return size;
    }

    public static int longestConsecutive_geminiProposal(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int longestStreak = 0;

        for (int num : numSet) {
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }
}
