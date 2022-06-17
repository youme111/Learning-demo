package com.example.demo.likou;

import java.util.*;

/**
 * @description:
 * @author: huk
 * @create: 2022/6/14 17:11
 **/
public class MainHj3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());

//        Set<Integer> set = new TreeSet<>();
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(in.nextLine());
            list.add(num);
        }
        in.close();

//        set.forEach(System.out::println);
        list.stream().distinct().sorted(Comparator.comparingInt(Integer::intValue)).forEach(System.out::println);
    }
}
