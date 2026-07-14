package org.prokys.p451_500.p455;

import java.util.Arrays;

public class P455 {

    public static int findContentChildren(int[] g, int[] s) {

        int res = 0;

        Arrays.sort(g);
        Arrays.sort(s);
        for (int i = 0; i < g.length; i++) {
            for (int j = 0; j < s.length; j++) {
                if (g[i] <= s[j]) {
                    res++;
                    s[j] = 0;
                    break;
                }
            }
        }

        return res;
    }
}
