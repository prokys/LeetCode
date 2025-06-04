package org.prokys.p69;

public class P69 {

    public static int first = 4;
    public static int second = 2;
    public static int third = 7;
    public static int fourth = 132;
    public static int fifth = 65535;
    public static int sixth = 2147483647;


    public static void main(String[] args) {

        System.out.println(mySqrt(first));
        System.out.println(mySqrt(second));
        System.out.println(mySqrt(third));
        System.out.println(mySqrt(fourth));
        System.out.println(mySqrt(fifth));
        System.out.println(mySqrt(sixth));

    }

    public static int mySqrt(int x) {

        for (int i = 0; i < x; i++) {

            long ipower = (long)i*i;
            long ipluspower = (long)(i+1)*(i+1);

            if (ipower<x && x < ipluspower){
                return i;
            } else if (ipower == x) {
                return i;
            }else if (ipluspower == x){
                return i+1;
            }
        }
        return 0;

    }
}
