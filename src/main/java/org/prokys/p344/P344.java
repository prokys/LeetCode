package org.prokys.p344;

public class P344 {

    public static void reverseString(char[] s) {

        for (int i = 0; i < s.length/2; i++) {
            char c = s[i];
            s[i] = s[s.length-i-1];
            s[s.length-i-1] = c;
        }

    }
}
