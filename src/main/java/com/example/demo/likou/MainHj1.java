package com.example.demo.likou;

import java.util.Scanner;

/**
 * @description:
 * @author: huk
 * @create: 2022/6/14 16:21
 **/
public class MainHj1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        in.close();
        String[] s1 = s.split(" ");
        System.out.println(s1[s1.length - 1].length());
    }
}
