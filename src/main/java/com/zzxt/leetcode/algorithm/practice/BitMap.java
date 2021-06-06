package com.zzxt.leetcode.algorithm.practice;

import java.util.Arrays;

public class BitMap {
    private char[] bytes;
    private int nbits;

    public BitMap(int nbits) {
        this.nbits = nbits;
        this.bytes = new char[nbits/16 + 1];
    }


    public void set(int k){
        if (k < 0 || k > nbits) {
            return;
        }

        int byteIndex = k / 16;
        int bitIndex = k % 16;

        bytes[byteIndex] |=  (1 << bitIndex);
    }


    public boolean get(int k) {
        if (k < 0 || k > nbits) {
            return false;
        }

        int byteIndex = k / 16;
        int bitIndex = k % 16;


        return  (bytes[byteIndex]  &  (1 << bitIndex)) != 0;
    }


    public void toSString() {
        for (int i = 0; i < bytes.length; i++) {
            for (int j = 0; j < 16; j++) {
                boolean i1 = ((bytes[i] >> j )  & 1 ) == 1;
                System.out.println(String.format("index %s %s ", (i * 16 + j ), i1));
            }
        }
    }

    public static void main(String[] args) {
        BitMap bitMap = new BitMap(100);
        bitMap.set(20);
        System.out.println(bitMap.get(20));

        bitMap.toSString();
    }
}
