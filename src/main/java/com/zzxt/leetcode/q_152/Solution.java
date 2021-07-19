package com.zzxt.leetcode.q_152;

class Solution {
    public int maxProduct(int[] nums) {

    
        int max = nums[0];
        
        int[] fn = new int[nums.length];

        fn[0] = nums[0];
        for (int i = 1 ; i < nums.length ; i++) {
            fn[i] = Math.max( fn[i - 1] * nums[i], nums[i]);
            max = Math.max(fn[i], max);
        }
        
        return max;
    }

    public static void main(String[] args) {
        System.out.println(-10 % 3);
    }
}