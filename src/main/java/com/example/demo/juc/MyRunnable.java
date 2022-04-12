package com.example.demo.juc;

import java.util.Date;

/**
 * @description:
 * @author: huk
 * @create: 2022/3/29 9:04
 **/
public class MyRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Start. Time = " + new Date());
        System.out.println(Thread.currentThread().getName() + " End. Time = " + new Date());
    }
}
