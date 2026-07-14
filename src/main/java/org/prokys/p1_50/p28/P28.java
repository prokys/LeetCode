package org.prokys.p1_50.p28;

public class P28 {

    public static void main(String[] args) {

        String haystack = "leetcode";
        String needle = "leeto";

        System.out.println(strStr(haystack, needle));

    }

    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

}
