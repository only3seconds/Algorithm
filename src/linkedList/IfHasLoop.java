package linkedList;

/**
 * 判断一个单链表是否有环
 */
public class IfHasLoop {

    public static boolean ifHasLoop(ListNode pHead) {
        if (pHead == null || pHead.next == null) {
            return false;
        }

        ListNode slow = pHead;
        ListNode fast = pHead;

        while (fast != null && fast.next != null) {
            slow = slow.next; //slow 每次只走一步
            fast = fast.next.next; //fast 每次走两部

            //相遇，则有环
            if (slow == fast) {
                return true;
            }
        }

        return false;
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

        System.out.println(ifHasLoop(head));

    }
}
