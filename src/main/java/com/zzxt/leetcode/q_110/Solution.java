package com.zzxt.leetcode.q_110;

import com.zzxt.leetcode.bean.TreeNode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    boolean result = true;
    public boolean isBalanced(TreeNode root) {

        fetch(root);
        return result;
    }


    public int fetch(TreeNode root){
        if (root == null){
            return 0;
        }


        int left = fetch(root.left) + 1;
        int right = fetch(root.right) + 1;


        if (Math.abs(left- right) > 1){
            result = false;
        }


        return Math.max(left, right);
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode();
        TreeNode left = new TreeNode();
        root.left = left;
        System.out.println(new Solution().isBalanced(root));
    }
}