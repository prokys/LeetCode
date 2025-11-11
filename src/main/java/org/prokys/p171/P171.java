package org.prokys.p171;

public class P171 {

    public static int titleToNumber(String columnTitle) {
        int result = 0;
        for (int i = columnTitle.length()-1; i >= 0 ; i--) {
            result = result + ((Character.getNumericValue(columnTitle.charAt(i))-9) * (int)(Math.pow(26,Math.abs(i-columnTitle.length()+1))));
        }
        return result;
    }
}
