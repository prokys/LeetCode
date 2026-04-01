package org.prokys.p415;

public class P415 {

    public static String addStrings(String num1, String num2) {

        String first;
        String second;

        if (num1.length() > num2.length()) {
            StringBuilder zeros = new StringBuilder();
            for (int i = 0; i < num1.length()-num2.length(); i++) {
                zeros.append("0");
            }
            first = num1;
            second = zeros.toString().concat(num2);
        } else if (num1.length() < num2.length()) {
            StringBuilder zeros = new StringBuilder();
            for (int i = 0; i < num2.length()-num1.length(); i++) {
                zeros.append("0");
            }
            first = zeros.toString().concat(num1);
            second = num2;
        } else {
            first = num1;
            second = num2;
        }

        StringBuilder result = new StringBuilder();
        int extra = 0;

        for (int i = first.length()-1; i >= 0 ; i--) {
            int sum = Character.getNumericValue(first.charAt(i))+Character.getNumericValue(second.charAt(i)) + extra;
            if (sum < 10) {
                result.insert(0, sum);
                extra = 0;
            }else {
                result.insert(0, Integer.toString(sum).charAt(1));
                extra = 1;
            }

        }

        if (extra == 1) result.insert(0, extra);

        return result.toString();
    }
}
