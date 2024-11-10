package com.cairone.leet.hashtable;

import java.util.HashMap;
import java.util.Map;

public class Ex54FirstNonRepeatingCharacter {

    public static Character firstNonRepeatingChar (String value) {
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = value.toCharArray();

        for (char c : chars) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : chars) {
            if (map.get(c).equals(1)) {
                return c;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(firstNonRepeatingChar("leetcode"));
        System.out.println(firstNonRepeatingChar("hello"));
        System.out.println(firstNonRepeatingChar("aabbcc"));

        /*
            EXPECTED OUTPUT:
            ----------------
            l
            h
            null

        */
    }
}
