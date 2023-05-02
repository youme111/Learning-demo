package com.example.demo.mockexam;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        int a, b, c;
        for (int i = 100; i < 999; i++) {
            a = i % 10;
            b = i / 10 % 10;
            c = i / 100 % 10;
            if (i == (a * a *a + b * b * b + c * c * c)) {
                sb.append(i + " ");
            }
        }
        System.out.println(sb);
    }


/*    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[100][100];
        int m = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                arr[i - 1 - j][j] = m;
                m++;
            }
        }
        int t = 0;
        for (int i = 0; i < n; i++, t++) {
            for (int j = 0; j < n - t; j++) {
                System.out.print(arr[i][j] + " ");
                if (i + j == n - 1) {
                    System.out.println();
                }
            }
        }
    }*/



/*    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuilder sb = new StringBuilder();

        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == 'Z') {
                sb.append("A");
            } else if (charArray[i] == 'z') {
                sb.append("a");
            } else {
                sb.append((char) (charArray[i] + 1));
            }
        }
        System.out.println(sb);
    }*/



/*    public static void main(String[] args) {

        int count = 0;
        for (int x = 0; x < 20; x++) {
            for (int y = 0; y < 33; y++) {
                int z = 100 - x - y;
                if ((z % 3 == 0) && (x * 5 + y * 3 + z / 3 == 100)) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }*/


/*    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int ageMore = scanner.nextInt();
        System.out.println(getAge(num, ageMore));
    }

    public static int getAge(int num, int ageMore) {
        if (num == 1) {
            return 10;
        } else {
            return ageMore + getAge(num - 1, ageMore);
        }
    }*/


/*    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(a);
        treeSet.add(b);
        treeSet.add(c);
        treeSet.add(d);

        treeSet.stream().sorted(Comparator.comparing(Integer::intValue).reversed()).forEach(s -> {
            System.out.print(s + " ");
        });
    }*/



/*    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double h = sc.nextInt();
        double sumDown = 0;
        double sumUp = 0;
        for (int i = 0; i < 10; i++) {
            sumDown = sumDown + h;
            h = h * 0.5;
            if (i < 9) {
                sumUp += h;
            }
        }
        System.out.println(sumDown + sumUp + "," + h);
    }*/



/*    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 1; i <= 1000; i++) {
            int sum = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if (sum == i) {
                stringBuffer.append(i).append(",");
            }
        }
        stringBuffer.deleteCharAt(stringBuffer.lastIndexOf(","));
        System.out.println(stringBuffer.toString());
    }*/
}
