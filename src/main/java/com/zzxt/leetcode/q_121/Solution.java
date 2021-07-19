package com.zzxt.leetcode.q_121;

import java.util.Arrays;

class Solution {
    public int maxProfit(int[] prices) {

        int minPrices = prices[0];
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrices) {
                minPrices = prices[i];
            } else if (prices[i] >= minPrices) {
                maxProfit = Integer.max(maxProfit,  prices[i] - minPrices);
            }
        }

        return maxProfit;

    }
}