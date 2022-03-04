package com.example.demo.ffloat;

public class TestAdd {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        for (int i = 0; i < 99; i++) {
            a = a ++;
            System.out.println("a=" + a);
            System.out.println("b=" + b);
            b = a ++;
        }
        System.out.println(a);
        System.out.println(b);
    }
}
