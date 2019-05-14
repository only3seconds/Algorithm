package linkedList;

import java.util.HashMap;

/**
 * 寻找有环单链表的入口结点：计数法
 * 依据：只有环的入口结点有两个指针指向它
 */
public class EntryNodeOfLoop1 {

    public static ListNode EntryNodeOfLoop(ListNode pHead) {

        if (pHead == null || pHead.next == null) {
            return null;
        }

        HashMap<ListNode, Integer> map = new HashMap<>();
        while (pHead != null) {
            if (map.containsKey(pHead)) {
                return pHead;

            } else {
                map.put(pHead, 1);
            }

            pHead = pHead.next;
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