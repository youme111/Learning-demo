package com.example.demo.likou;

import javax.swing.tree.TreeNode;
import java.util.*;

/**
 * @description:
 * @author: huk
 * @create: 2022/5/5 21:07
 **/
public class Solution2 {
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> list = new ArrayList<>();
        list.addAll(getNode(root1));
        list.addAll(getNode(root2));
        Collections.sort(list);
        System.out.println(list.toString());
        return list;
    }

    private static List<Integer> getNode(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        List<Integer> list = new ArrayList<>();
        while (!queue.isEmpty()) {
//            for (int i = 0; i < queue.size(); i++) {
                TreeNode node = queue.poll();
                if (node != null) {
                    list.add(node.val);
                    if (node.left != null) {
                        queue.add(node.left);
                    }
                    if (node.right != null) {
                        queue.add(node.right);
                    }
                }

//            }
        }
        return list;
    }

    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        TreeNode root1 = new TreeNode(2, new TreeNode(1), new TreeNode(4));
        TreeNode root2 = new TreeNode(1, new TreeNode(0), new TreeNode(3));
        solution2.getAllElements(root1, root2);
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
