package com.cairone.coderbyte;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/*
Find Intersection
Have the function FindIntersection(strArr) read the array of strings stored in strArr which will contain 2 elements:
the first element will represent a list of comma-separated numbers sorted in ascending order,
the second element will represent a second list of comma-separated numbers (also sorted).
Your goal is to return a comma-separated string containing the numbers that occur in elements of strArr
in sorted order. If there is no intersection, return the string false.

 */
public class FindIntersection {

    public static String FindIntersectionFirstAlt(String[] strArr) {

        String firstSetCsv = strArr[0];
        String secondSetCsv = strArr[1];

        int[] firstSet = Arrays.stream(firstSetCsv.split(","))
                .mapToInt(e -> Integer.parseInt(e.trim()))
                .toArray();
        int[] secondSet = Arrays.stream(secondSetCsv.split(","))
                .mapToInt(e -> Integer.parseInt(e.trim()))
                .toArray();

        int[] result = new int[firstSet.length];
        int index = 0;

        for (int i = 0; i < firstSet.length; i++) {
            int source = firstSet[i];
            for (int j = 0; j < secondSet.length; j++) {
                int target = secondSet[j];
                if (source == target) {
                    result[index] = target;
                    index++;
                }
            }
        }

        String resultCsv = Arrays.stream(result)
                .limit(index)
                .mapToObj(e -> Integer.toString(e))
                .reduce((a, b) -> a + "," + b)
                .orElse("false");

        return resultCsv;
    }

    public static String FindIntersectionSecondAlt(String[] strArr) {

        String firstSetCsv = strArr[0];
        String secondSetCsv = strArr[1];

        List<Integer> firstSet = Arrays.stream(firstSetCsv.split(","))
                .map(e -> Integer.parseInt(e.trim()))
                .toList();

        List<Integer> intersection = Arrays.stream(secondSetCsv.split(","))
                .map(e -> Integer.parseInt(e.trim()))
                .filter(e -> firstSet.contains(e))
                .toList();

        String resultCsv = intersection.stream()
                .map(e -> Integer.toString(e))
                .reduce((a, b) -> a + "," + b)
                .orElse("false");

        return resultCsv;
    }

    public static String FindIntersectionOptimized(String[] strArr) {
        String firstSetCsv = strArr[0];
        String secondSetCsv = strArr[1];

        // Step 1: Store the first set in a HashSet
        Set<Integer> firstSet = Arrays.stream(firstSetCsv.split(","))
                .map(e -> Integer.parseInt(e.trim()))
                .collect(Collectors.toSet());

        // Step 2: Find intersection with the second set
        Set<Integer> intersection = Arrays.stream(secondSetCsv.split(","))
                .map(e -> Integer.parseInt(e.trim()))
                .filter(firstSet::contains)
                .collect(Collectors.toSet());

        // Step 3: Convert the intersection to a CSV string
        String resultCsv = intersection.stream()
                .sorted() // Ensure sorted order
                .map(String::valueOf)
                .collect(Collectors.joining(","));

        return resultCsv.isEmpty() ? "false" : resultCsv;
    }

    public static void main(String[] args) {
        String[] strArr = new String[] { "1, 3, 4, 7, 13", "1, 2, 4, 13, 15" };
        System.out.println(FindIntersectionSecondAlt(strArr));
    }
}
