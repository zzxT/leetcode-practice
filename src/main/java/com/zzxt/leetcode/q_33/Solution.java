package com.zzxt.leetcode.q_33;

import com.zzxt.leetcode.q_78.Solution1;

class Solution {
    public int search(int[] nums, int target) {
        int gap = 0;
        int left = 0;
        int right = nums.length - 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]){
                gap = nums.length - 1 - i;
                left = i + 1;
                right = i;
            }
        }

        int gapLeft = (left + gap) % nums.length; // 0
        int gapRight = (right + gap) % nums.length; // numlength

//        while ( gapLeft < gapRight ){
//            int gapMid = gapLeft + (gapRight - gapLeft) / 2 + gap;
//
//            if (nums[gapMid] == target){
//                return gapMid;
//            } else if (nums[mid] > target){
//
//            } else {
//
//            }
//        }
        return 0;

    }



    public int binarySearch(int[] nums , int target){
        int left = 0;
        int right = nums.length - 1;

        while (left <=  right){
            int mid = left +  (right - left) / 2;

            System.out.println(left);
            System.out.println(right);
            System.out.println(mid);
            System.out.println("");

            if (nums[mid] == target){

                return mid;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }

        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().binarySearch(new int[]{0, 1, 2, 4, 5, 6, 7, 8}, 7));
    }
}