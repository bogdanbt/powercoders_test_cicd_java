package com.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.stream.Stream;

public class SockMerchantTest {

    static Stream<org.junit.jupiter.params.provider.Arguments> provideSocks() {
        return Stream.of(
                org.junit.jupiter.params.provider.Arguments.of(new int[]{1, 2, 1, 2, 1, 3, 2}, 2),
                org.junit.jupiter.params.provider.Arguments.of(new int[]{10, 20, 20, 10, 10, 30, 50, 10, 20}, 3),
                org.junit.jupiter.params.provider.Arguments.of(new int[]{1, 1, 1, 1}, 2),
                org.junit.jupiter.params.provider.Arguments.of(new int[]{1, 2, 3, 4}, 0),
                org.junit.jupiter.params.provider.Arguments.of(new int[]{100, 100, 100, 100}, 2),
                org.junit.jupiter.params.provider.Arguments.of(new int[]{}, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("provideSocks")
    void testSockMerchant(int[] socks, int expected) {
        assertEquals(expected, SockMerchant.sockMerchant(socks));
    }
}
