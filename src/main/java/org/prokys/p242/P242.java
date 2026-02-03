package org.prokys.p242;

public class P242 {

    public static boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) return false;

        String replacedString = t;

        for (int i = 0; i < s.length(); i++) {
            replacedString = replacedString.replaceFirst(Character.toString(s.charAt(i)),"");
        }

        System.out.println(replacedString);

        return replacedString.isEmpty();
    }
}
