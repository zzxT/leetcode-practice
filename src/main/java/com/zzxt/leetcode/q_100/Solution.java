package com.zzxt.leetcode.q_100;

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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        List<Integer> resultOne = fetch(p);
        List<Integer> resultTwo = fetch(q);

        return resultTwo.equals(resultOne);
    }

    public List<Integer> fetch(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        look(result, root);
        return result;
    }

    public void look(List<Integer> result, TreeNode root) {
        if (root == null) {
            result.add(null);
            return;
        }

        result.add(root.val);
        look(result, root.left);
        look(result, root.right);
    }
}