package com.wuyang.algorithm.array;

/**
 * 描述：todo
 *
 * @author wuyang
 * @date 2019/11/5
 **/
public class SearchInsertIndexTest {

    /**
     * 使用二分查找查询指定的数字在数组中的下标
     * @param arr
     * @param target
     * @return
     */
    public static int searchInsert(int[] arr, int target) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        int left = 0;
        int right = arr.length;
        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

}
