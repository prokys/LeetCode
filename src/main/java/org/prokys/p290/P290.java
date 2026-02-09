package org.prokys.p290;

import java.util.*;

public class P290 {

    public static boolean wordPattern(String pattern, String s) {

        List<String> listOfStrings = getStrings(s);
        Map<Character, String> map= new HashMap<>();
        String newString = "";

        if (pattern.length() != listOfStrings.size()) return false;

        for (int i = 0; i < pattern.length(); i++) {
            if (!map.containsKey(pattern.charAt(i)) && map.containsValue(listOfStrings.get(i))){
                return false;
            }else map.put(pattern.charAt(i), listOfStrings.get(i));

        }

        for (int i = 0; i < pattern.length(); i++) {
            if (i == 0){
                newString = newString.concat(map.get(pattern.charAt(i)));
            } else {
                newString = newString.concat(" ").concat(map.get(pattern.charAt(i)));
            }

        }

        return s.equals(newString);
    }

    private static List<String> getStrings(String s) {

        int lastSpace = 0;
        List<String> list = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' '){
                list.add(s.substring(lastSpace,i));
                lastSpace = i+1;
            } else if (i == s.length()-1) {
                list.add(s.substring(lastSpace));
            }
        }

        return list;
    }
}
