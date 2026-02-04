package org.prokys.p258;

public class P258 {

    public static int addDigits(int num) {

        int sum = num;

        do {
            String s = Integer.toString(sum);
            sum = 0;
            for (int i = 0; i < s.length(); i++) {
                sum = sum + Character.getNumericValue(s.charAt(i));
            }
        } while (sum >= 10);


        return sum;
    }
}
