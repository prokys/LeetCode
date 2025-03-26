package org.prokys.p58;


public class P58 {

    public static String e1 = "Hello World";
    public static String e2 = "   fly me   to   the moon  ";
    public static String e3 = "luffy is still joyboy";
    public static String e4 = "a";
    public static String e5 = "aa";

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord(e1));
        System.out.println(lengthOfLastWord(e2));
        System.out.println(lengthOfLastWord(e3));
        System.out.println(lengthOfLastWord(e4));
        System.out.println(lengthOfLastWord(e5));
    }

    public static int lengthOfLastWord(String s) {
        int num = 0;
        String str = s.trim();

        for (int i = str.length()-1; i >= 0; i--) {
            if (Character.isAlphabetic(str.charAt(i))){
                num ++;
            }
            else{
                return num;
            }
        }
        return num;
    }
}
