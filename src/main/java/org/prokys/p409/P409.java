package org.prokys.p409;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class P409 {

    public static int longestPalindrome(String s) {

        AtomicInteger result = new AtomicInteger();
        AtomicBoolean odd = new AtomicBoolean(false);

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        System.out.println(map);

        map.values().forEach(value ->
                {
                    if (value %2 == 0) {
                        result.set(result.get() + value);
                    }else  {
                        result.set(result.get() + value-1);
                        odd.set(true);
                    }
                });

        if (odd.get()){
            result.set(result.get() + 1);
        }

        return result.get();
    }
}
