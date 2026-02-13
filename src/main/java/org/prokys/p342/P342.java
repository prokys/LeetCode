package org.prokys.p342;

public class P342 {

    public static boolean isPowerOfFour(int n) {

        if (n <= 0) return false;

        if (n % 4 == 0){
            return isPowerOfFour(n/4);
        }else return n == 1;
    }
}
