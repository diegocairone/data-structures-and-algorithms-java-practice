package com.cairone.coderbyte;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuestionMarksTest {

    @Test
    void questionsMarks_test1() {
        assertEquals("false", QuestionMarks.QuestionsMarks("9???1???9??1???9"));
    }
}