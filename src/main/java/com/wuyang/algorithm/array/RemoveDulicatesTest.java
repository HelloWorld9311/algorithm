package com.wuyang.algorithm.array;

/**
 * 描述：todo
 *
 * @author wuyang
 * @date 2019/11/4
 **/
public class RemoveDulicatesTest {

    public static void main(String[] args) {
    }

    /**
     * 双指针法删除数组中的重复元素
     * @param arr
     * @return
     */
    public static int removeDulicates(int[] arr) {
        if (arr == null || arr.length < 2) {
            return 0;
        }

        int slow = 0;
        for (int fast = 1; fast < arr.length; fast++) {
            if (arr[slow] != arr[fast]) {
                slow++;
                arr[slow] = arr[fast];
            }
        }
        return slow + 1;
    }

}
