package com.wuyang.algorithm.array.p191109;

import java.util.HashMap;
import java.util.Map;

/**
 * 描述：判断数组中是否有重复元素num[i]、nums[j]，并且满足i 和 j 的绝对值不大于k
 *
 * @author wuyang
 * @date 2019/11/9
 **/
public class ContainsDuplicateIITest {

    public static boolean containsDuplicate(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return false;
        }
        Map<Integer, Integer> map = new HashMap<>(nums.length << 2);
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                if (Math.abs(i - map.get(nums[i])) <= k) {
                    return true;
                }
            }
            map.put(nums[i], i);
        }
        return false;
    }

}
