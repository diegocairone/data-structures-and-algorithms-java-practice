package com.cairone.leet.hashtable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Ex55GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new LinkedHashMap<>();

        for (int i = 0; i < strs.length; i++) {
            String word = strs[i];

            boolean isAnagramOfAny = false;
            for (String key : map.keySet()) {
                isAnagramOfAny = areAnagrams(key, word);
                if (isAnagramOfAny) {
                    map.get(key).add(word);
                    break;
                }
            }

            if (!isAnagramOfAny) {
                List<String> list = new ArrayList<>();
                list.add(word);
                map.put(word, list);
            }
        }

        List<List<String>> rv = new ArrayList<>();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            rv.add(entry.getValue());
        }

        return rv;
    }

    public static boolean areAnagrams(String word1, String word2) {
        Map<Character, Integer> map = new HashMap<>();
        char[] chars1 = word1.toCharArray();
        for (char c : chars1) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        char[] chars2 = word2.toCharArray();
        for (char c : chars2) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println("1st set:");
        System.out.println(groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));

        System.out.println("\n2nd set:");
        System.out.println(groupAnagrams(new String[]{"abc", "cba", "bac", "foo", "bar"}));

        System.out.println("\n3rd set:");
        System.out.println(groupAnagrams(new String[]{"listen", "silent", "triangle", "integral", "garden", "ranged"}));

        /*
            EXPECTED OUTPUT:
            ----------------
            1st set:
            [[eat, tea, ate], [tan, nat], [bat]]

            2nd set:
            [[abc, cba, bac], [foo], [bar]]

            3rd set:
            [[listen, silent], [triangle, integral], [garden, ranged]]

        */

    }
}
