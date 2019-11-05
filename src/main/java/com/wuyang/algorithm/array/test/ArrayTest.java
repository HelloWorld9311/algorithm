package com.wuyang.algorithm.array.test;


import com.wuyang.algorithm.array.BinarySearchTest;

/**
 * 描述：todo
 *
 * @author wuyang
 * @date 2019/11/5
 **/
public class ArrayTest {

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,9,10,24};

//        System.out.println(SearchInsertIndexTest.searchInsert(arr, 25));
        System.out.println(BinarySearchTest.binarySearch(arr, 25));
    }

}
