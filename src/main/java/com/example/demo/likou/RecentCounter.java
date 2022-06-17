package com.example.demo.likou;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @description:
 * @author: huk
 * @create: 2022/5/6 21:29
 **/
public class RecentCounter {
    Queue<Integer> queue;
    public RecentCounter() {
        queue = new ArrayDeque<>();
    }

    public int ping(int t) {
        queue.offer(t);
        while (queue.peek() < t - 3000) {
            queue.poll();
        }
        return queue.size();
    }
}
