package com.cairone.rooftop;

import java.util.stream.Collectors;

/**
 * not finished!!
 */
public class Something {


    public static void main(String[] args) {
        String rv = StringChallenge("oneplustwo");
        System.out.println(rv);
    }

    public static String StringChallenge(String str) {
        boolean isNegative = str.contains("minus");
        str = str.replaceAll("minus", "-").replaceAll("plus", "+");

        String[] parts = str.split("([+-])");

        int rv = 0;
        for (int i = 0; i < parts.length; i++) {
            //rv += wordToNumber(parts[i]);
            rv += parseWord(parts[i]);
            if (i < parts.length - 1 && !parts[i + 1].matches("[+-]")) {
                rv *= 10;
            }
        }

        String answer = (isNegative ? "negative " : "") + numberToText(Math.abs(rv));
        return answer;
    }

    private static int parseWord(String text) {
        int rv = 0;
        String analyzing = text;
        int position = 1;
        while (analyzing.length() != 0) {

            if (analyzing.contains("one")) {
                analyzing = analyzing.substring(3);
                rv += 1 * position;
                position = position * 10;
            } else if (analyzing.contains("two")) {
                analyzing = analyzing.substring(2);
                rv += 2 * position;
                position = position * 10;
            }
        }
        return rv;
    }

    private static String numberToText(int num) {
        switch(num) {
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
            case 0:
                return "zero";
            default:
                System.out.print(num);
                throw new IllegalArgumentException();
        }
    }

    private static int wordToNumber(String text) {
        switch(text) {
            case "zero":
                return 0;
            case "one":
                return 1;
            case "two":
                return 2;
            case "three":
                return 3;
            case "four":
                return 4;
            case "five":
                return 5;
            case "six":
                return 6;
            case "seven":
                return 7;
            case "eight":
                return 8;
            case "nine":
                return 9;
            default:
                throw new IllegalArgumentException();
        }
    }


}
