package com.cairone.coderbyte;

/**
 * Have the function QuestionsMarks(str) take the str string parameter, which will contain single digit
 * numbers, letters, and question marks, and check if there are exactly 3 question marks between every pair
 * of two numbers that add up to 10. If so, then your program should return the string true,
 * otherwise it should return the string false.
 *
 * If there aren't any two numbers that add up to 10 in the string, then your program should return false as well.
 *
 * For example: if str is "arrb6???4xxbl5???eee5" then your program should return true because there are
 * exactly 3 question marks between 6 and 4, and 3 question marks between 5 and 5 at the end of the string.
 */
public class QuestionMarks {

    public static String QuestionsMarks(String str) {
        int num = -1; // To store the previous number
        int qmarks = 0; // To count question marks
        boolean foundPair = false; // To check if any valid pair exists

        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                int digit = ch - '0';
                if (num != -1 && num + digit == 10) {
                    if (qmarks == 3) {
                        foundPair = true;
                    } else {
                        return "false";
                    }
                }
                num = digit; // Update the previous number
                qmarks = 0; // Reset question mark count
            } else if (ch == '?') {
                qmarks++; // Increment question mark count
            }
        }

        return foundPair ? "true" : "false";
    }

    public static String QuestionsMarksNotWorking(String str) {

        String normalized = str.replaceAll("[^\\d?]", "");
        char[] chars = normalized.toCharArray();

        int num = -1;
        int qmarks = 0;

        for (int i = 0; i < chars.length; i++) {
            char charAt = chars[i];
            if (charAt == '?') {
                qmarks++;
            } else if (charAt != '?' && qmarks == 3) {
                int digit = charAt - '0';
                if (num + digit == 10) {
                    return "true";
                }
            } else {
                qmarks = 0;
                int digit = charAt - '0';
                num = digit;
            }
        }

        return "false";
    }
}
