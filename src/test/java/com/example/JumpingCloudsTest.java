package com.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.stream.Stream;

public class JumpingCloudsTest {

    static Stream<org.junit.jupiter.params.provider.Arguments> provideClouds() {
        return Stream.of(
                org.junit.jupiter.params.provider.Arguments.of(new int[]{0, 0, 1, 0, 0, 1, 0}, 4),
                org.junit.jupiter.params.provider.Arguments.of(new int[]{0, 0, 0, 0, 1, 0}, 3),
                org.junit.jupiter.params.provider.Arguments.of(new int[]{0, 1, 0}, 1),
                org.junit.jupiter.params.provider.Arguments.of(new int[]{0, 0}, 1),
                org.junit.jupiter.params.provider.Arguments.of(new int[]{0}, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("provideClouds")
    void testJumpingOnClouds(int[] clouds, int expected) {
        assertEquals(expected, JumpingClouds.jumpingOnClouds(clouds));
    }
}
