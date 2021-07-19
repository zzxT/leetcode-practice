package com.zzxt.leetcode.q_215;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        Comparator<Integer> maxComparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        };
        Queue<Integer> heap = new PriorityQueue<>(maxComparator);

        for (int i = 0; i < nums.length; i++) {
            heap.add(nums[i]);
        }

        int result = 0;
        for (int i = 0; i < k; i++) {
            result = heap.poll();
        }

        return result;
    }
}