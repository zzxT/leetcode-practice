package com.zzxt.leetcode.q_146;

import java.util.HashMap;
import java.util.Map;

class LRUCache {

    int size;
    Map<Integer, Node> map;
    Node head;
    Node tail;

    public LRUCache(int capacity) {
        this.size = capacity;
        this.map = new HashMap<>(size);
    }

    public int get(int key) {
//        return map.getOrDefault(key, new Node(-1, -1)).value;
        if (map.containsKey(key)) {
            Node node = map.get(key);

            if (map.size() == 1){
                return node.value;
            }

            if (node == tail){
                tail = node.prev;
                tail.next = null;

                head.prev = node;
                node.next = head;
                head = node;
                head.prev = null;

                return node.value;
            }

            if (node != head) {
                node.prev.next = node.next;
                node.next.prev = node.prev;
                node.next = head;
                head.prev = node;
                head = node;
                head.prev = null;
            }

            return node.value;
        } else {
            return -1;
        }

    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            node.value = value;
            get(key);
        } else {
            Node node = new Node(key, value);
            if (map.size() == size) {
                map.remove(tail.key);

                if (map.size() == 0){
                    head = node;
                    tail = node;
                } else {
                    tail.prev.next = null;
                    tail = tail.prev;

                    node.next = head;
                    head.prev = node;
                    head = node;

                }

            } else {

                if (head != null) {
                    node.next = head;
                    head.prev = node;
                }
                head = node;

                if (tail == null) {
                    tail = node;
                }
            }

            map.put(key, node);

        }
    }

    public static void main(String[] args) {

//        ["LRUCache","put","put","put","put","get","get","get","get","put","get","get","get","get","get"]
//        [[3],[1,1],[2,2],[3,3],[4,4],[4],[3],[2],[1],[5,5],[1],[2],[3],[4],[5]]
        LRUCache lRUCache = new LRUCache(3);
        lRUCache.put(1, 1); // 缓存是 {1=1}
        lRUCache.put(2, 2); // 缓存是 {1=1, 2=2}
//        System.out.println(lRUCache.get(2));
        lRUCache.put(3, 3); // 该操作会使得关键字 2 作废，缓存是 {1=1, 3=3}
        lRUCache.put(4,4);
        System.out.println(lRUCache.get(4));
        System.out.println(lRUCache.get(3));
        System.out.println(lRUCache.get(2));
        System.out.println(lRUCache.get(1));
        lRUCache.put(5,5);
        System.out.println(lRUCache.get(1));
        System.out.println(lRUCache.get(2));
        System.out.println(lRUCache.get(3));
        System.out.println(lRUCache.get(4));
        System.out.println(lRUCache.get(5));
//        lRUCache.get(3);    // 返回 3
//        lRUCache.get(4);    // 返回 4


    }

}

class Node {
    public int key;
    public int value;
    public Node next;
    public Node prev;

    public Node(int key, int value) {
        this.key = key;
        this.value = value;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */

