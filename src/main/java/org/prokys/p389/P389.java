package org.prokys.p389;

import java.util.HashMap;

public class P389 {

    public static char findTheDifference(String s, String t) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c,0)+1);
        }

        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c,0)+1);
        }

        for (HashMap.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue()%2 == 1) {
                return entry.getKey();
            }
        }
        return 0;
    }

}
