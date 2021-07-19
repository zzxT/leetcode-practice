package com.zzxt.leetcode.q_78;

import java.util.ArrayList;
import java.util.List;

public class Solution1 {

    List<List<Integer>> result = new ArrayList<>();
    boolean[] state;
    public List<List<Integer>> enums(int[] nums){
        state = new boolean[nums.length];
        enumsOne(nums, 0, 1, new ArrayList<>());
        return  result;
    }


    public void enumsOne(int[] nums, int level, int size, List<Integer> tempResult){
        if (level == size){
            result.add(new ArrayList<>(tempResult));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (!state[i]){
                tempResult.add(nums[i]);
                state[i] = true;
                level++;
                enumsOne(nums, level, size, tempResult);

                level--;
                state[i] = false;
                tempResult.remove(tempResult.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution1().enums(new int[]{1, 2, 3}));
    }

}
