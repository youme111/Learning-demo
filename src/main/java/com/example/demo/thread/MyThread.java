package com.example.demo.thread;

public class MyThread extends Thread {

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
            System.out.println("Thread run");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new MyThread();
        thread1.start();
        thread1.interrupt();
        System.out.println("Main run");
    }
}
