package org.prokys.p125;

public class P125 {

    public static void main(String[] args) {
        String s = "AS Da da-ad";
        String s1 = "asa";
        String s2 = "aadd";
        String s3 = "adda";

        System.out.println(isPalindrome(s));
        System.out.println(isPalindrome(s1));
        System.out.println(isPalindrome(s2));
        System.out.println(isPalindrome(s3));
    }

    public static boolean isPalindrome(String s) {
        StringBuilder sToCompare = new StringBuilder();
        String lowerS = s.toLowerCase();

        for (int i = 0; i < lowerS.length(); i++) {
            Character ch = lowerS.charAt(i);
            if ((ch.hashCode() > 96 && ch.hashCode() < 123) || (ch.hashCode() > 47 && ch.hashCode() < 58)){
                sToCompare.append(ch);
            }
        }

        for (int i = 0; i < sToCompare.length()/2; i++) {
            if (sToCompare.charAt(i) == sToCompare.charAt(sToCompare.length()-1-i)){

            }else return false;
        }
        return true;
    }
}
