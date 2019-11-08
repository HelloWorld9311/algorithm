package com.wuyang.algorithm.array.p191108;

/**
 * 描述：对给定数组旋转指定次数，进行头尾旋转
 * 例如：给定数组[1,2,3,4,5] 旋转一次则为：[5,1,2,3,4]
 *
 * @author wuyang
 * @date 2019/11/8
 **/
public class RotateArrayTest {

    public static void rotate(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return;
        }

        int length = nums.length;
        // 首先对旋转次数进行判断
        if (k % length == 0) {
            // 旋转length的整数次，则相当于不旋转
            return;
        } else {
            // 如果不能整除，则仅对其旋转余数次即可
            k = k % length;
        }

        // 首先对整个数组进行旋转
        for (int i = 0; i < length / 2; i++) {
            int index = length - i - 1;
            nums[i] = nums[i] + nums[index];
            nums[index] = nums[i] - nums[index];
            nums[i] = nums[i] - nums[index];
        }

        // 对前K个元素进行反转
        for (int i = 0; i < k / 2; i++) {
            int index = k - 1 - i;
            nums[i] = nums[i] + nums[index];
            nums[index] = nums[i] - nums[index];
            nums[i] = nums[i] - nums[index];
        }

        for (int i = k; i < (length - k) / 2 + k; i++) {
            int index = length - i + k - 1;
            nums[i] = nums[i] + nums[index];
            nums[index] = nums[i] - nums[index];
            nums[i] = nums[i] - nums[index];
        }

    }

}
