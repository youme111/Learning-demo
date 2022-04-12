package com.example.demo.designpatterns;

/**
 * @description:
 * @author: huk
 * @create: 2022/3/30 10:39
 **/
public class Singleton {
    //懒汉式
    private static volatile Singleton singleton;
    //私有构造方法
    private Singleton() {

    };

    private static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

    private static class SingletonHolder {
        private static final Singleton instance = new Singleton();
    }

    private static Singleton getSingleton() {
        return SingletonHolder.instance;
    }
}
