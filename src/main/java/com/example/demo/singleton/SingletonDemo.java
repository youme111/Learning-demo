package com.example.demo.singleton;

/**
 * @author 18085
 */
public class SingletonDemo {

    //1.构造方法私有化
    private SingletonDemo() {
    }

    //2.实例化私有静态变量
    private static SingletonDemo instance = new SingletonDemo();

    //3.提供public static方法给外界访问
    public static SingletonDemo getInstance() {
        return instance;
    }
}
