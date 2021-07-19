package com.zzxt.leetcode.q_206;

import com.zzxt.leetcode.bean.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {

    public ListNode reverseList(ListNode head) {
        ListNode last = null;
        ListNode current = head;
        ListNode temp;
        while (current  != null){
             temp = current.next;
             current.next = last;
             last = current;
             current = temp;
        }

        return last;
    }



}