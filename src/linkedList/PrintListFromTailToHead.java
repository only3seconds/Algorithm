package linkedList;

import java.util.ArrayList;

public class PrintListFromTailToHead {

    public static void main(String[] args) {

    }

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<>();

        if (listNode == null) {
            return list;
        }

        ListNode reverse = reverseList(listNode);
        while (reverse != null) {
            list.add(reverse.val);
            reverse = reverse.next;
        }

        return list;


    }

    public ListNode reverseList(ListNode listNode) {
        ListNode p = listNode;
        ListNode pre = null;
        ListNode post = null;

        while (p != null) {
            post = p.next;
            p.next = pre;
            pre = p;
            p = post;
        }

        return pre;
    }
}
