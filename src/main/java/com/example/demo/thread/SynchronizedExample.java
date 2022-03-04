package com.example.demo.thread;

import java.util.concurrent.*;

public class SynchronizedExample {
    public void func1() {
        synchronized (this) {
            for (int i = 0; i < 10; i++) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        SynchronizedExample e1 = new SynchronizedExample();
        TimeUnit unit;
        BlockingQueue workQueue;
        ExecutorService pool = new ThreadPoolExecutor(0, Integer.MAX_VALUE,
                60L, TimeUnit.SECONDS,
                new SynchronousQueue<Runnable>());

        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(() -> e1.func1());
        executorService.execute(() -> e1.func1());
    }
}
