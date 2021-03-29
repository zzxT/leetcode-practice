package com.zzxt.leetcode.q_136;

class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result ^= nums[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] target = new int[]{-1,-1,2};
        System.out.println(new Solution().singleNumber(target));
    }
}