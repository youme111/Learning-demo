package com.example.demo.likou;

import java.util.*;

/**
 * @description:
 * @author: huk
 * @create: 2022/6/17 14:09
 **/
public class MainHj14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String s = scanner.nextLine();
            list.add(s);
        }
        Collections.sort(list);
        list.forEach(System.out::println);
    }
}
