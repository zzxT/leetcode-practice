package com.zzxt.leetcode.q_4;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int sum = nums1.length + nums2.length;

        boolean isOdd = (sum & 1) == 1;

        int l = 0;
        int r = 0;
        int i = 0;

        while (l < nums1.length && r < nums2.length) {

            if (nums1[l] <= nums2[r]) {

                if (isOdd && i == (sum / 2)) {
                    return nums1[l];
                }

                if (!isOdd && i == (sum / 2 - 1)) {

                    int max = 0;
                    if (l + 1 < nums1.length) {
                        max = Math.max(nums1[l + 1], nums2[r]);
                    } else {
                        max = nums2[r];
                    }

                    return (nums1[l] + max) / 2.0;
                }

                l++;
            } else {


                if (isOdd && i == (sum / 2)) {
                    return nums2[r];
                }

                if (!isOdd && i == (sum / 2 - 1)) {

                    int max = 0;
                    if (r + 1 < nums2.length) {
                        max = Math.max(nums1[l], nums2[r + 1]);
                    } else {
                        max = nums2[r];
                    }


                    return (nums2[r] + max) / 2.0;
                }

                r++;
            }

            i++;

        }


        while (l < nums1.length) {

            if (isOdd && i == (sum / 2)) {
                return nums1[l];
            }

            if (!isOdd && i == (sum / 2 - 1)) {
                return (nums1[l] + nums1[l + 1]) / 2.0;
            }

            l++;
            i++;
        }

        while (r < nums2.length) {

            if (isOdd && i == (sum / 2)) {
                return nums2[r];
            }

            if (!isOdd && i == (sum / 2 - 1)) {
                return (nums2[r] + nums2[r + 1]) / 2.0;
            }
            r++;
            i++;
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().findMedianSortedArrays(new int[]{1, 3}, new int[]{2, 7}));
    }
}