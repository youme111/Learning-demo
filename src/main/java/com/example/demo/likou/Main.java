package com.example.demo.likou;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextLine()) { // 注意 while 处理多个 case
            String[] temp = in.nextLine().split("\\\\");
            String fileName = temp[temp.length -1].split(" ")[0];
            String key = fileName.length() > 16 ? temp[temp.length -1].substring(fileName.length() - 16) : temp[temp.length -1];
            map.put(key, map.getOrDefault(key, 0) + 1);
            if (map.getOrDefault(key, 0) == 1) {
                list.add(key);
            }
        }
        int start = 0;
        if (list.size() > 8) {
            start = list.size() - 8;
        }
        for (int i = start; i < list.size(); i++) {
            System.out.println(list.get(i) + " " + map.get(list.get(i)));
        }
    }
}

