package com.example.demo.ffloat;

public class TestAdd2 {
    public static void main(String[] args) {
//        int a = 2;
//        int b = (3 * a++) + a;
//        System.out.println(b);

        int a = 2;
        int b = a + (3 * a++);
        System.out.println(b);

        int i = 1;
        int j = 1;
        int k = i++ + ++i + ++j + j++;
        System.out.println(k);


    }
}
