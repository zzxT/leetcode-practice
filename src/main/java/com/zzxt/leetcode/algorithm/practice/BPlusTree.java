package com.zzxt.leetcode.algorithm.practice;

import java.util.ArrayList;
import java.util.List;

public class BPlusTree {

    int degree = 3;

    private BPlusNode  root;

    public BPlusTree() {

    }


    public BPlusTree(int degree) {
        this.degree = degree;
        this.root = null;
    }

    public void insert(int key, String value) {

        if (root == null) {
            BPlusNode nRoot = new BPlusNode();
            KV kv = new KV(key, value);
            nRoot.getKvs().add(kv);
            this.root = nRoot;
        } else if (root.getChildren().isEmpty() && root.getKvs().size() < (degree - 1)) {
            // 在根节点添加


        } else {

        }


    }


}


class BPlusNode {

    private List<KV> kvs = new ArrayList<>();

    private List<BPlusNode> children = new ArrayList<>();

    private boolean isLeaf;

    private BPlusNode prev;

    private BPlusNode next;

    private BPlusNode parent;


    public BPlusNode() {
    }

    public List<KV> getKvs() {
        return kvs;
    }

    public void setKvs(List<KV> kvs) {
        this.kvs = kvs;
    }

    public List<BPlusNode> getChildren() {
        return children;
    }

    public void setChildren(List<BPlusNode> children) {
        this.children = children;
    }

    public BPlusNode getPrev() {
        return prev;
    }

    public void setPrev(BPlusNode prev) {
        this.prev = prev;
    }

    public BPlusNode getNext() {
        return next;
    }

    public void setNext(BPlusNode next) {
        this.next = next;
    }

    public BPlusNode getParent() {
        return parent;
    }

    public void setParent(BPlusNode parent) {
        this.parent = parent;
    }

    public boolean isLeaf() {
        return isLeaf;
    }

    public void setLeaf(boolean leaf) {
        isLeaf = leaf;
    }

    @Override
    public String toString() {
        return "BPlusNode{" +
                "kvs=" + kvs +
                ", children=" + children +
                ", prev=" + prev +
                ", next=" + next +
                ", parent=" + parent +
                ", isLeaf=" + isLeaf +
                '}';
    }
}

class KV {
    private int key;
    private String value;

    public KV(int key, String value) {
        this.key = key;
        this.value = value;
    }
}


class BPlusLeaf {

}