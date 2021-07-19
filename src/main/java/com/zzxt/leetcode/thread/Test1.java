package com.zzxt.leetcode.thread;

public class Test1 {
  private long count = 0;
  private void add10K() {
    int idx = 0;
    while(idx++ < 100000) {
      count += 1;
    }
  }
  public long calc() throws InterruptedException {

    // 创建两个线程，执行add()操作
    Thread th1 = new Thread(()->{
      this.add10K();
    });
    Thread th2 = new Thread(()->{
      this.add10K();
    });
    // 启动两个线程
    th1.start();
    th2.start();
    // 等待两个线程执行结束
    th1.join();
    th2.join();
    return count;
  }

  public static void main(String[] args) throws InterruptedException {
    Test1 test = new Test1();

    System.out.println(test.calc());
  }
}