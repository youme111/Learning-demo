package com.example.demo.thread;

public class TestSleep {

    public static void main(String[] args) {

        new Thread(() -> {
            for (int i = 0; i < 30; i++) {
                System.out.println(Thread.currentThread().getName() + "-----" + i);
                if (i == 20) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }, "线程1").start();

        new Thread(() -> {
            for (int i = 0; i < 30; i++) {
                System.out.println(Thread.currentThread().getName() + "-----" + i);
                if (i == 20) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }, "线程2").start();
    }
}
