package com.example.demo.likou;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @description:
 * @author: huk
 * @create: 2022/6/9 15:48
 **/
public class Main103 {
    /*
  小组中每位都有一张卡片
  卡片是6位以内的正整数
  将卡片连起来可以组成多种数字
  计算组成的最大数字

  输入描述：
    ","分割的多个正整数字符串
    不需要考虑非数字异常情况
    小组种最多25个人

   输出描述：
     最大数字字符串

   示例一
     输入
      22,221
     输出
      22221

    示例二
      输入
        4589,101,41425,9999
      输出
        9999458941425101
   */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nums = in.nextLine();
        in.close();

        StringBuilder builder = new StringBuilder();

        String[] split = nums.split(",");
        Arrays.stream(split).sorted((s1, s2) -> {
                    char[] v1 = s1.toCharArray();
                    char[] v2 = s2.toCharArray();
                    int len1 = v1.length;
                    int len2 = v2.length;

                    //如果长度相等，直接比较，倒序
                    if (len1 == len2) {
                        return s2.compareTo(s1);
                    }
                    //如果长度不相等，比较前几位是否相等，不相等，倒序
                    int min = Math.min(len1, len2);
                    for (int i = 0; i < min; i++) {
                        char c1 = v1[i];
                        char c2 = v2[i];
                        if (c1 != c2) {
                            return c2 - c1;
                        }
                    }
                    //前几位相等，比较最长的第一位和最后一位
                    if (len1 > len2) {
                        return v1[0] - v1[min];
                    } else {
                        return v2[min] - v2[0];
                    }
                })
                .forEach(builder::append);
        System.out.println(builder);
    }
}
