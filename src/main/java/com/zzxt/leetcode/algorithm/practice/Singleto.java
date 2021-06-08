package com.zzxt.leetcode.algorithm.practice;

public class Singleto {

    private static class SingleHolder {
        private static Singleto singleto = new Singleto();
    }

    private Singleto() {

    }

    public static Singleto getInstantce() {
        return SingleHolder.singleto;
    }

    private volatile static Singleto singleto = null;

    public Singleto getSingleto() {
        if (singleto == null) {
            synchronized (Singleto.class) {
                if (singleto == null) {
                    singleto = new Singleto();
                }
            }
        }

        return  singleto;
    }


}


