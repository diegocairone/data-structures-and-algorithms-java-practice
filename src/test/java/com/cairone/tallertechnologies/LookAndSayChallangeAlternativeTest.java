package com.cairone.tallertechnologies;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class LookAndSayChallangeAlternativeTest {

    private LookAndSayChallangeAlternative lookAndSayChallange = new LookAndSayChallangeAlternative();

    @ParameterizedTest
    @CsvSource({
            "2, 11",
            "3, 21",
            "4, 1211",
            "5, 111221",
            "6, 312211"
    })
    void lookAndSay(int input, String expected) {
        String result = lookAndSayChallange.lookAndSay(input);
        Assertions.assertThat(result).isEqualTo(expected);
    }
}