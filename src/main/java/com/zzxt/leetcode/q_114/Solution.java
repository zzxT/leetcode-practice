package com.zzxt.leetcode.q_114;

import com.zzxt.leetcode.bean.TreeNode;

import javax.xml.soap.Node;

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

    TreeNode head = null;
    TreeNode parent = null;
    public void flatten(TreeNode root) {

        if (root == null){
            return;
        }

        traversal(root);
        root.left = null;
        root.right = head.right;
    }

    public void traversal(TreeNode node){
        if (node == null){
            return;
        }


        TreeNode current = new TreeNode(node.val);
        if (parent != null){
            parent.right = current;
        } else {
            head  = current;
        }
        parent = current;
        traversal(node.left);
        traversal(node.right);
    }

    public static void main(String[] args) {
//        [1,2,5,3,4,null,6]
        TreeNode root = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode five = new TreeNode(5);
        TreeNode three = new TreeNode(3);
        TreeNode four = new TreeNode(4);
        TreeNode six = new TreeNode(6);

        root.left = second;
        root.right = five;

        second.left = three;
        second.right = four;

        five.right = six;

        new Solution().flatten(root);
    }
}