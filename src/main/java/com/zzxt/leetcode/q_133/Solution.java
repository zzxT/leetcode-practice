package com.zzxt.leetcode.q_133;

import java.util.*;

// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}

class Solution {
    Map<Integer, Node>  data = new HashMap<>();
    public Node cloneGraph(Node node) {

        if (node == null){
            return null;
        }
        Node newNode;
        if (data.containsKey(node.val)){
            newNode = data.get(node.val);
            return newNode;
        } else {
            newNode = new Node(node.val);
            data.put(node.val, newNode);
        }

        for (int i = 0; i < node.neighbors.size(); i++) {
            newNode.neighbors.add(cloneGraph(node.neighbors.get(i)));
        }

        return newNode;
    }


    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        node1.neighbors.add(node2);
        node2.neighbors.add(node1);
        Node newNode = new Solution().cloneGraph(node1);
    }
}