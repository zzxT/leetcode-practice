package com.zzxt.leetcode.q_167;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> data = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {

            if (data.containsKey(target - numbers[i])){
                return new int[]{data.get(target- numbers[i]) + 1, i  + 1};
            }
            data.put(numbers[i], i);
        }

        return null;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().twoSum(new int[]{2, 7, 11, 15}, 9)));
    }
}