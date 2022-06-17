package com.example.demo.likou;

import java.util.Scanner;

/**
 * @description:
 * @author: huk
 * @create: 2022/6/16 12:17
 **/
public class MainHj7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double s = scanner.nextDouble();
        scanner.close();

        double l = s - (int) s;
        if (l >= 0.5) {
            System.out.println((int) s + 1);
        } else {
            System.out.println((int) s);
        }
    }
}
