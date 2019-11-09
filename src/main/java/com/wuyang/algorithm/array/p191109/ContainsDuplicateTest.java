package com.wuyang.algorithm.array.p191109;

import java.util.HashSet;
import java.util.Set;

/**
 * 描述：查询数组中是否有重复度元素
 *
 * @author wuyang
 * @date 2019/11/9
 **/
public class ContainsDuplicateTest {

    public static boolean containsDuplicate(int[] nums) {
        if (nums == null || nums.length == 0) {
            return false;
        }
        Set<Integer> set = new HashSet<>(nums.length << 2);
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
        }
        return false;
    }

}
