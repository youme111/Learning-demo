package com.example.demo.ffloat;

public class Test {
    public static void main(String[] args) {
        int a = 0;
        for (int i = 0; i < 99; i++) {
            a = a ++;
        }
        System.out.println(a);

        int b = 0;
        for (int i = 0; i < 99; i++) {
            b = ++ b;
        }
        System.out.println(b);

    }
}
