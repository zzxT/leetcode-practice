package com.zzxt.leetcode.q_494;

import java.util.*;

class Solution {

    int result = 0;

    public int findTargetSumWays(int[] nums, int target) {
        backTrack(nums, target, 0, 0);
        return result;
    }


    public void backTrack(int[] nums, int target, int index, int sum){
        if (nums.length == index){
            if (target == sum){
                result++;
            }
        } else {
            backTrack(nums, target, index + 1, sum + nums[index]);
            backTrack(nums, target, index + 1, sum - nums[index]);

        }

    }


    public static void main(String[] args) {
        System.out.println(new Solution().findTargetSumWays(new int[]{1, 0}, 1));
    }
}