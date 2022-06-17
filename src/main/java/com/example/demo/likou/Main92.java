package com.example.demo.likou;

import java.util.*;

/**
 * @description:
 * @author: huk
 * @create: 2022/6/13 19:51
 **/
public class Main92 {
    /*
        给定参数n,从1到n会有n个整数:1,2,3,...,n,
        这n个数字共有n!种排列.
      按大小顺序升序列出所有排列的情况,并一一标记,
      当n=3时,所有排列如下:
      "123" "132" "213" "231" "312" "321"
      给定n和k,返回第k个排列.

      输入描述:
        输入两行，第一行为n，第二行为k，
        给定n的范围是[1,9],给定k的范围是[1,n!]。
      输出描述：
        输出排在第k位置的数字。

      实例1：
        输入:
          3
          3
        输出：
          213
        说明
          3的排列有123,132,213...,那么第三位置就是213

      实例2：
        输入
          2
          2
        输出：
          21
        说明
          2的排列有12,21，那么第二位置的为21
   */
    static TreeSet<String> set = new TreeSet<>();

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        int k = Integer.parseInt(in.nextLine());
        in.close();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i+1;
        }
        perm(arr, 0, n - 1);
        String res = new ArrayList<>(set).get(k - 1);
        System.out.println(res);

    }

    public static void perm(Integer[] array, int start, int end) {

        if (start == end) {
            String num = Arrays.toString(array).replaceAll("\\W+", "");
            set.add(num);
        } else {
            for (int i = start; i <= end; i++) {
                swap(array, start, i);
                perm(array, start + 1, end);
                swap(array, start, i);
            }
        }
    }

    public static void swap(Integer[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
