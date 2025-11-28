package org.prokys.p219;

import java.util.HashMap;

public class P219 {

    public static HashMap<Integer, Integer> values;

    public static boolean containsNearbyDuplicate(int[] nums, int k) {

        values = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (values.containsKey(nums[i])){
                if ((i - values.get(nums[i])) <= k){
                    return true;
                }else values.put(nums[i], i);
            }else values.put(nums[i], i);
        }

        return false;
    }
}
