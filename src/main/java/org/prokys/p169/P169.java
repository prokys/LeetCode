package org.prokys.p169;

import java.util.Hashtable;

public class P169 {

    public static int majorityElement(int[] nums) {
        Hashtable<Integer,Integer> count = new Hashtable<>();
        int half = nums.length/2;

        for (int num : nums){
            if (count.get(num) != null){
                count.replace(num, count.get(num)+1);
            }else count.put(num,1);

            if (count.get(num) > half){
                return num;
            }
        }
        return 0;
    }
}
