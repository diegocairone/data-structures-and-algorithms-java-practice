package com.cairone.leet.hashtable;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex59HasUniqueCharsTest {

    @Test
    void test01() {
        boolean actual = Ex59HasUniqueChars.hasUniqueChars("abcdefg");
        Assertions.assertThat(actual).isTrue();
    }

    @Test
    void test02() {
        boolean actual = Ex59HasUniqueChars.hasUniqueChars("hello");
        Assertions.assertThat(actual).isFalse();
    }

    @Test
    void test03() {
        boolean actual = Ex59HasUniqueChars.hasUniqueChars("");
        Assertions.assertThat(actual).isTrue();
    }

    @Test
    void test04() {
        boolean actual = Ex59HasUniqueChars.hasUniqueChars("0123456789");
        Assertions.assertThat(actual).isTrue();
    }

    @Test
    void test05() {
        boolean actual = Ex59HasUniqueChars.hasUniqueChars("abacadaeaf");
        Assertions.assertThat(actual).isFalse();
    }
}