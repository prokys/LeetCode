package org.prokys.p263;

public class P263 {

    public static boolean isUgly(int n) {

        if (n == 1) return true;
        else if (n < 1) return false;

        return divideBy235(n);

    }

    private static boolean divideBy235(int n) {

        if (n%2 == 0){
            if (n/2 > 1){
                return divideBy235(n/2);
            } else return true;
        } else if (n%3 == 0) {
            if (n/3 > 1){
                return divideBy235(n/3);
            } else return true;
        } else if (n%5 == 0) {
            if (n/5 > 1){
                return divideBy235(n/5);
            } else return true;
        }
        return false;
    }

}
