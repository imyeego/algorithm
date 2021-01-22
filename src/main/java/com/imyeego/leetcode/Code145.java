package com.imyeego.leetcode;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @authur : liuzhao
 * @date : 2020/9/2
 * @time : 下午 2:35
 * @Des :
 */
public class Code145 {

    private static  List<Integer> list = new ArrayList<>();


    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(5);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(6);
        TreeNode node6 = new TreeNode(7);

        root.right = node1;
        root.left = node4;
        node1.left = node2;
        node1.right = node3;

        node4.left = node5;
        node4.right = node6;

        int[] array = {1, 4, 2, 6, 7, 3, 5};

        root = arrayToTree(array);

        List<Integer> list = levelTraversalIterative(root);
        for (Integer i : list) {
            System.out.print(i);
        }
    }

    static List<Integer> preOrderWithRecursive(TreeNode root) {
        if (root == null) return list;
        list.add(root.val);
        preOrderWithRecursive(root.left);
        preOrderWithRecursive(root.right);
        return list;
    }

    static List<Integer> inOrderWithRecursive(TreeNode root) {
        if (root == null) return list;
        inOrderWithRecursive(root.left);
        list.add(root.val);
        inOrderWithRecursive(root.right);
        return list;
    }

    public static List<Integer> postOrderTraversalRecursive(TreeNode root) {
        if (root == null) return list;
        if (root.left != null) postOrderTraversalRecursive(root.left);
        if (root.right != null) postOrderTraversalRecursive(root.right);

        list.add(root.val);
        return list;
    }

    /**
     * LeetCode#145
     * @param root
     * @return
     */

    // TODO 额外需要一个栈或者反向的列表
    public static List<Integer> postorderTraversalIterative(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        if (root == null) return list;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode temp = stack.pop();
            list.add(0, temp.val);
            if (temp.left != null) stack.push(temp.left);
            if (temp.right != null) stack.push(temp.right);

        }
        return list;
    }



    /**
     * LeetCode#144
     * @param root
     * @return
     */
    public static List<Integer> preorderTraversalIterative(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        if (root == null) return list;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode temp = stack.pop();
            list.add(temp.val);
            if (temp.right != null) stack.push(temp.right);
            if (temp.left != null) stack.push(temp.left);
        }
        return list;
    }

    /**
     * LeetCode#94
     * @param root
     * @return
     */
    public static List<Integer> inorderTraversalIterative(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        while (true) {
            if (root != null) {
                stack.push(root);
                root = root.left;
            } else {
                if (stack.empty()) return list;
                root = stack.pop();
                list.add(root.val);
                root = root.right;
            }
        }
    }

    static List<Integer> levelTraversalIterative(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedBlockingQueue<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            list.add(node.val);
            if (node.left != null) queue.offer(node.left);
            if (node.right != null) queue.offer(node.right);
        }
        return list;

    }

    // 等于层次遍历
    static List<Integer> treeToArray(TreeNode root) {
        List<Integer> list = new ArrayList<>();


        return list;
    }


    /**
     * 根据数组构建二叉树
     * @param array
     * @return
     */
    static TreeNode arrayToTree(int[] array) {
        if (array == null || array.length == 0) return null;
        TreeNode root = new TreeNode(array[0]);
        TreeNode node = root;
        Queue<TreeNode> queue = new LinkedList<>();
        for (int i = 1, j = 0; i < array.length; i += 2) {
            TreeNode left = new TreeNode(array[2 * j + 1]);
            queue.offer(left);
            TreeNode right = new TreeNode(array[2 * j + 2]);
            queue.offer(right);
            node.left = left;
            node.right = right;
            node = queue.poll();
            if (node.val == -1) {
                j += 2;
            } else {
                j ++;
            }
        }

        return root;
    }


}
