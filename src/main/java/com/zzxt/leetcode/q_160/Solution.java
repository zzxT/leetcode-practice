package com.zzxt.leetcode.q_160;

import com.zzxt.leetcode.bean.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> state = new HashSet<>();
        while (headA != null){
            state.add(headA);
            headA = headA.next;
        }


        while (headB != null){
            if (state.contains(headB)){
                return headB;
            }

            headB = headB.next;
        }

        return null;
    }
}