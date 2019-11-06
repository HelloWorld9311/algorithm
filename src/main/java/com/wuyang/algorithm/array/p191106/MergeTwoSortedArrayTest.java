package com.wuyang.algorithm.array.p191106;

/**
 * 描述：合并两个有序数组
 *
 * @author wuyang
 * @date 2019/11/6
 **/
public class MergeTwoSortedArrayTest {

    /**
     * 合并两个有序数组
     *
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1, j = n - 1, p = m + n - 1;
        while (i >= 0 && j >= 0) {
            nums1[p--] = nums1[i] >= nums2[j] ? nums1[i--] : nums2[j--];
        }
        while (j >= 0) {
            nums1[p--] = nums2[j--];
        }
    }

}
