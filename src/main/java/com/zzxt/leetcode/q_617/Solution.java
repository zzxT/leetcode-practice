package com.zzxt.leetcode.q_617;

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

    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null){
            return root2;
        }

        if (root2 == null){
            return root1;
        }


        TreeNode result = new TreeNode(root1.val + root2.val);

        result.left = mergeTrees(root1.left, root2.left);
        result.right = mergeTrees(root1.right, root2.right);

        return result;
    }


    public void traversal(TreeNode root1, TreeNode root2){
        if (root1 == null && root2 == null){
            return;
        }

        if (root1 != null && root2 != null) {
            root1.val += root2.val;
        }


        if (root1 == null){
            root1 = new TreeNode(root2.val);
        }

        if (root2 == null){
            return;
        }

        traversal(root1.left, root2.left);
        traversal(root1.right, root2.right);
    }

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(1);
        TreeNode root11 = new TreeNode(3);
        TreeNode root12 = new TreeNode(2);
        TreeNode root13 = new TreeNode(5);

        root1.left= root11;
        root1.right = root12;
        root11.left = root13;

        TreeNode root2 = new TreeNode(2);
        TreeNode root21 = new TreeNode(1);
        TreeNode root22 = new TreeNode(3);
        TreeNode root23 = new TreeNode(4);
        TreeNode root24 = new TreeNode(7);


        root2.left = root21;
        root2.right = root22;

        root21.right = root23;

        root22.right = root24;

        TreeNode treeNode = new Solution().mergeTrees(root1, root2);
    }
}