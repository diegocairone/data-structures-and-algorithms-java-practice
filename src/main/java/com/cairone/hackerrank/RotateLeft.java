package com.cairone.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class RotateLeft {

    public static void main(String[] args) {
        List<Integer> a = List.of(1, 2, 3, 4, 5);
        List<Integer> rv = rotLeft(a, 2);
        System.out.println(rv);
    }

    public static List<Integer> rotLeft(List<Integer> a, int d) {
        int len = a.size();
        List<Integer> rv = new ArrayList<>();
        List<Integer> extra = new ArrayList<>();

        for (int i = 0; i < len; i++) {
            if (i < d) {
                extra.add(a.get(i));
            }
            if (i < len - d) {
                rv.add(a.get(i + d));
            }
        }
        rv.addAll(extra);
        return rv;
    }
}
