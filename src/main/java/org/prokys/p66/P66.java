package org.prokys.p66;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P66 {

    public static int[] e1 = {9,8,7,6,5,4,3,2,1,0};
    public static int[] e2 = {4,3,2,1};
    public static int[] e3 = {9,9};

    public static void main(String[] args) {

        int[] asd = plusOne(e1);
//       for(int as : asd){
//           System.out.println(as);
//       }

    }

public static int[] plusOne(int[] digits) {

    // udelat array list, pricitat +1 a kdyz >9 zapsat 0 a drzet 1, pokud i=0, pridat 1
    int plus = 1;
    boolean nines = Arrays.stream(digits).allMatch(x-> x==9);
    if (nines){
        int[] tempArr = new int[digits.length+1];
        tempArr[0] = 1;
        for (int i = 1; i < digits.length; i++) {
            tempArr[i] = 0;
        }
        return tempArr;
    }

    for (int i = digits.length-1; i >= 0 ; i--) {

        int temp = digits[i] + plus;
        if (temp == 10){
            digits[i] = 0;
            System.out.println(0);
        } else {
            digits[i] = temp;
            plus = 0;
            System.out.println(temp);
        }
    }
    return digits;
}
}
