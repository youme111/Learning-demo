package com.example.demo.ffloat;

import java.math.BigDecimal;
import java.util.Objects;

public class TestFloat {

    public static void main(String[] args) {
//        float a = 2.0f - 1.9f;
//        float b = 1.8f - 1.7f;
//        System.out.println(a);// 0.100000024
//        System.out.println(b);// 0.099999905
//        System.out.println(a == b);// false

        BigDecimal a = new BigDecimal("1.0");
        BigDecimal b = new BigDecimal("0.9");
        BigDecimal c = new BigDecimal("0.8");

        BigDecimal x = a.subtract(b);
        BigDecimal y = b.subtract(c);

        System.out.println(x); /* 0.1 */
        System.out.println(y); /* 0.1 */
        System.out.println(Objects.equals(x, y)); /* true */
    }
}
