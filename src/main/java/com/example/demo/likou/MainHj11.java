package com.example.demo.likou;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: huk
 * @create: 2022/6/17 13:59
 **/
public class MainHj11 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String s = scanner.nextLine();
//
//        StringBuilder builder = new StringBuilder();
//        for (int i = s.length() - 1; i >= 0 ; i--) {
//            builder.append(s.charAt(i));
//        }
//
//        System.out.println(builder);

        List<Student> list = new ArrayList<>();

        list.add(new Student("的", 33));
        list.add(new Student("是", 44));
        list.add(new Student("订单", 33));
        list.add(new Student("额", 55));
        list.add(new Student("为", 33));
        list.add(new Student("味儿", 66));

        list.stream().sorted((o1, o2) -> {
            if (o1.getName().equals(o2.getName())) {
                return o1.getName().compareTo(o2.getName());
            } else {
                return o2.getScore() - o1.getScore();
            }
        }).forEach(d -> System.out.println(d.getName() + " " + d.getScore()));
    }

    static class Student {
        private String name;
        private int score;

        public Student() {
        }

        public Student(String name, int score) {
            this.name = name;
            this.score = score;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getScore() {
            return score;
        }

        public void setScore(int score) {
            this.score = score;
        }
    }
}
