package com.cairone.hackerrank;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CountingValleys {

    public static void main(String[] args) {
        CountingValleys countingValleys = new CountingValleys();
        int count = countingValleys.countingValleys(14, "UDDDUDUUUDDDUU");
        log.info("Counts: {}", count);
    }

    public int countingValleys(int steps, String path) {

        int sum = 0;
        int valleys = 0; // how many times valleys var becomes negative
        boolean alreadyInValley = false;

        // UDDDUDUU -> +1 -1 -1 -1 +1 -1 +1 +1

        for (int i = 0; i < steps; i++) {
            char d = path.charAt(i);
            sum += d == 'U' ? 1 : -1;
            if (sum < 0) {
                if (!alreadyInValley) {
                    valleys++;
                }
                alreadyInValley = true;
            } else {
                alreadyInValley = false;
            }
        }

        return valleys;
    }
}
