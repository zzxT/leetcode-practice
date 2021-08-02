package com.zzxt.leetcode.q_163;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> result = new ArrayList<>();

        if (nums.length == 0){
            if (lower == upper){
                result.add("" + lower);
            } else {
                result.add(lower + "->" + upper);
            }
           return  result;
        }


        if (nums.length == 1){
            if (lower == upper){

            } else if (nums[0] == lower) {
                result.add("" + upper);
            } else {
                result.add("" + lower);
            }

            return result;
        }

        if ((nums[0] - 1 - lower) > 1){
            result.add((lower + 1 ) + "->" + (nums[0] - 1));
        } else if ((nums[0] - 1 - lower) == 1){
            result.add(lower + 1 + "");
        }


        for (int i = 0; i < nums.length - 1; i++) {

            int gap = nums[i + 1] - nums[i] - 1;

            if (gap > 1){
                result.add((nums[i] + 1 ) + "->" + (nums[i + 1] - 1));
            } else if (gap == 1){
                result.add(nums[i] + 1 + "");
            }
        }

        int gap = upper -   nums[nums.length - 1] - 1;
        if (gap > 1){
            result.add((nums[nums.length - 1] + 1 ) + "->" + (upper));
        } else if (gap == 1){
            result.add(nums[nums.length - 1] + 1 + "");
        }

        return  result;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().findMissingRanges(new int[]{0, 1, 3, 50, 75}, 0, 99));
    }
}