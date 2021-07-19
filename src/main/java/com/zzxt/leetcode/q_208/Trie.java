package com.zzxt.leetcode.q_208;

import javafx.scene.transform.Rotate;

import java.util.*;

class Trie {

    /** Initialize your data structure here. */
    Node root;

    public Trie() {
        root = new Node(' ');
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        Node index = root;
        for (int i = 0; i < word.length(); i++) {
            char target = word.charAt(i);
            if (!index.children.containsKey(target)){
                Node newNode = new Node(target);
                newNode.parent = index;
                index.children.put(target, newNode);
                index = newNode;
            } else {
                index = index.children.get(target);
            }
        }

        index.ends++;

    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        Node index = root;
        for (int i = 0; i < word.length(); i++) {
            char target = word.charAt(i);

            if (index.children.containsKey(target)){
                index = index.children.get(target);
            } else {
                return false;
            }
        }

        return index.ends > 0;
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        Node index = root;
        for (int i = 0; i < prefix.length(); i++) {
            char target = prefix.charAt(i);

            if (index.children.containsKey(target)){
                index = index.children.get(target);
            } else {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("aabc");
        trie.insert("abef");
        System.out.println(trie.search("aabc"));
        System.out.println(trie.search("abef"));
        System.out.println(trie.search("abcd"));
        System.out.println(trie.startsWith("aa"));
    }
}

class Node{
    public char value;
    public Node parent;
    public int ends;
    public HashMap<Character, Node> children;

    public Node(char value) {
        this.value = value;
        children = new HashMap<>();
    }


}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */

