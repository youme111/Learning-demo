package com.example.demo.likou;

import java.util.*;

/**
 * @description:
 * @author: huk
 * @create: 2022/6/18 14:06
 **/
public class MainHj19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
Set set= new HashSet();
        List<String> list = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        while (scanner.hasNextLine()) {
            String s = scanner.nextLine();
            String[] strArr = s.split(" ");
            String[] pathArr = strArr[0].split("\\\\");
            String pathStr = pathArr[pathArr.length - 1];
            if (pathStr.length() > 16) {
                pathStr = pathStr.substring(pathArr[pathArr.length - 1].length() - 16);
            }
            String key = pathStr + " " + strArr[1];
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
