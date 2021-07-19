package com.zzxt.leetcode.q_46;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        Set<Integer> state = new HashSet<>(nums.length);
        dfs(result, path, 0, nums, state);

        return result;
    }

    public void dfs(List<List<Integer>> result, List<Integer> path, int level, int[] nums, Set<Integer> state) {
        if (nums.length == level) {
            result.add(new ArrayList<>(path));
            return;
        }


        for (int i = 0; i < nums.length; i++) {
            if (!state.contains(nums[i])) {
                path.add(nums[i]);
                state.add(nums[i]);
                dfs(result, path, level + 1, nums, state);
                state.remove(nums[i]);
                path.remove(path.size() - 1);

            }
        }
    }

    public static void main(String[] args) {

        System.out.println(new Solution().permute(new int[]{1, 2, 3}));
    }
}