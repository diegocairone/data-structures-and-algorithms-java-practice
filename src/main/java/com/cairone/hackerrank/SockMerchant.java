package com.cairone.hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class SockMerchant {

    /*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */

    public static long sockMerchant(int n, List<Integer> ar) {

        Map<Integer, Long> counts = ar.stream()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));

        // 10 -> 1 + 1 + 1 + 1 = 4 = 2 pairs
        // 20 -> 1 + 1 + 1 = 30 = 0 pairs
        // 30 -> 1 = 1 = 0 pairs
        // 50 -> 1 = 1 = 0 pairs

        // 1 -> 2 pairs
        // 2 -> 0 pairs
        // 3 -> 4 pairs + 1

        long result = counts.values().stream()
                .map(value -> value % 2 == 0 ? value / 2 : (value - (value % 2)) / 2)
                .reduce(0L, Long::sum);

        return result;
    }

    public static void main(String[] args) {
        //long r = sockMerchant(9, List.of(10, 20, 20, 10, 10, 30, 50, 10, 20));
        long r = sockMerchant(10, List.of(1, 1, 3, 1, 2, 1, 3, 3, 3, 3));
        System.out.println(r);
    }
}
