package org.prokys.p190;

public class P190 {

    public static int reverseBits(int n) {

        int res = n;
        int pow = 31;
        int result = 0;

        do {
            result = result + (int)Math.pow(2*(res%2), pow);
            res = res/2;
            pow--;
        }while (res > 0);
            return result;
    }
}
