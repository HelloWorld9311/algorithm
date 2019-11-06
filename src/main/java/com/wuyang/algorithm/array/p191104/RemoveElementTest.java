package com.wuyang.algorithm.array.p191104;

/**
 * 描述：原地删除数组中的指定元素，返回删除元素之后的数组长度
 *
 * @author wuyang
 * @date 2019/11/5
 **/
public class RemoveElementTest {

    /**
     * 双指针法删除数组中指定的元素
     *
     * @param arr
     * @param val
     * @return
     */
    public static int removeElement1(int[] arr, int val) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        int slow = 0;
        for (int fast = 0; fast < arr.length; fast++) {
            if (arr[fast] != val) {
                arr[slow] = arr[fast];
                slow++;
            }
        }
        return slow;
    }

    public static int removeElement2(int[] arr, int val) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        int head = 0;
        int tail = arr.length;
        while (head < tail) {
            if (arr[head] == val) {
                arr[head] = arr[tail - 1];
                tail--;
            } else {
                head++;
            }
        }
        return tail;
    }

}
