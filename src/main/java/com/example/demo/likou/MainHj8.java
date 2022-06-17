package com.example.demo.likou;

import java.util.*;

/**
 * @description:
 * @author: huk
 * @create: 2022/6/16 13:11
 **/
public class MainHj8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        Map<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            String[] arr = s.split(" ");
            int key = Integer.parseInt(arr[0]);
            int value = Integer.parseInt(arr[1]);
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + value);
            } else {
                map.put(key, value);
            }
        }

        map.keySet().forEach(s -> {
            System.out.println(s + " " + map.get(s));
        });
//        map.keySet().stream().sorted(Comparator.comparingInt(Integer::intValue))
//                .forEach(s -> {
//                    System.out.println(s + " " + map.get(s));
//                });
    }
}
