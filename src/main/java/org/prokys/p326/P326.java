package org.prokys.p326;

public class P326 {

    public static boolean isPowerOfThree(int n) {

        if (n <= 0) return false;

        if (n % 3 == 0){
            return isPowerOfThree(n/3);
        }else return n == 1;
    }

}
