package org.prokys.p231;

import static java.lang.Math.pow;

public class P231 {

        public static boolean isPowerOfTwo(int n) {

            if (n  <= 0){
                return false;
            }

            for (int i = 0; i <= n/2; i++) {
                long pow = (long)pow(2,i);
                System.out.println(pow);

                if (pow > n){
                    return false;
                } else if (pow == n) {
                    return true;
                }
            }

            return false;
        }

}
