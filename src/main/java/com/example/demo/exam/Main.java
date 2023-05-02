package com.example.demo.exam;


import java.util.Scanner;

public class Main {

/*    public static void main(String[] args) {
        int[][] arr = new int[100][100];
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int m = 1;
        for (int i = 1; i <= x; i++) {
            for (int j = 0; j < i; j++) {
                arr[i - 1 - j][j] = m;
                m++;
            }
        }
        int t = 0;
        for (int i = 0; i < x; i++, t++) {
            for (int j = 0; j < x - t; j++) {
                System.out.print(arr[i][j] + " ");
                if (i + j == x - 1) {
                    System.out.println();
                }
            }
        }
    }*/



/*    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String strIn = sc.next();
        // 字符串转变为字符数组
        char[] tmp = strIn.toCharArray();
        // 返回结果
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tmp.length; i++) {
            if (tmp[i] == 'Z') {
                sb.append("A");
            } else if (tmp[i] == 'z') {
                sb.append("a");
            } else {
                sb.append((char) (tmp[i] + 1));
            }
        }
        System.out.println(sb);
    }*/

   /* public static void main(String[] args) {

        double a = 0, b = 0, c = 0;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        double m = b * b - 4 * a * c;
        if (a == 0) {
            System.out.println("null");
        } else {
            if (m < 0) {
                System.out.println("null");
            } else {
                double X1 = (-b + Math.sqrt(m)) / (2 * a);
                double X2 = (-b - Math.sqrt(m)) / (2 * a);
                System.out.println(X1 + " " + X2);
            }
        }



    }*/



/*    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] arr = str.split(",");
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(Integer.parseInt(arr[i]));
        }
        list.sort(Comparator.comparing(Integer::intValue));
        System.out.println(list.get(list.size() - 1) + "," + list.get(list.size() - 2));
    }*/




    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        int year = sc.nextInt();

        String y = id.substring(6, 10);

        System.out.println(year - Integer.parseInt(y));
    }*/




/*    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 2; i <= n; i++) {
            while (n != i) {
                if (n % i == 0) {
                    System.out.print(i + "*");
                    n = n / i;
                } else {
                    break;
                }
            }
        }
        System.out.println(n);
    }*/


    //该年的哪一天
/*    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int month = sc.nextInt();
        int day = sc.nextInt();
        int sum = 0;
        int [][] a = {
                {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
                {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
        };
        for (int i = 0; i < month - 1; i++) {
            if (year % 4 == 0 && year % 100 != 0 && year % 400 ==0) {
                sum = sum + a[1][i];
            } else {
                sum = sum + a[0][i];
            }
        }
        sum = sum + day;
        System.out.println(sum);
    }*/

    //求600~800之间的素数，并存在list中
/*    public static void main(String[] args) {
        boolean flag;
        List<Integer> list = new ArrayList<>();
        for (int i = 600; i < 800; i++) {
            flag = false;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                list.add(i);
            }
        }
        System.out.println(list);
    }*/


/*    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int sum = 0;
        String str = "";
        for (int i = 0; i < n; i++) {
            str = str + m;
            int a = Integer.parseInt(str);
            sum += a;
        }
        System.out.println(sum);
    }*/


    //输出最大公约数，最小公倍数
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(f(m, n) + "\n" + g(m, n));
    }

    public static int f(int m, int n) {
        int c = m % n;
        return c == 0 ? n : f(n, c);
    }

    public static int g(int m, int n) {
        return m * n / f(m, n);
    }
}
