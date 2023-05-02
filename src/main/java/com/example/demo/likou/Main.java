package com.example.demo.likou;

import java.util.*;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        Map<String, Integer> map = new HashMap<>();
//        Scanner in = new Scanner(System.in);
//        // 注意 hasNext 和 hasNextLine 的区别
//        while (in.hasNextLine()) { // 注意 while 处理多个 case
//            String[] temp = in.nextLine().split("\\\\");
//            String fileName = temp[temp.length -1].split(" ")[0];
//            String key = fileName.length() > 16 ? temp[temp.length -1].substring(fileName.length() - 16) : temp[temp.length -1];
//            map.put(key, map.getOrDefault(key, 0) + 1);
//            if (map.getOrDefault(key, 0) == 1) {
//                list.add(key);
//            }
//        }
//        int start = 0;
//        if (list.size() > 8) {
//            start = list.size() - 8;
//        }
//        for (int i = start; i < list.size(); i++) {
//            System.out.println(list.get(i) + " " + map.get(list.get(i)));
//        }


        Stack<String> stack = new Stack<>();
        stack.push("1");
        stack.push("2");
        stack.push("3");
        stack.push("4");
        stack.push("5");
        int len = stack.size();
        for (int i = 0; i < len; i++) {
            System.out.println(stack.pop());
        }
    }
}

