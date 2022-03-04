package com.example.demo.thread;

public class InterruptExample {

    private static class MyThread2 extends Thread {
        @Override
        public void run() {
            while (!interrupted()) {
                System.out.println("--------!interrupted()");
            }
            System.out.println("Thread end");
        }
    }

    public static void main(String[] args) {
        Thread myThread2 = new MyThread2();
        myThread2.start();
        myThread2.interrupt();

    }
}
