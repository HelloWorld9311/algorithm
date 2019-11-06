package com.wuyang.algorithm.array.p191106;

/**
 * 描述：给出股票连续几天的价格，计算出历史可获得的最大收益
 *
 * @author wuyang
 * @date 2019/11/6
 **/
public class MaxProfitTest {

    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int maxProfit = 0;
        int minValue = Integer.MAX_VALUE;
        for (int price : prices) {
            minValue = Math.min(minValue, price);
            maxProfit = Math.max(maxProfit, price - minValue);
        }
        return maxProfit;
    }

}
