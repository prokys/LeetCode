package org.prokys.p14;

import java.util.*;

public class P14 {

    public static void main(String[] args) {
        String [] input = {"cac","acc","ccc"};

        System.out.println(longestCommonPrefix(input));
    }

    public static String longestCommonPrefix(String[] strs) {

        String longestCommonPrefix = "";
        int maxLength = 201;

        for(String value : strs){
            if (value.length() < maxLength){
                maxLength = value.length();
            }
        }

        for (int i = 0; i < maxLength; i++) {
            boolean doAllCharsMatch = true;

            for (String value : strs){
                if (value.charAt(i) == strs[0].charAt(i));
                    else {
                    doAllCharsMatch = false;
                    break;
                }
            }
            if (doAllCharsMatch){
                longestCommonPrefix = longestCommonPrefix + strs[0].charAt(i);
            }else break;
        }

        return longestCommonPrefix;
    }

}
