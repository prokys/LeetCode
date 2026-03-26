package org.prokys.p405;

import java.util.HashMap;

public class P405 {

    private static HashMap<Long, String> hexNums = new HashMap<>();

    public static String toHex(int num) {

        hexNums.put(10L, "a");
        hexNums.put(11L, "b");
        hexNums.put(12L, "c");
        hexNums.put(13L, "d");
        hexNums.put(14L, "e");
        hexNums.put(15L, "f");


        StringBuilder result = new StringBuilder();
        long temp;

        if (num > 0) {
            temp = num;
        } else if (num < 0) {
            temp = 4294967296L + num;
        }else return "0";

        while (temp != 0) {
            long remainder = temp % 16;
            temp /= 16;
            if (remainder > 9) {
                result.insert(0, hexNums.get(remainder));
            }else {
                result.insert(0, remainder);
            }

        }
        return result.toString();
    }
}
