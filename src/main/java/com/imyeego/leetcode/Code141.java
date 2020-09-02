package com.imyeego.leetcode;

/**
 * @authur : liuzhao
 * @date : 2020/9/2
 * @time : 下午 2:28
 * @Des :
 */
public class Code141 {

    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(0);
        ListNode node3 = new ListNode(-4);

        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node1;
        System.out.println(detectCycle1(head).val);
    }

    static ListNode hasCycle(ListNode head) {
        if (head == null) return null;
        ListNode p1 = head, p2 = head;
        while (p2 != null && p2.next != null){
            p1 = p1.next;
            p2 = p2.next.next;
            if (p1 == p2) return p1;
        }
        return null;
    }

    static ListNode detectCycle1(ListNode head){
        ListNode meetingNode = hasCycle(head);
        if (meetingNode == null){
            return null;
        }

        int length = lengthOfCycle(meetingNode);

        ListNode left = head, right = head;
        right = nextNode(right, length);

        while (left != right){
            left = left.next;
            right = right.next;
        }
        return left;
    }

    private static int lengthOfCycle(ListNode node){
        int length = 0;
        if (node == null) return length;
        ListNode currNode = node;
        ListNode stepNode = node.next;

        for (length = 1; ; length++) {
            if (currNode == stepNode) return length;
            stepNode = stepNode.next;
        }
    }

    private static ListNode nextNode(ListNode node, int step){
        for(int i = 0; i < step && node != null; i++)
        {
            node = node.next;
        }
        return node;
    }
}
