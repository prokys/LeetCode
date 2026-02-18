package org.prokys.p374;

public class P374 {

    private int pick;
    private int min = 0;
    private int max = 2147483647;

    public int guessNumber(int n) {

        if (guess(max,pick) == 0) return max;

        return recurse(n);

    }

    private int recurse(int n){

        int guessRes = guess(n,pick);

        if (guessRes == -1){
            max = n;
            return guessNumber(max/2);
        } else if (guessRes == 1) {
            min = n;
            return guessNumber(n+((max-min)/2));
        } return n;
    }

    private int guess(int n, int pick){
        if (n > pick) return -1;
        else if (n < pick) return 1;
        else return 0;
    }

    public int getPick() {
        return pick;
    }

    public void setPick(int pick) {
        this.pick = pick;
    }
}
