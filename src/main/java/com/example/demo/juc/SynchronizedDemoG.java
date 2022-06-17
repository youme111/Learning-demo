package com.example.demo.juc;

import java.util.concurrent.TimeUnit;

/**
 * @description:
 * @author: huk
 * @create: 2022/6/8 22:19
 **/
public class SynchronizedDemoG {
    /**
     * 多线程的8锁
     * 7、一个普通同步方法，一个静态同步方法，同一部手机，请问先打印邮件还是短信？
     */
    public static void main(String[] args) throws InterruptedException {
        Phone7 phone = new Phone7();

        new Thread(() -> {
            try {
                phone.sendEmail();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }, "A").start();

        TimeUnit.SECONDS.sleep(1);

        new Thread(() -> {
            try {
                phone.sendSMS();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }, "B").start();

    }
}

class Phone7 {
    public static synchronized void sendEmail() throws Exception {
        TimeUnit.SECONDS.sleep(4);
        System.out.println("sendEmail");
    }

    public synchronized void sendSMS() {
        System.out.println("sendSMS");
    }
}
