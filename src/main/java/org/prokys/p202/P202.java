package org.prokys.p202;

import java.util.ArrayList;
import java.util.List;

public class P202 {

    public static boolean isHappy(int n) {

        List<Integer> memory = new ArrayList<>();
        String val = Integer.toString(n);
        int sum = 0;

        do {
            for (int i = 0; i < val.length(); i++) {
                sum = sum + (int)Math.pow(Character.getNumericValue(val.charAt(i)),2);
            }
            val = Integer.toString(sum);
            if (!memory.contains(sum)){
                memory.add(sum);
            }else return false;
            sum = 0;
        }while (Integer.parseInt(val) != 1);

        return true;
    }
}
