package com.zzxt.leetcode;

public class SingleClass {


    private SingleClass(){

    }


    public static SingleClass getInstance(){
        return  Holder.Instance;
    }

    private static class Holder{
        private static final SingleClass Instance = new SingleClass();
    }
}



