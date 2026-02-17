package org.prokys.p349;

import java.util.*;

public class P349 {

    public static int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> intersections = new HashSet<>();
        
        if (nums1.length == 0 || nums2.length == 0) return new int[0];
        
        if (nums1.length < nums2.length){

            for (int j : nums1) {
                if (Arrays.stream(nums2).anyMatch(x -> x == j)) intersections.add(j);
            }
        }else {
            for (int j : nums2) {
                if (Arrays.stream(nums1).anyMatch(x -> x == j)) intersections.add(j);
            }
        }

        return intersections.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[] intersection2(int[] nums1, int[] nums2) {
        Set<Integer> intersections = new HashSet<>();

        if (nums1.length == 0 || nums2.length == 0) return new int[0];

        if (nums1.length < nums2.length){

            for (int j : nums1) {
                if (intersections.contains(j)) {

                } else {
                    for (int k : nums2) {
                        if (j == k) intersections.add(j);
                    }
                }
            }
        }else {
            for (int j : nums2) {
                if (intersections.contains(j)) {

                } else {
                    for (int k : nums1) {
                        if (j == k) intersections.add(k);
                    }
                }
            }
        }

        return intersections.stream().mapToInt(Integer::intValue).toArray();
    }
}
