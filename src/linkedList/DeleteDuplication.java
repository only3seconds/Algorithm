package linkedList;


public class DeleteDuplication {

    public static ListNode deleteDuplication(ListNode pHead) {
        if (pHead == null || pHead.next == null) {
            return pHead;
        }

        ListNode head = new ListNode(-1);
        head.next = pHead;

        ListNode pre = head; //pre指向不同的结点
        ListNode p = pHead;
        ListNode post = pHead.next;

        while (post != null) {
            if (p.val == post.val) {
                while (post != null && p.val == post.val) {
                    post = post.next;
                }

                pre.next = post;

                //重置一下p和post
                if (post != null) {
                    p = post;
                    post = post.next;
                }

            } else {
                pre = p;
                p = post;
                post = post.next;
            }
        }

        return head.next;
    }


    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(1);
        ListNode copy1 = new ListNode(1);
        ListNode node2 = new ListNode(1);
        ListNode copy2 = new ListNode(1);
        ListNode node3 = new ListNode(1);
        ListNode node4 = new ListNode(1);
        ListNode copy4 = new ListNode(1);

        head.next = node1;
        node1.next = copy1;
        copy1.next = node2;
        node2.next = copy2;
        copy2.next = node3;
        node3.next = node4;
        node4.next = copy4;
        copy4 = null;

        ListNode newHead = deleteDuplication(head);
        while (newHead != null) {
            System.out.println(newHead.val);
            newHead = newHead.next;
        }


    }

}