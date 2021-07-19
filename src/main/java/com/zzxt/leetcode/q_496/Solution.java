package com.zzxt.leetcode.q_496;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

class Solution {
   public int[] nextGreaterElement(int[] nums1, int[] nums2) {
       Deque<Integer> stack = new LinkedList<>();
       Map<Integer, Integer> temp = new HashMap<>();


       int[] result = new int[nums1.length];
       for (int i = 0; i < nums2.length; i++) {
           if (stack.isEmpty() || stack.peek() >= nums2[i]){
               stack.push(nums2[i]);
           } else {
               while (!stack.isEmpty() && stack.peek() < nums2[i]){
                   Integer tail = stack.pop();
                   temp.put(tail, nums2[i]);
               }

               stack.push(nums2[i]);

           }

       }

       for (int i = 0; i < nums1.length; i++) {
           Integer orDefault = temp.getOrDefault(nums1[i], -1);
           result[i] = orDefault;
       }

       return result;
    }
}