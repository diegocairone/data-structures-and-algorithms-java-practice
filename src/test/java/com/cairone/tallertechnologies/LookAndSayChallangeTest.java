package com.cairone.tallertechnologies;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class LookAndSayChallangeTest {

    private LookAndSayChallange lookAndSayChallange = new LookAndSayChallange();

    @ParameterizedTest
    @CsvSource({
            "11, 21",
            "21, 1211",
            "1211, 111221",
            "111221, 312211"
    })
    void previousElement() {
        String result = lookAndSayChallange.previousElement("11");
        Assertions.assertThat(result).isEqualTo("21");
    }

    @ParameterizedTest
    @CsvSource({
            "2, 11",
            "3, 21",
            "4, 1211",
            "5, 111221",
            "6, 31221"
    })
    void lookAndSay() {
        String result = lookAndSayChallange.lookAndSay(2);
        Assertions.assertThat(result).isEqualTo("11");
    }
}