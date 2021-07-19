package com.zzxt.leetcode.q_101;

import com.zzxt.leetcode.bean.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

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

    boolean result = true;

    public boolean isSymmetric(TreeNode root) {

        if (root == null){
            return result;
        }

        traversal(root.left, root.right);
        return result;
    }


    public void traversal(TreeNode left, TreeNode right){

        if (left == null && right == null){
            return;
        }


        if (left == null || right == null){
            result = false;
            return;
        }

        if (left.val != right.val){
            result = false;
            return;
        }

        traversal(left.left, right.right);
        traversal(left.right, right.left);

    }



}