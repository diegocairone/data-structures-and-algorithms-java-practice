package com.cairone.hackerrank;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmailSubjectSpamDetector {

    public List<String> detectSpam(List<String> subjects, List<String> keywords) {
        return subjects.stream()
                .map(subject -> detectSpam(subject, keywords))
                .toList();
    }

    private String detectSpam(String subject, List<String> keywords) {

        String[] words = subject.split(" ");    // O(n) where n is subject length

        Map<String, Integer> spamWordCount = new HashMap<>();

        // words.length <<<<<< keywords.size()
        // O(m) where m is the number of words in the subject

        for (String word : words) {
            if (spamWordCount.containsKey(word)) {                          // O(1)
                spamWordCount.put(word, spamWordCount.get(word) + 1);
            } else {
                if (keywords.contains(word)) {                              // O(k) where k is the number of keywords
                    spamWordCount.put(
                            word, spamWordCount.getOrDefault(word, 0) + 1); // O(1)
                }
            }
        }
        int count = spamWordCount.values().stream()
                .reduce(0, Integer::sum);

        // O( n + m * k ) where n is the subject length and m is the number of words in the subject
        // and k is the number of keywords
        return count > 1 ? "SPAM" : "NOT-SPAM";
    }
}
