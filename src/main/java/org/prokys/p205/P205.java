package org.prokys.p205;

import java.util.Hashtable;

public class P205 {

    public static boolean isIsomorphic(String s, String t) {

        Hashtable<Character, Character> firstChars = new Hashtable<>();
        StringBuilder firstHelper = new StringBuilder();
        Hashtable<Character, Character> secondChars = new Hashtable<>();
        StringBuilder secondHelper = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            firstChars.put(s.charAt(i), t.charAt(i));
            secondChars.put(t.charAt(i), s.charAt(i));
        }

        for (int i = 0; i < s.length(); i++) {
            firstHelper.append(firstChars.get(s.charAt(i)));
            secondHelper.append(secondChars.get(t.charAt(i)));
        }

        if (t.contentEquals(firstHelper) && s.contentEquals(secondHelper)) return true;

        return false;
    }
}
