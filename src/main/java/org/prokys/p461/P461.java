package org.prokys.p461;

public class P461 {

    public static int hammingDistance(int x, int y) {

        int res = 0;

        if (x != y) {
            String first = Integer.toBinaryString(x);
            String second = Integer.toBinaryString(y);

            if (first.length() > second.length()) {
                second = "0".repeat(first.length() - second.length()).concat(second);
            } else if (first.length() < second.length()) {
                first = "0".repeat(second.length() - first.length()).concat(first);
            }

            for (int i = 0; i < first.length(); i++) {
                if (first.charAt(i) != second.charAt(i)) {
                    res++;
                }
            }

        }
        return res;

    }
}
