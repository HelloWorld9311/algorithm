package com.wuyang.algorithm.array.p191104;

/**
 * 描述：删除排序数组中的重复元素，返回值为删除重复元素之后的数组长度
 *
 * @author wuyang
 * @date 2019/11/5
 **/
public class RemoveDuplicatesTest {

    /**
     * 双指针法删除重复元素
     *
     * @param arr
     * @return
     */
    public static int removeDuplicates1(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        int slow = 0;
        for (int fast = 1; fast < arr.length; fast++) {
            if (arr[slow] != arr[fast]) {
                slow++;
                arr[slow] = arr[fast];
            }
        }
        return ++slow;
    }

}
