package com.zzxt.leetcode.q_55;

import com.zzxt.leetcode.q_78.Solution1;

class Solution {

    // 6:10

    public boolean canJump(int[] nums) {
        int max = nums[0];

        if (nums.length == 1){
            return  true;
        }

        for (int i = 0; i < nums.length - 1; i++) {

            if (i > max && i < nums.length - 1){
                return false;
            }

            max = Math.max(i + nums[i], max);
            if (max + 1 >= nums.length ){
                return true;
            }
        }

        return false;
    }


    public static void main(String[] args) {
        System.out.println(new Solution().canJump(new int[]{0}));
    }
}