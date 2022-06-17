package com.example.demo.likou;

import java.util.Arrays;

/**
 * @description:
 * @author: huk
 * @create: 2022/6/13 20:15
 **/
public class Main1051 {
    public int heightChecker(int[] heights) {
        int[] arr = new int[heights.length];
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length - i -1; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    int temp = arr[j + 1];
//                    arr[j + 1] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }

        System.arraycopy(heights, 0, arr, 0, heights.length);
        Arrays.sort(arr);
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != heights[i]) {
                count++;
            }
        }
        System.out.println(count);
        return count;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{5,1,2,3,4};
        Main1051 main1051 = new Main1051();
        main1051.heightChecker(arr);
    }
}
