package org.prokys.p121;

public class P121 {

    public static int[] nums = {7,1,5,3,6,4};
    public static int[] nums1 = {7,6,4,3,1};

    public static void main(String[] args) {
        System.out.println(maxProfit(nums));
        System.out.println(maxProfit(nums1));
    }

    public static int maxProfit(int[] prices) {
        int min = prices[0];
        int max = prices[0];
        int diff = 0;
        for (int i = 1; i < prices.length ; i++) {
            if (min > prices[i]){
                min = prices[i];
                max = prices[i];
            }else if (max < prices[i]){
                max = prices[i];
                if ((max-min) > diff){
                    diff = max-min;
                }
            }

        }
        return diff;
    }
}
