package com.zzxt.leetcode.q_349;

import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> one = new HashSet<>();

        for (int i = 0; i < nums1.length; i++) {
            one.add(nums1[i]);
        }

        Set<Integer> resultSet = new HashSet<>();
        int index = 0;
        for (int i = 0; i < nums2.length; i++) {
            if (one.contains(nums2[i])){
                resultSet.add(nums2[i]);
            }
        }

        int[] result = new int[resultSet.size()];

        for (Integer item :
                resultSet) {
            result[index] = item;
            index++;
        }

        return result;

    }
}