package com.example.demo.juc;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @description:
 * @author: huk
 * @create: 2022/6/8 21:59
 **/
public class ProducerConsumerPlus {
    /**
     * 题目：现在四个线程，可以操作初始值为0的一个变量
     * 实现两个线程对该变量 + 1，两个线程对该变量 -1
     * 实现交替10次
     * <p>
     * 诀窍：
     * 1. 高内聚低耦合的前提下，线程操作资源类
     * 2. 判断 、干活、通知
     * 3. 多线程交互中，必须要防止多线程的虚假唤醒，即（判断不能用if，只能用while）
     */

    public static void main(String[] args) {
        Data2 data = new Data2();

        //A线程增加
        new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                try {
                    data.increment();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "A").start();

        //B线程减少
        new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                try {
                    data.decrement();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "B").start();

        new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                try {
                    data.increment();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "C").start();

        new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                try {
                    data.decrement();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "D").start();
    }
}

class Data2 {
    private int number = 0;
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void increment() throws InterruptedException {

        lock.lock();
        try {
            // 判断该不该这个线程做
            while (number != 0) {
                condition.await();
            }
            // 干活
            number++;
            System.out.println(Thread.currentThread().getName() + "\t" + number);
            // 通知
            condition.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void decrement() throws InterruptedException {
        lock.lock();
        try {
            // 判断该不该这个线程做
            while (number == 0) {
                condition.await();
            }
            // 干活
            number--;
            System.out.println(Thread.currentThread().getName() + "\t" + number);
            // 通知
            condition.signalAll();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

}
