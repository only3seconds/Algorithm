package linkedList;

import java.util.Scanner;

/**
 * 携程笔试
 */
public class ReverseByK {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        String line = in.nextLine();
//        int k = in.nextInt();
    String line = "[1,2,3,4,5]";
    int k = 3;
        line = line.substring(1, line.length() - 1);
        String[] strList = line.split(",");
        ListNode head = null;
        ListNode cur = null;
        for (int i = 0; i < strList.length; i++) {
            if (null == head) {
                head = new ListNode(Integer.parseInt(strList[i]));
                cur = head;
            } else {
                ListNode l = new ListNode(Integer.parseInt(strList[i]));
                cur.next = l;
                cur = l;
            }
        }

        ListNode lu = reverseByK(head, k);
        print(lu);

    }

    public static void print(ListNode head) {
        ListNode cur = head;
        System.out.printf("[");
        while (null != cur) {
            if (cur == head) {
                System.out.printf("%d", cur.data);
            } else {
                System.out.printf(",%d", cur.data);
            }
            cur = cur.next;
        }
        System.out.printf("]");
    }


    public static ListNode reverseByK(ListNode head, int k) {
        if (k == 1)
            return head;
        if (head == null || head.next == null)
            return head;
        int kk = k;
        ListNode newHead = null;
        ListNode p = head;
        ListNode prev = null;
        ListNode pNext = null;
        int size = calLength(head);
        if (size < k)
            return head;
        while (k >= 1) {
            k--;
            pNext = p.next;
            if (k == 0) {
                newHead = p;
            }
            p.next = prev;
            prev = p;
            p = pNext;
        }
        ListNode lastNode = newHead;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }
        ListNode nextHead = reverseByK(pNext, kk);
        lastNode.next = nextHead;
        return newHead;
    }


    public static int calLength(ListNode head) {
        ListNode cur = head;
        int count = 0;
        while (null != cur) {
            count++;
            cur = cur.next;
        }
        return count;
    }

    public static class ListNode {
        int data;
        ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

}

