package com.example.demo.thread;

import java.util.ArrayList;
import java.util.List;

public class TestVolatile {

    class VolatileFeaturesExample {
        volatile long vl = 0L;    //使用volatile声明64位的long型变量

        public void setVl(long l) {
            vl = l;               //单个volatile变量的写
        }

        public void getAndIncrement() {
            vl++;                 //复合（多个）volatile变量的读/写
        }

        public long getVl() {
            return vl;            //单个volatile变量的读
        }
    }

    class SynchronizedFeaturesExample {
        long vl = 0L;    //声明64位的long型普通变量

        public synchronized void setVl(long l) {
            vl = l;               //单个普通变量的写用锁同步
        }

        public void getAndIncrement() {
            long temp = getVl();        //调用已同步的读方法
            temp += 1L;                 //普通写操作
            setVl(temp);                //调用已同步的写方法
        }

        public synchronized long getVl() {
            return vl;            //单个普通变量的读用锁同步
        }
    }

    public static void main(String[] args) {
        VolatileFeaturesExample volatileFeaturesExample = new TestVolatile().new VolatileFeaturesExample();
        SynchronizedFeaturesExample synchronizedFeaturesExample = new TestVolatile().new SynchronizedFeaturesExample();

        List<Thread> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Thread thread = new Thread(() -> {
                volatileFeaturesExample.getAndIncrement();
                synchronizedFeaturesExample.getAndIncrement();
            });
            list.add(thread);
        }

        for (Thread thread : list) {
            thread.start();
        }

        for (Thread t : list) {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("volatileFeaturesExample-------" + volatileFeaturesExample.getVl());
        System.out.println("synchronizedFeaturesExample-------" + synchronizedFeaturesExample.getVl());
    }
}
