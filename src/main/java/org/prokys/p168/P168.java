package org.prokys.p168;

public class P168 {

    public static int num = 17576;
    public static int bit = 0;
    public static int res = 0;
    public static StringBuilder stringBuilder;

    public static void main(String[] args) {

        System.out.println(convertToTitle(num));

    }

    public static String convertToTitle(int columnNumber) {

        stringBuilder = new StringBuilder();
        divide(columnNumber);

        return stringBuilder.reverse().toString();
    }

    public static void divide(int val) {

        num = val-1;
        res =  (num/26);
        bit = num%26;
        stringBuilder.append((char)(64+bit+1));
        if (res >= 26){
            divide(res);
        } else if (res > 0) {
            stringBuilder.append((char)(64+res));
        }
    }
}
