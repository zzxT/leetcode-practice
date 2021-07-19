package com.zzxt.leetcode.q_128;

import java.util.Iterator;
import java.util.TreeMap;

class Solution {
    public int longestConsecutive(int[] nums) {

        if (nums.length == 0){
            return 0;
        }

        if (nums.length == 1){
            return 1;
        }

        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], 1);
        }


        int longest = 1;
        int max = 1;
        Iterator<Integer> iterator = map.navigableKeySet().iterator();
        Integer last = iterator.next();
        while (iterator.hasNext()){
            Integer next = iterator.next();
            if (next == (last + 1)){
                longest++;
                max = Math.max(longest, max);
            } else {
                longest = 1;
            }
            last = next;
        }

        return max;
    }


    public static void main(String[] args) {
        System.out.println(new Solution().longestConsecutive(new int[]{9,1,4,7,3,-1,0,5,8,-1,6}));
    }
}