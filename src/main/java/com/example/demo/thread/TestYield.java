package com.example.demo.thread;

public class TestYield {

    public static void main(String[] args) {

        new Thread(() -> {
            for (int i = 0; i < 50; i++) {
                System.out.println("" + Thread.currentThread().getName() + "-----" + i);
                // 当i为30时，该线程就会把CPU时间让掉，让其他或者自己的线程执行（也就是谁先抢到谁执行）
                if (i == 30) {
                    Thread.yield();
                }
            }
        }, "线程1").start();

        new Thread(() -> {
            for (int i = 0; i < 50; i++) {
                System.out.println("" + Thread.currentThread().getName() + "-----" + i);
                // 当i为30时，该线程就会把CPU时间让掉，让其他或者自己的线程执行（也就是谁先抢到谁执行）
                if (i == 30) {
                    Thread.yield();
                }
            }
        }, "线程2").start();
    }
}
