package com.cairone.hackerrank;

public class RepeatedString {

    public static long repeatedString(String s, long n) {
        int length = s.length();
        long intPart = n / length;
        long remainder = n % length;
        long occurrences = countOccurrences(s, 'a');
        long result = occurrences * intPart;
        String substring = s.substring(0, (int) remainder);
        long rest = countOccurrences(substring, 'a');
        result += rest;
        return result;
    }

    public static long countOccurrences(String string, char target) {
        long count = 0L;
        for (char c : string.toCharArray()) {
            if (c == target) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        long rv = repeatedString("a", 1000000000000L);
        System.out.println("Result: " + rv);
    }
}
