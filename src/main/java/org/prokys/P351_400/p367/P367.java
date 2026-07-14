package org.prokys.P351_400.p367;

public class P367 {

    public static boolean isPerfectSquare(int num) {

        int root = (int)Math.sqrt(num);

        return root*root == num;
    }
}
