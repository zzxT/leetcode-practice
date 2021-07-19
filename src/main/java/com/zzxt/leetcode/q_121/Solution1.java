package com.zzxt.leetcode.q_121;

class Solution1 {
    public int maxProfit(int[] prices) {

        int min = prices[0];
        int[] fn = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            fn[i] = prices[i]  - min;
            min = Math.min(prices[i], min);
        }

        int result = 0;
        for (int i = 0; i < fn.length; i++) {
            result = Math.max(fn[i], result);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(new Solution1().maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }
}