package com.wuyang.algorithm.array.p191107;

/**
 * 描述：给定一个数组，数组中的数值代表当天股票的价格，可以进行多次股票买卖，求最大收益
 *
 * @author wuyang
 * @date 2019/11/7
 **/
public class MaxProfitIITest {

    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                maxProfit += prices[i] - prices[i - 1];
            }
        }
        return maxProfit;
    }

}
