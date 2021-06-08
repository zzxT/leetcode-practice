package com.zzxt.leetcode;

public class Singleto {

    private static class SingleToHolder {
        private static Singleto singleto = new Singleto();
    }

    private Singleto() {

    }

    public static Singleto getInstance(){
        return SingleToHolder.singleto;
    }
}
