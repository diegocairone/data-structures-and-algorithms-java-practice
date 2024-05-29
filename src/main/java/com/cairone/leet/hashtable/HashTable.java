package com.cairone.leet.hashtable;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class HashTable {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 2, 1, 4, 5, 4};
        List<Integer> duplicateds = findDuplicates(nums);
        System.out.println(duplicateds);
    }

    public static List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return map.entrySet().stream()
                .filter(p -> p.getValue().compareTo(1) > 0)
                .map(p -> p.getKey())
                .collect(Collectors.toList());
    }
}
