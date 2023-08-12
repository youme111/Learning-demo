package com.example.demo.test;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> originalList = new ArrayList<>();
        originalList.add(1);
        originalList.add(2);
        originalList.add(3);
        originalList.add(5);
        originalList.add(6);
        originalList.add(8);

        List<Integer> consecutiveList = new ArrayList<>();
        List<Integer> nonConsecutiveList = new ArrayList<>();

        int previousValue = originalList.get(0);
        consecutiveList.add(previousValue);
        for (int i = 1; i < originalList.size(); i++) {
            int currentValue = originalList.get(i);

            if (currentValue == previousValue + 1) {
                consecutiveList.add(currentValue);
            } else {
                if (i == 1) {
                    consecutiveList.remove(0);
                }
                nonConsecutiveList.add(currentValue);
            }

            previousValue = currentValue;
        }

        System.out.println("连续的数据：" + consecutiveList);
        System.out.println("不连续的数据：" + nonConsecutiveList);
    }
}
