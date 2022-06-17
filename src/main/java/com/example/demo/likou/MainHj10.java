package com.example.demo.likou;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @description:
 * @author: huk
 * @create: 2022/6/17 13:43
 **/
public class MainHj10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 0 && c <= 127) {
                set.add(c);
            }
        }
        System.out.println(set.size());

        //执行效率慢
/*        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }
        long count = set.stream().filter(a -> a >= 0 && a <= 127).count();
        System.out.println(count);*/
    }
}
