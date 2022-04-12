package com.example.demo.juc;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.LockSupport;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadDemo {

    public static void main(String[] args) throws InterruptedException {

        int i = 0;
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {

                while (true) {
                    LockSupport.park();
                    System.out.println(1);
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {

                while (true) {
                    LockSupport.park();
                    System.out.println(2);
                }
            }
        });
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    LockSupport.park();
                    System.out.println(3);
                }

            }
        });

        thread1.start();
        thread2.start();
        thread3.start();
        while (true) {

            if (i % 3 == 0) {
                LockSupport.unpark(thread1);
            } else if (i % 3 == 1) {
                LockSupport.unpark(thread2);
            } else if (i % 3 == 2) {
                LockSupport.unpark(thread3);
            }
            i++;
            Thread.currentThread().sleep(1000);
        }



    }


}
