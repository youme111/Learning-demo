package com.example.demo.test;

/**
 * @description:
 * @author: huk
 * @create: 2022/7/8 19:20
 **/
public class A {

    public void test(int a) {
        System.out.println("A的a方法被调用了");
        testA(a);
    }

    static class B extends A {

        public void bTest(int b) {
            test(b);
        }
    }

    public void testA(int a) {
        System.out.println(111111);
    }
}
