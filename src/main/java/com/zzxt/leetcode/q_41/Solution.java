package com.zzxt.leetcode.q_41;

import sun.jvm.hotspot.interpreter.BytecodePutField;

class Solution {
    public int firstMissingPositive(int[] nums) {

        sort(nums, 0, nums.length - 1);
        int i = -1;

        while (nums[++i] <= 0);
        int j = 1;
        while (i < nums.length){

            if (j < nums[i]){
                return j;
            }

            j++;
            i++;
        }

        return j;
    }


    public void sort(int[] nums, int l, int r) {
        if (l >= r) {
            return;
        }

        int i = l - 1;
        int j = r + 1;

        int x = nums[l + r >> 1];

        while (i < j) {
            while (nums[++i] < x) ;

            while (nums[--j] > x) ;

            if (i < j) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }

        sort(nums, l, j);
        sort(nums, j + 1, r);
    }

    public static void main(String[] args) {
        System.out.println(new Solution().firstMissingPositive(new int[]{1,2,0}));
    }
}