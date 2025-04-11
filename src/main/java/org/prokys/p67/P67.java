package org.prokys.p67;


import java.math.BigInteger;

public class P67 {

    public static String first = "110001";
    public static String second = "1";

    public static void main(String[] args) {

        System.out.println(addBinary(first,second));
    }

    public static String addBinary(String a, String b) {

        BigInteger aa = new BigInteger(a, 2);
        BigInteger bb = new BigInteger(b, 2);
        BigInteger sum = aa.add(bb);

        return sum.toString(2);
    }

}
