package test;

import linkedList.ListNode;

public class X1 {
    public ListNode partition(ListNode head, int m) {

        if (head == null) {
            return head;
        }

        ListNode p = head;
        ListNode node1 = new ListNode(-1);
        ListNode node2 = new ListNode(-1);
        ListNode point1 = node1;
        ListNode point2 = node2;

        while (p != null) {
            if (p.val < m) {
                point1.next = p;
                point1 = point1.next;
            } else {
                point2.next = p;
                point2 = point2.next;
            }

            p = p.next;
        }
        if (null == node1.next) {
            return head;
        } else {
            point1.next = node2.next;
            point2.next = null;

            return node1.next;
        }
    }
}
