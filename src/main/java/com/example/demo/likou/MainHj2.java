package com.example.demo.likou;

import java.util.Scanner;

/**
 * @description:
 * @author: huk
 * @create: 2022/6/14 16:53
 **/
public class MainHj2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine().toLowerCase();
        String s = in.nextLine().toLowerCase();
        in.close();
        int count = 0;
//        for (int i = 0; i < word.length(); i++) {
//            char c = word.charAt(i);
//            if (s.equals(String.valueOf(c))) {
//                count++;
//            }
//        }
        s = word.replaceAll(s, "");
        count = word.length() - s.length();
        System.out.println(count);
    }
}
