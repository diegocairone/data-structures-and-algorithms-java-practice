package com.cairone.tallertechnologies;

import java.util.HashMap;
import java.util.Map;

public class LookAndSayChallange {

    public String lookAndSay(int n) {
        if (n <= 0) return "";
        if (n == 1) return "1";

        String current = "1";

        // O(n) = O(n * (m + k)) where m is the length of the string and k is the number of unique digits in the string
        for (int i = 2; i <= n; i++) {
            current = previousElement(current);
        }

        return current;
    }

    public String previousElement(String element) {

        char[] chars = element.toCharArray();
        Map<Integer, Integer> map = new HashMap<>();

        // O(m) where m is the length of the string
        for (int i = 0; i < chars.length; i++) {
            int num = chars[i] - '0';
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        StringBuilder sb = new StringBuilder();

        // O(k) where k is the number of unique digits in the string
        map.forEach((num, count) -> {
            sb.append(count);
            sb.append(num);
        });

        return sb.toString();
    }
}
