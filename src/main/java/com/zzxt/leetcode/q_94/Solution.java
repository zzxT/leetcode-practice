package com.zzxt.leetcode.q_94;

import com.zzxt.leetcode.bean.TreeNode;

import java.util.ArrayList;
import java.util.List;

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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        fetch(result,root);
        return result;
    }

    public void fetch(List<Integer> result, TreeNode node) {
        if (node == null) {
            return;
        }

        fetch(result, node.left);
        result.add(node.val);
        fetch(result, node.right);
    }


    // iterator
    public List<Integer> inorderTraversalIterator(TreeNode root) {
        List<Integer> result = new ArrayList<>();


        while (root != null) {

        }

        return result;
    }
}