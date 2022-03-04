package com.example.demo.thread;

public class DeadLockDemo {
    private static Resource1 resource1 = new Resource1();//资源 1
    private static Resource1 resource2 = new Resource1();//资源 2

    public static void main(String[] args) {
        new Thread(() -> {
            synchronized (resource1) {
                resource1.setName("resource1");
                System.out.println(Thread.currentThread().getName() + " get " + resource1.getName());
                try {
                    //执行了Thread.sleep()方法，当前线程放弃CPU，开始睡眠，在睡眠中不会释放锁。
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread().getName() + " 睡眠了1s---- " + resource1.getName());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                //在执行同步代码块的过程中，执行了锁所属对象的wait()方法，这个线程会释放锁，进行对象的等待池。
//                try {
//                    System.out.println(Thread.currentThread().getName() + " 释放了---- " + resource1.getName());
//                    resource1.wait();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }

                System.out.println(Thread.currentThread().getName() + " waiting get resource2 ");
//                resource1.notify();
                synchronized (resource2) {
                    resource2.setName("resource2");
                    System.out.println(Thread.currentThread().getName() + " get " + resource2.getName());
                }
            }
        }, "线程 1").start();

        new Thread(() -> {
            synchronized (resource2) {
                resource2.setName("resource2");
                System.out.println(Thread.currentThread().getName() + " get " + resource2.getName());
                try {
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread().getName() + " 睡眠了1s---- " + resource2.getName());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                //在执行同步代码块的过程中，执行了锁所属对象的wait()方法，这个线程会释放锁，进行对象的等待池。
//                try {
//                    System.out.println(Thread.currentThread().getName() + " 释放了---- " + resource2.getName());
//                    resource2.wait();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
                System.out.println(Thread.currentThread().getName() + " waiting get resource1 ");
                synchronized (resource1) {
                    resource1.setName("resource1");
                    System.out.println(Thread.currentThread().getName() + " get " + resource1.getName());
                }
            }
        }, "线程 2").start();

        new Thread(() -> {
            resource1.setName("3333");
            System.out.println(Thread.currentThread().getName() + " get " + resource1.getName());
            resource2.setName("4444");
            System.out.println(Thread.currentThread().getName() + " get " + resource2.getName());
        }, "线程3").start();
    }
}
