package com.zzxt.leetcode.q_1480;

class Solution {
    public int[] runningSum(int[] nums) {

//        int[] sums = new int[nums.length + 1];
//        sums[0] = 0;

        int[] sums = new int[nums.length];
        sums[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sums[i] = sums[i - 1] + nums[i];
        }

        return sums;
    }


}