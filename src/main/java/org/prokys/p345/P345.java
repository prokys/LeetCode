package org.prokys.p345;

import java.util.ArrayList;
import java.util.List;

public class P345 {

    public static String reverseVowels(String s) {

        String aeiou = "aeiouAEIOU";
        List<Character> vowels = new ArrayList<>();
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            if (aeiou.contains(Character.toString(s.charAt(i)))){
                vowels.add(s.charAt(i));
            }
        }

        for (int i = 0; i < s.length(); i++) {
            if (aeiou.contains(s.charAt(i)+"")){
                result = result.concat(Character.toString(vowels.get(vowels.size()-1)));
                vowels.remove(vowels.size()-1);
            }else result = result.concat(Character.toString(s.charAt(i)));
        }

        return result;
    }
}
