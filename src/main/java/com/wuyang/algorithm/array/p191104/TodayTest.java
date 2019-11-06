package com.wuyang.algorithm.array.p191104;

/**
 * 描述：当日测试类
 *
 * @author wuyang
 * @date 2019/11/5
 **/
public class TodayTest {

    public static void main(String[] args) {
        // 测试删除有序数组中的重复元素
        int[] arr = new int[]{1, 1, 2};
//        System.out.println(RemoveDuplicatesTest.removeDuplicates1(arr));

        // 测试删除数组中的指定元素
//        System.out.println(RemoveElementTest.removeElement1(arr, 1));
        System.out.println(RemoveElementTest.removeElement2(arr, 2));
    }

}
