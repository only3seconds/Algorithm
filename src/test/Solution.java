package test;


public class Solution {


    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode EntryNodeOfLoop(ListNode pHead) {
        if (pHead == null) {
            return null;
        }

        ListNode node1 = pHead;
        ListNode node2 = meetingNodeOfLoop(pHead);

        if (node2 == null) {
            return null;
        }

        while (node1 != node2) {
            node1 = node1.next;
            node2 = node2.next;
        }

        return node1;

    }

    public static ListNode meetingNodeOfLoop(ListNode pHead) {
        if (pHead == null) {
            return null;
        }

        ListNode slow = pHead;
        ListNode fast = pHead;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return slow;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);

        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = null;

        System.out.println(EntryNodeOfLoop(head));

    }

}