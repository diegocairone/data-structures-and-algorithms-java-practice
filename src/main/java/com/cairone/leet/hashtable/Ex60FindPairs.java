package com.cairone.leet.hashtable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Ex60FindPairs {

    public static List<int[]> findPairs(int[] arr1, int[] arr2, int target) {
        Set<Integer> mySet = new HashSet<>();
        List<int[]> pairs = new ArrayList<>();
        for (int e1 : arr1) {
            mySet.add(e1);
        }
        for (int num : arr2) {
            int complement = target - num;
            if (mySet.contains(complement)) {
                pairs.add(new int[]{complement, num});
            }
        }
        return pairs;
    }

    public static List<int[]> findPairs2(int[] arr1, int[] arr2, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int e1 : arr1) {
            int dif = target - e1;
            for (int e2 : arr2) {
                if (dif == e2) {
                    map.put(e1, e2);
                }
            }
        }
        return map.entrySet().stream()
                .map(entry -> new int[]{entry.getKey(), entry.getValue()})
                .collect(Collectors.toList());
    }
}
