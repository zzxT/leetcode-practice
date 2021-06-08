package com.zzxt.leetcode.q_111;

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
// TODO: 2021/6/7
class Solution {

    Deque<TreeNode> deque = new LinkedList<>();

    int depth;

    public int minDepth(TreeNode root) {
        return 0;
    }

}
