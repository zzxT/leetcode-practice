package com.zzxt.leetcode;

import com.zzxt.leetcode.bean.ListNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class q_19_remove_nth_node_from_end_the_list {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) { val = x; }
     * }
     */
    static class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {

            List<ListNode> listNodes = new ArrayList<ListNode>();
            ListNode index = head;
            while (index != null) {
                listNodes.add(index);
                index = index.next;
            }

            int prevIndex = listNodes.size() - n - 1;
            if (prevIndex < 0){

                ListNode next = head.next;
                head.next = null;
                return next;
            }

            ListNode prev = listNodes.get(prevIndex);

            prev.next = prev.next.next;

            return head;
        }
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(3);
        listNode.next = new ListNode(4);
        listNode.next.next = new ListNode(1);
        listNode.next.next.next = new ListNode(5);
        listNode = new Solution().removeNthFromEnd(listNode, 2);

        while (listNode != null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }


    }

}
