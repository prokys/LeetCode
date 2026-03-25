package org.prokys.p392;

public class P392 {

    public static boolean isSubsequence(String s, String t) {

        int lastCharPos = 0;
        for (int i = 0; i < s.length(); i++) {
            boolean found = false;
            for (int j = lastCharPos; j < t.length(); j++) {
                if (s.charAt(i) == t.charAt(j)) {
                    lastCharPos = j + 1;
                    found = true;
                    break;
                }
            }
            if (!found){
                return false;
            }
        }
        return true;
    }
}
