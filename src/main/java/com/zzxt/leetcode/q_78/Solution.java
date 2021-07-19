package com.zzxt.leetcode.q_78;


import java.util.ArrayList;
import java.util.List;

class Solution {
    // 6:40
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> result = new ArrayList<List<Integer>>();



//        f[i] = f[i - 1 ] + ..... f[0];
        result.add(new ArrayList<Integer>());
        ArrayList<Integer> temp = new ArrayList<Integer>();
        temp.add(nums[0]);
        result.add(temp);

        for (int i = 1; i < nums.length; i++) {

            int size = result.size();
            for (int j = 0; j < size; j++) {
                List<Integer> integers = result.get(j);
                ArrayList<Integer> arrayList = new ArrayList<>(integers);
                arrayList.add(nums[i]);
                result.add(arrayList);
            }

        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().subsets(new int[]{1, 2, 3}));
    }
}