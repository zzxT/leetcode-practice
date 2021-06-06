package com.zzxt.leetcode.q_88;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) {
            return;
        }

        for (int i = 0; i < nums2.length; i++) {
            int n2 = nums2[i];
            boolean search = false;
            for (int j = 0; j < m; j++) {
                int n1 = nums1[j];
                if (n1 < n2) {
                    continue;
                }

                search = true;
                for (int k = m; k > j; k--) {
                    nums1[k]  = nums1[k - 1];
                }

                nums1[j] = n2;
                m++;
                break;
            }


            if (!search) {
                nums1[m] = n2;
                m++;
            }
        }

    }
}