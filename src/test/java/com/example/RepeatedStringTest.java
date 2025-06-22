package com.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RepeatedStringTest {

    @ParameterizedTest
    @CsvSource({
            "'a', 10, 10",
            "'aba', 10, 7",
            "'abcac', 10, 4",
            "'bcd', 10, 0",
            "'', 100, 0",
            "'a', 0, 0",
            "'ababa', 1, 1",
            "'ababa', 2, 1"
    })
    void testRepeatedString(String s, long n, long expected) {
        assertEquals(expected, RepeatedString.repeatedString(s, n));
    }
}
