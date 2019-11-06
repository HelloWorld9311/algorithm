package com.wuyang.algorithm.array.p191106;

import java.util.Arrays;

/**
 * 描述：当日测试类
 *
 * @author wuyang
 * @date 2019/11/6
 **/
public class TodayTest {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 45, 78, 99, 0, 0, 0, 0, 0, 0};
        int[] arr2 = {3, 4, 6, 7, 9, 100};
        MergeTwoSortedArrayTest.merge(arr1, 6, arr2, 6);
        for (int num : arr1) {
            System.out.print(num);
        }
    }

}
