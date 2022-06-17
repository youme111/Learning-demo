package com.example.demo.likou;

import org.springframework.util.CollectionUtils;

import java.util.*;

/**
 * @description:
 * @author: huk
 * @create: 2022/5/5 21:55
 **/
public class Solution3 {
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        List<Double> averages = new ArrayList<>();
        double sum = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            TreeNode node = queue.poll();
            sum += node.val;
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }
            averages.add(sum / size);
        }
        return averages;
    }
}
