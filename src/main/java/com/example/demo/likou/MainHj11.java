package com.example.demo.likou;

import java.util.Scanner;

/**
 * @description:
 * @author: huk
 * @create: 2022/6/17 13:59
 **/
public class MainHj11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        StringBuilder builder = new StringBuilder();
        for (int i = s.length() - 1; i >= 0 ; i--) {
            builder.append(s.charAt(i));
        }

        System.out.println(builder);
    }
}
