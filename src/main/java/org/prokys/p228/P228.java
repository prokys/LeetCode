package org.prokys.p228;

import java.util.ArrayList;
import java.util.List;

public class P228 {
    public static List<String> summaryRanges(int[] nums) {

        if (nums.length == 0){
            return List.of();
        }

        if (nums.length == 1)    {
            return List.of(Integer.toString(nums[0]));
        }

        List<String> results = new ArrayList<>();

        int previous = nums[0];
        int start = previous;
        int end = previous;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i]-previous == 1){
                previous = nums[i];
                end = previous;
            } else {
                results.add(getStringValue(start, end));
                previous = nums[i];
                start = previous;
            }
            if (i == nums.length-1){
                results.add(getStringValue(start, end));
            }
        }

        return results;
    }

    public static String getStringValue(int start, int end){
        if (start < end){
            return start+"->"+end;
        }else {
            return Integer.toString(start);
        }
    }
    
}
