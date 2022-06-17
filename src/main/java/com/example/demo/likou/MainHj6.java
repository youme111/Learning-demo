package com.example.demo.likou;

import java.util.Scanner;

/**
 * @description:
 * @author: huk
 * @create: 2022/6/14 19:36
 **/
public class MainHj6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        long num = Long.parseLong(scan.next());
//        scan.close();
        // 获取需要求解的值
        int target = scan.nextInt();
        int y = 2;// 因子从2开始算
        while(target != 1){ // 短除法，除到目标值为1为止
            if(target % y == 0) // 能能够整除2
            {
                System.out.print(y+" ");
                target /= y;
            }else{// 更新y的值
                if(y > target / y)
                    y = target;//如果剩余值为质数
                else
                    y++;  //y值增加1
            }
        }

//        getPrimer(num);
    }

    public static void getPrimer(long num) {
        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
                getPrimer(num / i);
                break;
            }
            if (i == num) {
                System.out.print(i + " ");
            }
        }
    }
}
