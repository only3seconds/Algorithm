package linkedList;

public class ReverseList {
    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);

        head.next = node1;
        node1.next = node2;
        node2.next = node3;

        ListNode newHead = reverse2(head);
        ListNode newNode1 = newHead.next;

        System.out.println(newHead.val);
        System.out.println(newNode1.val);

    }

    public static ListNode reverse1(ListNode head) {

        if (head == null) {
            return head;
        }

        ListNode p = head;
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


    public static ListNode reverse2(ListNode head) {
        if (head == null) {
            return head;
        }

        ListNode newHead = head;
        ListNode p = head.next;
        ListNode post = null;

        while (p != null) {
            post = p.next;
            p.next = newHead;
            newHead = p;
            p = post;
        }
        return newHead;

    }


}
