package com.zzxt.leetcode.q_98;

import com.zzxt.leetcode.bean.TreeNode;

import java.time.temporal.ValueRange;

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
    double prev = -Double.MAX_VALUE;

    public boolean isValidBST(TreeNode node) {

        if (node.left == null && node.right == null){
             return  result;
        }

        traversal(node);
        return result;
    }


    public void traversal(TreeNode node){
        if (node == null || !result){
            return;
        }

        traversal(node.left);
        if (node.val <= prev){
            result = false;
        }
        prev = node.val;

        traversal(node.right);
    }
}