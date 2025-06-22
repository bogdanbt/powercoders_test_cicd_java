package com.example;

public class CountingValleys {
    public static int countingValleys(int n, String path) {
        int level = 0;
        int valleys = 0;
        for (int i = 0; i < n; i++) {
            char step = path.charAt(i);
            if (step == 'U') {
                level++;
                if (level == 0) {
                    valleys++;
                }
            } else if (step == 'D') {
                level--;
            }
        }
        return valleys;
    }
}
