package org.prokys.p88;

public class P88 {

    public static int [] firstArray = {1,2,3,0,0,0};
    public static int firstLength = 3;
    public static int [] secondArray = {2,5,6};
    public static int secondLength = 3;

    public static int [] thirdArray = {1};
    public static int thirdLength = 1;
    public static int [] fourthArray = {};
    public static int fourthLength = 0;

    public static int [] fifthArray = {0};
    public static int fifthLength = 0;
    public static int [] sixthArray = {1};
    public static int sixthLength = 1;

    public static int [] seventhArray = {-100,-1,0,1,100,0,0,0};
    public static int seventhLength = 5;
    public static int [] eighthArray = {-50,0,50};
    public static int eightLength = 3;

    public static int [] ninethArray = {1,2,3,0,0,0};
    public static int ninethLength = 3;
    public static int [] tenthArray = {-3,-2,-1};
    public static int tenLength = 3;

    public static void main(String[] args) {
        merge(firstArray, firstLength, secondArray, secondLength);
        System.out.println();
        merge(thirdArray, thirdLength, fourthArray, fourthLength);
        System.out.println();
        merge(fifthArray, fifthLength, sixthArray, sixthLength);
        System.out.println();
        merge(seventhArray, seventhLength, eighthArray, eightLength);
        System.out.println();
        merge(ninethArray, ninethLength, tenthArray, tenLength);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] mergeArray = new int[m+n];
        int m1 = 0;
        int n2 = 0;

            for (int i = 0; i < nums1.length; i++) {
                if (m == 0 || m == m1) {
                    mergeArray[i] = nums2[n2];
                    n2++;
                } else if (n == 0 || n == n2) {
                    mergeArray[i] = nums1[m1];
                    m1++;
                }
                else {
                if (nums1[m1] < nums2[n2]) {
                    mergeArray[i] = nums1[m1];
                    m1++;
                } else if (nums2[n2] < nums1[m1]) {
                    mergeArray[i] = nums2[n2];
                        n2++;
                } else if (nums1[m1] == nums2[n2]) {
                    mergeArray[i] = nums1[m1];
                    i++;
                    mergeArray[i] = nums2[n2];
                    m1++;
                    n2++;
                }
            }
        }
        for (int j = 0; j < nums1.length; j++) {
            nums1[j] = mergeArray[j];
        }
        for (int j = 0; j < nums1.length; j++) {
            System.out.println(nums1[j]);
        }
    }
}
