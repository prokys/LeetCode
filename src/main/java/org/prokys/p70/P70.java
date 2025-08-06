package org.prokys.p70;

import java.util.HashMap;
import java.util.Map;

public class P70 {

    public static void main(String[] args) {
        System.out.println(climbStairs(1));
        System.out.println(climbStairs(2));
        System.out.println(climbStairs(3));
        System.out.println(climbStairs(4));
        System.out.println(climbStairs(5));
        System.out.println(climbStairs(6));
        System.out.println(climbStairs(45));
    }


    public static int climbStairs(int n) {
        int one = 1;
        int two = 2;
        int result = 0;

        if (n==1) {
            return one;
        }
        else if (n==2) {
            return two;
        }else {
            for (int i = 2; i < n; i++) {
                result = one+two;
                one = two;
                two = result;
            }
            return result;
        }
    }
}
