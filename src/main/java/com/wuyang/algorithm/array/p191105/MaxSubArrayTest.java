package com.wuyang.algorithm.array.p191105;

/**
 * 描述：求出数组中连续子序列的最大和
 *
 * @author wuyang
 * @date 2019/11/5
 **/
public class MaxSubArrayTest {

    public static int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int result = nums[0];
        int sum = 0;
        for (int num : nums) {
            if (sum > 0) {
                sum += num;
            } else {
                sum = num;
            }
            result = Math.max(sum, result);
        }
        return result;
    }

}
