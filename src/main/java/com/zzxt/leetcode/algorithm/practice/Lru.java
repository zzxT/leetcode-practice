package com.zzxt.leetcode.algorithm.practice;

import java.util.HashMap;
import java.util.Map;

public class Lru {
    private Map<Integer, Node> map;
    private int size;
    private int capacity;
    private Node first;
    private Node last;


    public Lru(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>(capacity);
    }

    public Integer get(Integer key) {
        if (map.containsKey(key)){
            Node node = map.get(key);
            node.prev.next = node.next;

            first.prev = node;
            node.next = first;

            first = node;
            return node.value;
        }

        return null;
    }

    public void put(Integer key, Integer value) {
        if (map.size() >= capacity) {
            map.remove(last.key);
            last.prev.next = null;
            last = last.prev;
        }

        Node node = new Node(key, value, first, null);
//        node.prev = node;
        if (map.size() == 0) {
            last = node;
        } else {
            first.prev = node;
        }

        first = node;
        map.put(key, node);
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Node index = first;
        while (index != null) {
             stringBuilder.append(String.format("key is %s value is %s \n", index.key, index.value));
             index = index.next;
        }
        return stringBuilder.toString();
    }


    public static void main(String[] args) {
        Lru lru = new Lru(10);
        lru.put(1, 2);

        lru.put(2,3);

        lru.put(3,4);

        lru.put(4,5);
        lru.put(5,6);
        lru.put(6,7);
        lru.put(7,8);

        System.out.println(lru.get(1));
        System.out.println(lru.toString());
        System.out.println(lru.get(2));
        System.out.println(lru.get(5));
        System.out.println(lru.toString());

    }

}


class Node {
    int key;
    int value;
    Node next;
    Node prev;


    public Node(int key, int value, Node next, Node prev) {
        this.key = key;
        this.value = value;
        this.next = next;
        this.prev = prev;
    }
}




