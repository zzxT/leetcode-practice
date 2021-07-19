package com.zzxt.leetcode.thread;

public class threadAdd {

    public long count = 0;
    public  void add1000() {
        for (int i = 0; i < 1000; i++) {
            count += 1;
        }
    }


    public static void main(String[] args) throws InterruptedException {
        threadAdd threadAdd = new threadAdd();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                threadAdd.add1000();
            }
        });
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                threadAdd.add1000();
            }
        });

        thread.start();
        thread1.start();


        thread.join();
        thread1.join();

        System.out.println(threadAdd.count);
    }

}
