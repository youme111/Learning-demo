package com.example.demo.likou;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @description:
 * @author: huk
 * @create: 2022/6/13 20:37
 **/
public class Main93 {
    /*
   某学校举行运动会,学生们按编号（1、2、3.....n)进行标识,
   现需要按照身高由低到高排列，
   对身高相同的人，按体重由轻到重排列，
   对于身高体重都相同的人，维持原有的编号顺序关系。
   请输出排列后的学生编号
   输入描述：
      两个序列，每个序列由N个正整数组成，(0<n<=100)。
      第一个序列中的数值代表身高，第二个序列中的数值代表体重，
   输出描述：
      排列结果，每个数据都是原始序列中的学生编号，编号从1开始，
   实例一：
      输入:
       4
       100 100 120 130
       40 30 60 50
      输出:
       2134
   */
    static class Stu {
        int id;
        int h;
        int w;

        public Stu(int id, int h, int w) {
            this.id = id;
            this.h = h;
            this.w = w;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] height = scanner.nextLine().split(" ");
        String[] weight = scanner.nextLine().split(" ");
        scanner.close();

        List<Stu> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Stu stu = new Stu(i + 1, Integer.parseInt(height[i]), Integer.parseInt(weight[i]));
            list.add(stu);
        }

        StringBuilder builder = new StringBuilder();
        list.stream().sorted(((o1, o2) -> {
            if (o1.h == o2.h) {
                return o1.w - o2.w;
            } else {
                return o1.h - o2.h;
            }
        })).forEach(s -> builder.append(s.id));
        System.out.println(builder);
    }
}
