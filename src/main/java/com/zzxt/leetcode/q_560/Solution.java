package com.zzxt.leetcode.q_560;

class Solution {
    public int subarraySum(int[] nums, int k) {

        int[] sum = new int[nums.length + 1];
        sum[0] = 0;
        for (int i = 0; i < nums.length; i++) {
            sum[i + 1] = nums[i] + sum[i];
        }

        int result = 0;
        for (int i = 0; i <= nums.length; i++) {
            for (int j = i + 1; j <= nums.length; j++) {
                if (k == (sum[j] - sum[i])){
                    result++;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().subarraySum(new int[]{1, 1, 1}, 2));
    }
}