package com.zzxt.leetcode.q_350;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> times = new HashMap<>();

        for (int i = 0; i < nums1.length; i++) {
            int temp = nums1[i];

            Integer time = times.getOrDefault(temp, 0);

            time++;

            times.put(temp, time);

        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums2.length; i++) {

            int temp = nums2[i];

            Integer time = times.getOrDefault(temp, 0);

            if (time != 0){
                result.add(temp);
                time--;
                times.put(temp, time);
            }
        }


        int[] arrays = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            arrays[i] = result.get(i);
        }

        return arrays;

    }
}