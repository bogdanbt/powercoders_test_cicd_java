package com.example;

public class RepeatedString {
    public static long repeatedString(String s, long n) {
        if (s.isEmpty()) return 0;

        long fullRepeats = n / s.length();
        long remainder = n % s.length();

        long countInFull = s.chars().filter(ch -> ch == 'a').count();
        long countInRest = s.substring(0, (int) remainder).chars().filter(ch -> ch == 'a').count();

        return fullRepeats * countInFull + countInRest;
    }
}
