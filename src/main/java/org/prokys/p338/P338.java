package org.prokys.p338;

import java.util.Arrays;

public class P338 {

    private static int limit = 100000;
    private static int[] array = generateBits(limit);

    private static int[] generateBits(int limit) {
        int result[] = new int[limit+1];
        for (int i = 0; i <= limit; i++) {
            result[i] = Integer.bitCount(i);
        }
        return result;
    }

    public static int[] countBits(int n) {

        return Arrays.copyOf(array,n+1);
    }

    public static int[] countBits1(int n) {

        int[] bits = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            bits[i] = Integer.bitCount(i);
        }

        return bits;
    }
}
