package com.wuyang.algorithm.array;

import java.util.HashMap;
import java.util.Map;

/**
 * 描述：todo
 *
 * @author wuyang
 * @date 2019/11/4
 **/
public class SumOfTwoNumTest {

    public static int[] sumOfTwoNum(int[] arr, int target) {
        // 判断为空
        if (arr == null || arr.length < 2) {
            throw new IllegalArgumentException("no");
        }

        // 创建Map用来存放元素和对应下标的关系
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(target - arr[i])) {
                return new int[]{map.get(target), i};
            }
            map.put(arr[i], i);
        }
        throw new IllegalArgumentException("no");
    }

}
