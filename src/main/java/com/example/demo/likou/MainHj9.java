package com.example.demo.likou;

import java.util.*;

/**
 * @description:
 * @author: huk
 * @create: 2022/6/16 14:55
 **/
public class MainHj9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        StringBuilder builder = new StringBuilder();

        Set<String> set = new LinkedHashSet<>();
        for (int i = s.length() - 1; i >= 0; i--) {
            set.add(String.valueOf(s.charAt(i)));
        }
        set.forEach(builder::append);



/*        List<String> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            list.add(String.valueOf(s.charAt(i)));
        }
        Collections.reverse(list);
        list.stream().distinct().forEach(builder::append);*/
        System.out.println(builder);
    }
}
