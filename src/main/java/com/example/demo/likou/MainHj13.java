package com.example.demo.likou;

import java.util.Scanner;

/**
 * @description:
 * @author: huk
 * @create: 2022/6/17 14:08
 **/
public class MainHj13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        StringBuilder builder = new StringBuilder();
        String[] arr = s.split(" ");
        for (int i = arr.length - 1; i >= 0 ; i--) {
            builder.append(arr[i]).append(" ");
        }

        System.out.println(builder.deleteCharAt(builder.length()-1));
    }
}
