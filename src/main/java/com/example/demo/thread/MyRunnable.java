package com.example.demo.thread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.out.println(Thread.currentThread().getName() + "------MyRunnable");
    }

    public static void main(String[] args) {
//        MyRunnable myRunnable = new MyRunnable();
//        //创建Thread实例，调用start()启动线程
//        Thread thread = new Thread(myRunnable);
//        thread.start();

        ExecutorService executorService = Executors.newFixedThreadPool(3);
//        for (int i = 0; i < 5; i++) {
//            executorService.execute(new MyRunnable());
//        }
        executorService.execute(new MyRunnable());
        executorService.execute(new MyRunnable());
        executorService.execute(new MyRunnable());
        executorService.execute(new MyRunnable());
        executorService.execute(new MyRunnable());
        executorService.shutdown();
    }
}
