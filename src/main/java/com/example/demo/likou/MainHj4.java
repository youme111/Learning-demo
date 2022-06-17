package com.example.demo.likou;

import java.util.Scanner;

/**
 * @description:
 * @author: huk
 * @create: 2022/6/14 17:11
 **/
public class MainHj4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        in.close();

        int i = s.length() / 8;

        StringBuilder builder = new StringBuilder(s.substring(i * 8));
        while (builder.length() < 8 && s.length() % 8 > 0) {
            builder.append("0");
        }
        String str = s.substring(0, i * 8) + builder;
        int k = 0;
        for (int j = 0; j < str.length() / 8; j++) {
            System.out.println(str.substring(k, k + 8));
            k = k + 8;
        }

    }
}
