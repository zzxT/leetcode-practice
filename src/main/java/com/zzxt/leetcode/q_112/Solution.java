package com.zzxt.leetcode.q_112;

import com.zzxt.leetcode.bean.TreeNode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {


    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return  false;
        }
        return  dfs(root, targetSum);
    }

    public boolean dfs(TreeNode root, int targetSum) {
        if (root.left == null && root.right == null) {
            return root.val - targetSum == 0;
        }

        if (root.left != null && dfs(root.left, targetSum - root.val)) {
            return true;
        }


        return root.right != null && dfs(root.right, targetSum - root.val);

    }
}