package com.cairone.hackerrank;

import java.util.List;

public class HourglassSum {

    public static void main(String[] args) {
        List<Integer> row1 = List.of(-9, -9, -9,  1, 1, 1);
        List<Integer> row2 = List.of( 0, -9,  0,  4, 3, 2);
        List<Integer> row3 = List.of(-9, -9, -9,  1, 2, 3);
        List<Integer> row4 = List.of( 0,  0,  8,  6, 6, 0);
        List<Integer> row5 = List.of( 0,  0,  0, -2, 0, 0);
        List<Integer> row6 = List.of( 0,  0,  1,  2, 4, 0);
        List<List<Integer>> arr = List.of(row1, row2, row3, row4, row5, row6);
        int rv = hourglassSum(arr);
        System.out.println(rv);
    }

    public static int hourglassSum(List<List<Integer>> arr) {
        int[][] array = arr.stream()
                .map(e -> e.stream().mapToInt(Integer::intValue).toArray())
                .toArray(int[][]::new);
        int rows = arr.size();
        int cols = arr.get(0).size();
        int result = Integer.MIN_VALUE;

        for (int i = 1; i < cols - 1; i++) {
            for (int j = 1; j < cols - 1; j++) {
                int value = array[i][j];
                value += array[i - 1][j - 1] + array[i - 1][j] + array[i - 1][j + 1];
                value += array[i + 1][j - 1] + array[i + 1][j] + array[i + 1][j + 1];
                if (value > result) result = value;
            }
        }

        return result;
    }

    public static int[][] converToArray(List<List<Integer>> arr) {
        return arr.stream()
                .map(e -> e.stream().mapToInt(Integer::intValue).toArray())
                .toArray(int[][]::new);
    }

    public static int[][] converToArrayAlternative(List<List<Integer>> arr) {
        int rows = arr.size();
        int cols = arr.get(0).size();
        int[][] rv = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            List<Integer> row = arr.get(i);
            for (int j = 0; j < cols; j++) {
                int elem = row.get(j);
                rv[i][j] = elem;
            }
        }

        return rv;
    }
}
