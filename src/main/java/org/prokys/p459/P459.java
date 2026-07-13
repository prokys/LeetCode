package org.prokys.p459;

public class P459 {

    public static boolean repeatedSubstringPattern(String s) {

        for (int i = 0; i < s.length()/2; i++) {

            int num = i+1;
            if (s.length()%num == 0) {
                String sub = s.substring(0, num);
                String repeat = sub.repeat(s.length() / num);

                if (repeat.equals(s)) {
                    return true;
                }
            }
        }
        return false;
    }
}
