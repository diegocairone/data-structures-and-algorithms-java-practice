package com.cairone.leet.hashtable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Ex58RemoveDuplicates {

    public static List<Integer> removeDuplicates(List<Integer> myList) {
        Map<Integer, Integer> map = new HashMap<>();
        myList.forEach(num -> map.put(num, num));
        return new ArrayList<>(map.keySet());

    }

    public static List<Integer> removeDuplicates2(List<Integer> myList) {
        Set<Integer> uniqueNums = new HashSet<>(myList);
        return new ArrayList<>(uniqueNums);
    }
}
