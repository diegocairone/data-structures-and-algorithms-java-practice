package com.cairone.renaiss;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {
        Anagram anagram = new Anagram();
        anagram.run();
    }

    public void run() {

        System.out.println("Type file name: ");

        Scanner console = new Scanner(System.in);
        String fileName = console.nextLine();

        List<String> lines = readFile(fileName);

        lines.forEach(line -> {
            System.out.println(parseLine(line));
        });

        console.close();
    }

    private String parseLine(String line) {
        String[] elems = line.split(":");
        String left = elems[0].toLowerCase().trim(); // angel
        String right = elems[1].toLowerCase().trim(); // glean
        boolean anagram = left.length() == right.length();

        if (!anagram) {
            return String.format("%s,%s,%s", left, right, "NotAnagram");
        }

        for (int i = 0; i < left.length(); i++) {
            String letter = left.substring(i, i + 1);
            if (!right.contains(letter)) {
                anagram = false;
                break;
            }
        }

        return String.format("%s,%s,%s", left, right, anagram ? "Anagram" : "NotAnagram");
    }

    private List<String> readFile (String fileName) {
        BufferedReader reader;
        List<String> lines = new ArrayList<>();

        try {
            reader = new BufferedReader(new FileReader(fileName));
            String line = reader.readLine();

            while (line != null) {
                lines.add(line.toLowerCase());
                line = reader.readLine();
            }

            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            return Collections.emptyList();
        } catch (IOException e) {
            new RuntimeException(e.getMessage());
        }
        return lines;
    }
}
