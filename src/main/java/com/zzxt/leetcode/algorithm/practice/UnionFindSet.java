package com.zzxt.leetcode.algorithm.practice;

public class UnionFindSet {

    private int[] p = new int[10];

    public int find(int x){
        if (p[x] != x){
            p[x] = find(p[x]);
        }
        return x;
    }


    public void init(){
        for (int i = 0; i < p.length; i++) {
            p[i] = i;
        }
    }


    public void union(int x, int y){
        p[find(x)] = find(y);
    }



}
