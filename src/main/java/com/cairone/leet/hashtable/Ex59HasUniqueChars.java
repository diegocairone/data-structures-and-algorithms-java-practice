package com.cairone.leet.hashtable;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Ex59HasUniqueChars {

    public static boolean hasUniqueChars(String value) {
        Set<Character> chars = new HashSet<>();
        char[] charArray = value.toCharArray();
        for (int i = 0; i < value.length(); i++) {
            chars.add(charArray[i]);
        }
        int sum = chars.size();
        return sum == value.length();
    }

    public static boolean hasUniqueChars2(String value) {
        Map<Character, Integer> count = new HashMap<>();
        char[] chars = value.toCharArray();
        for (int i = 0; i < value.length(); i++) {
            char charAt = chars[i];
            if (count.containsKey(charAt)) {
                count.put(charAt, count.get(charAt) + 1);
            } else {
                count.put(charAt, 1);
            }
        }
        int sum = count.keySet().size();
        return sum == value.length();
    }
}
