package linkedList;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 携程笔试
 */
public class IfHasCircle {

    public static void main(String[] args) {
        Map<String, LinkedNode> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        LinkedNode head = null;
        LinkedNode cur = null;
        while (sc.hasNext()) {
            String str = sc.nextLine();
//      String str = "a,b,c,d,a";
            String [] strList = str.split(",");
            for (int i=0; i<strList.length; i++) {
                if(null == head) {
                    head = new LinkedNode(strList[i].trim());
                    cur = head;
                    map.put(strList[i], head);
                } else {
                    if(map.containsKey(strList[i])) {
                        LinkedNode l =  map.get(strList[i]);
                        cur.next = l;
                        cur = l;
                    } else {
                        LinkedNode l =  new LinkedNode(strList[i]);
                        cur.next = l;
                        cur = l;
                        map.put(strList[i], l);
                    }
                }
            }
            System.out.println(ifHasCircle(head));
        }
    }

    public static class LinkedNode{
        String data;
        LinkedNode next;

        public LinkedNode(String data){
            this.data = data;
            this.next = null;
        }
    }


    public static boolean ifHasCircle( LinkedNode head){
        LinkedNode slow = head.next;
        LinkedNode fast = head.next.next;

        // 链表为空或者只有一个节点
        if(slow == null || fast == null){
            return false;
        }
        while(slow.next != null){

            if(fast.next == null){
                return false;
            }
            if(slow.data == fast.data){
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;

            if(fast == null){
                return false;
            }
        }
        return false;
    }
}