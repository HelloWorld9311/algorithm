package com.wuyang.algorithm.array.p191105;

/**
 * 描述：数组表示的数字加1
 *
 * @author wuyang
 * @date 2019/11/6
 **/
public class PlusOneTest {

    public static int[] plusOne(int[] nums) {
        if (nums == null || nums.length == 0) {
            return nums;
        }
        for (int i = nums.length - 1; i >= 0; i++) {
            nums[i] = nums[i] + 1;
            nums[i] %= 10;
            if (nums[i] != 0) {
                return nums;
            }
        }
        int[] numsNew = new int[nums.length + 1];
        numsNew[0] = 1;
        return numsNew;
    }

}
