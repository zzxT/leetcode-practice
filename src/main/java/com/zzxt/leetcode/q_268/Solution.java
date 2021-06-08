package com.zzxt.leetcode.q_268;

class Solution {

    public int missingNumber(int[] nums) {
        int sum = nums.length * (nums.length + 1) / 2;
        int result = 0;
        for(int i = 0; i < nums.length; i++) {
            result += nums[i];
        }

        return sum - result;
    }
}