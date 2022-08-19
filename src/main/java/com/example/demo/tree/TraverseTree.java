package com.example.demo.tree;

/**
 * @description:
 * @author: huk
 * @create: 2022/7/7 23:42
 **/
public class TraverseTree {

    //先序遍历，先遍历根节点，再遍历左子树，再遍历右子树
    public static void preOrder(TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }
        System.out.println(treeNode.getValue());
        preOrder(treeNode.getLeftNode());
        preOrder(treeNode.getRightNode());
    }

    //中序遍历，先遍历左子树，再遍历根节点，最后遍历右子树
    public static void inOrder(TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }
        inOrder(treeNode.getLeftNode());
        System.out.println(treeNode.getValue());
        inOrder(treeNode.getRightNode());
    }

    //后序遍历
    public static void postOrder(TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }
        postOrder(treeNode.getLeftNode());
        postOrder(treeNode.getRightNode());
        System.out.println(treeNode.getValue());
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1, new TreeNode(2, new TreeNode(4, new TreeNode(8, null, null),
                new TreeNode(9, null, null)), new TreeNode(5, null, null)),
                new TreeNode(3, new TreeNode(6, null, null), new TreeNode(7, null, null)));
        System.out.println("先序遍历");
        //先序遍历
        preOrder(treeNode);
        System.out.println("中序遍历");
        //中序遍历
        inOrder(treeNode);
        //后序遍历
        System.out.println("后序遍历");
        postOrder(treeNode);
    }
}
