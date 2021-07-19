package com.zzxt.leetcode.q_300;

class Solution {
    public int lengthOfLIS(int[] nums) {

        int[] fn = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            fn[i] = 1;

            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]){
                    fn[i] = Math.max(fn[i], fn[j] + 1);
                }
            }
        }

        int result = 0;

        for (int i = 0; i < fn.length; i++) {
            result = Math.max(fn[i], result);
        }

        return result;
    }
}