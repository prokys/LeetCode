package org.prokys.p350;

import java.util.*;

public class P350 {

    public static int[] intersect(int[] nums1, int[] nums2) {

        List<Integer> intersections = new ArrayList<>();

        if (nums1.length == 0 || nums2.length == 0) return new int[0];

        if (nums1.length < nums2.length){
            for (int j : nums1) {

                for (int i = 0; i < nums2.length; i++) {
                    int k = nums2[i];
                    if (j == k) {
                        intersections.add(j);
                        nums2[i] = -1;
                        break;
                    }
                }
            }
        }else {
            for (int j : nums2) {

                for (int i = 0; i < nums1.length; i++) {
                    int k = nums1[i];
                    if (j == k) {
                        intersections.add(j);
                        nums1[i] = -1;
                        break;
                    }
                }
            }
        }

        return intersections.stream().mapToInt(Integer::intValue).toArray();
    }
}
