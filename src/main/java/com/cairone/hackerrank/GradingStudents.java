package com.cairone.hackerrank;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class GradingStudents {

    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        return grades.stream()
                .map(grade -> {
                    int remainder = grade % 5;
                    int intPart = grade - remainder + 5;
                    int diff = intPart - grade;
                    if (diff < 3) {
                        return intPart < 40 ? grade : intPart;
                    } else {
                        return grade;
                    }
                })
                .peek(rounded -> System.out.println(rounded))
                .collect(Collectors.toList());
    }

    public static Integer round(Integer grade) {
        int remainder = grade % 5;
        // 73 % 5 = 3
        // 67 % 5 = 2
        // 38 % 5 = 3
        // 33 % 5 = 3
        int intPart = grade - remainder + 5;
        // 73 - 3 + 5 = 75
        // 67 - 2 + 5 = 70
        // 38 - 3 + 5 = 40
        // 33 - 3 + 5 = 35
        int diff = intPart - grade;

        // 75 - 73 = 2 < 3 -> round to intPart (75)
        // 70 - 67 = 3 == 3 -> not rounded
        // 40 - 38 = 2 < 3 -> round to intPart (40)
        // 35 - 33 = 2 < 3 -> round to intPart (35) < 40 -> not modified
        if (diff < 3) {
            return intPart < 40 ? grade : intPart;
        } else {
            return grade;
        }
    }

    public static void main(String[] args) {
        gradingStudents(List.of(73, 67, 38, 33));
    }
}
