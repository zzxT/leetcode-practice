package com.zzxt.leetcode.test;

import javafx.util.Pair;

import java.util.*;

public class Solution {


    public Set<Pair<Integer, Integer>> twoSum(int key, int[] nums){
        Set<Integer> storage = new HashSet<>(nums.length);
        Set<Pair<Integer, Integer>> result = new HashSet<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            storage.add(nums[i]);
        }



        for (int i = 0; i < nums.length; i++) {
            int target = key - nums[i];
            if (storage.contains(target)) {
                int first = Math.min(target, nums[i]);
                int second = Math.max(target, nums[i]);
                result.add(new Pair<>(first, second));
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().twoSum(7, new int[]{1, 2, 3, 4, 5}));
    }
}
