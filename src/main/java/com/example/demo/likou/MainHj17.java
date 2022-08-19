package com.example.demo.likou;

import java.util.Scanner;

/**
 * @description:
 * @author: huk
 * @create: 2022/6/18 11:48
 **/
public class MainHj17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] strArr = s.split(";");
        int x = 0;
        int y = 0;

        for (int i = 0; i < strArr.length; i++) {
            String str = strArr[i];
            if (!(str.contains("W") || str.contains("A") || str.contains("S") || str.contains("D"))) {
                continue;
            } else if (str == null || str.length() == 0) {
                continue;
            } else if (isNumeric(str.substring(1))) {
                String substr = str.substring(0, 1);
                int moveNum = Integer.parseInt(str.substring(1));
                if ("W".equals(substr)) {
                    y += moveNum;
                } else if ("A".equals(substr)) {
                    x -= moveNum;
                } else if ("S".equals(substr)) {
                    y -= moveNum;
                } else {
                    x += moveNum;
                }
            } else {
                continue;
            }
        }

        System.out.println(x + "," + y);
    }

    public static boolean isNumeric(String str) {
        if (null == str || str.length() == 0) {
            return false;
        }
        final int sz = str.length();
        for (int i = 0; i < sz; i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

}
