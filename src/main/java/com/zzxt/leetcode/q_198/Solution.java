package com.zzxt.leetcode.q_198;

class Solution {
    public int rob(int[] nums) {
        int[] fn = new int[nums.length];

        int max = 0;
        int lastMax = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i >= 2){
                fn[i] = lastMax + nums[i];
            } else {
                fn[i] = nums[i];
            }
            lastMax =  max;
            max = Math.max(fn[i], max);
        }

        return max;
    }
}