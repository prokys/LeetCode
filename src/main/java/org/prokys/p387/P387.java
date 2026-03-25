package org.prokys.p387;

import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;

public class P387 {

    public static int firstUniqChar(String s) {

        AtomicInteger min = new AtomicInteger(Integer.MAX_VALUE);
        TreeMap<Character, Integer> map = new TreeMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c,0)+1);
        }


        map.forEach((c,i) ->
        {
            if (i == 1){
                int index = s.indexOf(c);
                if (index < min.get()){
                    min.set(index);
                }
            }

        });
        if (min.get() == Integer.MAX_VALUE){
            return -1;
        }else return min.get();
    }

}
