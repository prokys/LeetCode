package org.prokys.p20;


public class P20 {

    public static void main(String[] args) {
        String input = "(([]){})";

//        System.out.println(isValid(input));
        System.out.println(isValid2(input));

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

    public static boolean isValid2(String s){

        if (s.length() %2 == 1) return false;

        for (int i = 0; i < s.length()-1; i++) {
            switch (s.charAt(i)){
                case '(' -> {
                    if (s.charAt(i+1) == ')'){
                        s = s.replaceAll("\\(\\)","");
                        if (i!=0) i-=2;
                        else i=-1;
                    }
                }
                case '{' -> {
                    if (s.charAt(i+1) == '}'){
                        s = s.replaceAll("\\{\\}","");
                        if (i!=0) i-=2;
                        else i=-1;
                    }
                }
                case '[' -> {
                    if (s.charAt(i+1) == ']'){
                        s = s.replaceAll("\\[\\]","");
                        if (i!=0) i-=2;
                        else i=-1;
                    }
                }
            }
        }

        return s.length()==0;
    }
}
