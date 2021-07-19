package com.zzxt.leetcode.q_104;

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

    int maxDepth = 0;

    public int maxDepth(TreeNode root) {
            dfs(root, 0);
            return maxDepth;
    }


    public void dfs(TreeNode root, int level){
        if (root == null){
            maxDepth = Math.max(maxDepth, level);
            return;
        }

        level++;
        dfs(root.left, level);
        dfs(root.right, level);
    }
}