package org.prokys.p191;

public class P191 {

    public static int hammingWeight(int n) {

        int res = n;
        int result = 0;

        do {
            result = result + (res%2);
            res = res/2;
        }while (res > 0);
            return result;
    }
}
