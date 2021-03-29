package com.zzxt.leetcode.q_217_iscontains_duplicate_number;

import java.util.HashSet;
import java.util.Set;

// 类似题目
// https://leetcode-cn.com/problems/contains-duplicate/solution/chao-xiang-xi-kuai-lai-miao-dong-ru-he-p-sf6e/

class Solution {
    public boolean containsDuplicate(int[] nums) {
        if (nums == null || nums.length == 0 || nums.length == 1 ){
            return false;
        }


        Set<Integer> bag = new HashSet<Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (bag.contains(nums[i])){
                return true;
            }

            bag.add(nums[i]);
        }

        return false;
    }
}