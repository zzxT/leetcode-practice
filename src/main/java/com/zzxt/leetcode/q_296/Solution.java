package com.zzxt.leetcode.q_296;

import java.sql.Statement;
import java.util.*;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        if (nums1.length == 0){
            return nums1;
        }

        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            int target = nums1[i];
            boolean find = false;
            for (int j = 0; j < nums2.length; j++) {
                if (target < nums2[j] && find) {
                    result[i] = nums2[j];
                    break;
                }
                if (target == nums2[j]) {
                    find = true;
                }
                result[i] = -1;

            }

        }
        return result;
    }


    public int[] singleStack(int[] nums1, int[] nums2){
        Map<Integer, Integer> result = new HashMap<>();
        Deque<Integer> stack = new LinkedList<>();


        for (int i = nums2.length - 1; i >= 0 ; i--) {
            if (stack.isEmpty()  || nums2[i] < stack.peek()) {
                result.put(nums2[i],stack.peek());
                stack.push(nums2[i]);
            } else {
                while (true) {
                    if (!stack.isEmpty() && stack.peek() <= nums2[i]) {
                        stack.pop();
                    } else {
                        result.put(nums2[i],stack.peek());
                        stack.push(nums2[i]);
                        break;
                    }
                }
            }

        }


        int[] truResult = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            if (result.get(nums1[i]) == null) {
                truResult[i] = -1;
            } else {
                truResult[i] = result.get(nums1[i]);
            }
        }

        return truResult;
    }
}