package com.wuyang.algorithm.array.p191105;

/**
 * 描述：查询有序数组中制定目标值的位置，如果目标值不存在，则返回目标值应该插入的位置
 *
 * @author wuyang
 * @date 2019/11/5
 **/
public class SearchInsertIndexTest {

    public static int searchInsertINdex(int[] arr, int target) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        int left = 0;
        int right = arr.length;
        while (left < right) {
            int mid = (left + right) >>> 1;
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return right;
    }

}
