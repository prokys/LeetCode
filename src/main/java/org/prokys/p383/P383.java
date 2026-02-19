package org.prokys.p383;

import java.util.HashMap;
import java.util.Map;

public class P383 {

    public static boolean canConstruct(String ransomNote, String magazine) {

        Map<Character, Integer> ransomChars = new HashMap<>();
        Map<Character, Integer> magazineChars = new HashMap<>();

        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);
            if (!ransomChars.containsKey(c)){
                ransomChars.put(c, 1);
            }else ransomChars.put(c, ransomChars.get(c)+1);
        }
        for (int i = 0; i < magazine.length(); i++) {
            char c = magazine.charAt(i);
            if (!magazineChars.containsKey(c)){
                magazineChars.put(c, 1);
            }else magazineChars.put(c, magazineChars.get(c)+1);
        }

        for (char c : ransomChars.keySet()){
            if (ransomChars.get(c) > magazineChars.getOrDefault(c,0)){
                return false;
            }
        }

        return true;
    }
}
