package com.zzxt.leetcode.q_367;

import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> time = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            Integer orDefault = time.getOrDefault(nums[i], 1);
            time.put(nums[i], orDefault + 1);
        }

        Iterator<Map.Entry<Integer, Integer>> iterator = time.entrySet().iterator();

        List<Map.Entry<Integer, Integer>> collect = time.entrySet().parallelStream().sorted(Comparator.comparingInt(Map.Entry::getValue)).collect(Collectors.toList());

        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = collect.get(i).getKey();
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2)));
    }
}