package com.example.demo.likou;

import java.util.Scanner;

/**
 * @description:
 * @author: huk
 * @create: 2022/6/17 14:18
 **/
public class MainHj15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        String s = Integer.toBinaryString(i);

        String str = s.replaceAll("1", "");
        System.out.println(s.length() - str.length());
    }
}
