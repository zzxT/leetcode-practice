package com.zzxt.leetcode.q_143;

import com.zzxt.leetcode.bean.ListNode;

import java.util.ArrayList;
import java.util.List;

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
    public void reorderList(ListNode head) {

        ListNode index = head;

        List<ListNode> temp = new ArrayList<>();
        while (index != null) {
            temp.add(index);
            index = index.next;
        }
        int left = 0;
        int right = temp.size() - 1;
        ListNode last = null;
        while (left <= right) {
            if (last != null) {
                last.next = temp.get(left);
            }
            temp.get(left).next = temp.get(right);
            last = temp.get(right);
            left++;
            right--;
        }

        if ( last != null ){
            last.next = null;
        }
    }

    public static void main(String[] args) {
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;


        new Solution().reorderList(first);
    }
}