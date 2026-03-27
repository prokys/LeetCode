package org.prokys.p414;

public class P414 {

    public static int thirdMax(int[] nums) {

        int first =  nums[0];
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        boolean containsMin = false;

        if (first == Integer.MIN_VALUE) {
            containsMin = true;
        }

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > first) {
                third = second;
                second = first;
                first = nums[i];
            }else if (nums[i] > second) {
                if (nums[i] != first){
                    third = second;
                    second = nums[i];
                }

            }else if (nums[i] > third) {
                if (nums[i] != second){
                    third = nums[i];
                }

            }else if (nums[i] == Integer.MIN_VALUE){
                containsMin = true;
            }
        }
        if (second == Integer.MIN_VALUE && third == Integer.MIN_VALUE) {
            return first;
        } else if (third == Integer.MIN_VALUE && containsMin) {
            return third;
        } else if (third == Integer.MIN_VALUE && !containsMin) {
                return first;
        } else return third;
    }
}
