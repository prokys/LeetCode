package org.prokys.p20;


public class P20 {

    public static void main(String[] args) {
        String input = "(([]){})";

        System.out.println(isValid(input));

    }

    public static boolean isValid(String s) {

        if (s.length() %2 == 1){
            return false;
        }

        String helper = s;

        for (int i = 0; i < s.length()/2; i++) {
            String anotherHelper = helper;

            anotherHelper = anotherHelper.replaceAll("\\(\\)", "");
            anotherHelper = anotherHelper.replaceAll("\\[\\]", "");
            anotherHelper = anotherHelper.replaceAll("\\{}", "");

            if (anotherHelper.equals(helper) || helper.length()==0) break;
            else helper=anotherHelper;

        }
        return helper.length() == 0;
    }
}
