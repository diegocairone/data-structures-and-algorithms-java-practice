package com.cairone.tallertechnologies;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class LookAndSayChallangeTest {

    @ParameterizedTest
    @CsvSource({
            "1, 1",
            "2, 11",
            "3, 21",
            "4, 1211",
            "5, 111221"
    })
    void lookAndSay(int input, String expected) {
        String result = lookAndSayChallange.lookAndSay(input);
        Assertions.assertThat(result).isEqualTo(expected);
    }


    private LookAndSayChallange lookAndSayChallange = new LookAndSayChallange();

    @ParameterizedTest
    @CsvSource({
            "1, 11",
            "11, 21",
            "21, 1211",
            "1211, 111221",
            "111221, 312211",
            "312211, 13112221",
            "13112221, 1113213211",
            "1113213211, 31131211131221"
    })void nextElement(String current, String next) {
        String result = lookAndSayChallange.nextElement(current);
        Assertions.assertThat(result).isEqualTo(next);
    }
}