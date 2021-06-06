package com.zzxt.leetcode.q_278;/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

import java.security.cert.TrustAnchor;

public class Solution  {
    public int firstBadVersion(int n) {
        if (n == 1){
            return n;
        }

        if (isBadVersion(1)){
            return 1;
        }

        int left = 1;
        int right = n;
        while ((right - left) !=  1) {

            int mid = left + ((right - left) >> 1);

            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid;
            }

        }

        return right;
    }


    boolean isBadVersion(int version) {
        return true;
    }


    public static void main(String[] args) {
        int a = 2126753390;
        int b = a / 2;

        int c = a + b ;
        System.out.println(c);

    }
}