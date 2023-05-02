package com.example.demo.test;

/**
 * @description:
 * @author: huk
 * @create: 2022/7/8 19:23
 **/
public class C extends A{

    public void cTest(int c) {
        test(c);
    }

    public void testA(int c) {
        System.out.println("C调用testA方法");
    }

    public static void main(String[] args) {
        A c = new C();
        c.test(1);
    }
}
