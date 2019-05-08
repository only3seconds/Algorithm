package test;

public class Solution {

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }


    public ListNode ReverseList(ListNode head) {

        if (head == null) {
            return null;
        }

        ListNode newHead = new ListNode(head.val);
        newHead.next = null;
        head = head.next;
        ListNode temp;

        while (head != null) {
            temp = head;
            head = head.next;
            temp.next = newHead;
            newHead = temp;
        }

        return newHead;
    }

}