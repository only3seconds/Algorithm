package linkedList;

/**
 * 寻找有环单链表的入口结点：差速法
 */
public class EntryNodeOfLoop {

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

    //寻找快慢指针相遇结点
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