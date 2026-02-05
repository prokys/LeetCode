package org.prokys.p278;

public class P278 {

    private static int top;
    private static int bot;

    public static int firstBadVersion(int n, int bad) {

        top = n;
        bot = 1;

        if (isBadVersion(1,bad)) return 1;

        return recurse(n,bad);
    }

    private static int recurse(int n, int bad){

        if (isBadVersion(n,bad)){
            top = n;
            if (top-bot == 1) return top;
            return recurse((top-bot)/2, bad);
        }else {
            bot = n;
            if (top-bot == 1) return top;
            return recurse(bot+(top-bot)/2, bad);
        }
    }

    private static int recurse1(int n, int bad){

        if (isBadVersion(n,bad)){
            top = n;
            if (!isBadVersion(n-1, bad)){
                return n;
            }
            return recurse((top-bot)/2, bad);
        }else {
            bot = n;
            if (isBadVersion(n+1, bad)){
                return n+1;
            }
            return recurse(bot+(top-bot)/2, bad);
        }
    }

    private static boolean isBadVersion(int n, int bad) {

        return n >= bad;

    }


}
