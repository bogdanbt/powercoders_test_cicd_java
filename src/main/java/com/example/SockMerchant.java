package com.example;

import java.util.HashMap;
import java.util.Map;

public class SockMerchant {
    public static int sockMerchant(int[] socks) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int sock : socks) {
            countMap.put(sock, countMap.getOrDefault(sock, 0) + 1);
        }

        int pairs = 0;
        for (int count : countMap.values()) {
            pairs += count / 2;
        }
        return pairs;
    }
}
