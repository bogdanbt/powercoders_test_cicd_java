package com.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountingValleysTest {

    @ParameterizedTest
    @CsvSource({
            "8, UDDDUDUU, 1",
            "6, UUUDDU, 0",
            "10, DDUUDDUDUU, 2",
            "4, UDUD, 0",
            "2, DU, 1",
            "2, UD, 0",
            "0, '', 0"
    })
    void testCountingValleys(int n, String path, int expected) {
        assertEquals(expected, CountingValleys.countingValleys(n, path));
    }
}
