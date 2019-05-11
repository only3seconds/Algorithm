package test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class Solution {


    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if (pHead1 == null || pHead2 == null) {
            return null;
        }

        HashSet<ListNode> set1 = new HashSet<>();

        while (pHead1 != null) {
            set1.add(pHead1);
            pHead1 = pHead1.next;
        }

        while (pHead2 != null) {
            if (set1.contains(pHead2)) {
                return pHead2;
            }
            pHead2 = pHead2.next;
        }

        return null;
    }

    public static void main(String[] args) {
        ListNode pHead1 = new ListNode(0);
        ListNode A = new ListNode(1);
        ListNode B = new ListNode(2);
        ListNode C = new ListNode(3);

        ListNode pHead2 = new ListNode(4);
        ListNode A2 = new ListNode(8);
        ListNode A3 = new ListNode(5);
        ListNode B2 = new ListNode(2);
        ListNode C2 = new ListNode(3);

        pHead2.next = A2;
        A2.next = A3;
        A3.next = B2;
        B2.next = C2;
        C2.next = null;

        System.out.println(FindFirstCommonNode(pHead1, pHead2));

    }

}