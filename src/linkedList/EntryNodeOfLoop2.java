package linkedList;

import static linkedList.IfHasLoop.ifHasLoop;

/**
 * 寻找有环单链表的入口结点：断链法
 * 依据：只有环的入口结点有两个指针指向它
 */
public class EntryNodeOfLoop2 {

    public static ListNode EntryNodeOfLoop(ListNode pHead) {

        if (pHead == null || pHead.next == null) {
            return null;
        }

        if (ifHasLoop(pHead)) {
            ListNode p = pHead;
            ListNode post = pHead.next;

            while (post != null) {
                p.next = null;
                p = post;
                post = post.next;
            }
            return p;
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
        node3.next = node1;

        if (EntryNodeOfLoop(head) == null) {
            System.out.println(EntryNodeOfLoop(head));
        } else {
            System.out.println(EntryNodeOfLoop(head).val);
        }

    }

}