package com.example.demo.juc;

import java.util.concurrent.Semaphore;

/**
 * @description:
 * @author: huk
 * @create: 2022/3/31 15:36
 **/
public class SemaphoreDemo {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(3);
        for (int i = 0; i < 6; i++) {
            new Thread(() -> {
                try {
                    semaphore.acquire(); // 获取一个许可
                    System.out.println(Thread.currentThread().getName() + " 抢到车位...");
                    Thread.sleep(3000);
                    System.out.println(Thread.currentThread().getName() + " 离开车位");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    semaphore.release(); // 释放一个许可
                }
            }).start();
        }
    }
}
