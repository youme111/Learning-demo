package com.example.demo.designpatterns;

/**
 * @description:
 * @author: huk
 * @create: 2022/3/30 14:17
 **/
public class PrototypeTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        RealizeType r1 = new RealizeType();
        RealizeType r2 = r1.clone();

        System.out.println("对象r1和r2是同一个对象？" + (r1 == r2));
    }
}

