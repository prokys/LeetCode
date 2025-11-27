package org.prokys.p217;

import java.util.HashSet;

public class P217 {

    public static HashSet<Integer> values;
    public static boolean containsDuplicate(int[] nums) {

        values = new HashSet<>();

        for (int num : nums) {

            if (values.contains(num)){
                return true;
            }
            else {
                values.add(num);
            }
        }

        return false;
    }
}
