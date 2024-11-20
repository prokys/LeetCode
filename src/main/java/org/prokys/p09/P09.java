package org.prokys.p09;

public class P09 {

    public static void main(String[] args) {
        int x = 1001;

        System.out.println(isPalindrome(x));
    }

    public static boolean isPalindrome(int x) {
        if (x < 0){
            return false;
        }else {
            String value = String.valueOf(x);
            for (int i = 0; i<value.length()/2; i++){
                char p1 = value.charAt(i);
                char p2 = value.charAt(value.length()-(i+1));

                if (p1 != p2){
                    return false;
                }
            }
        }
        return true;
    }
}
