package linkedList;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * LinkedList 操作大全
 */
public class LinkedListOperation {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        //1. add
        linkedList.add("aaa");
        linkedList.add("bbb");
        linkedList.add("ccc");
        System.out.println(linkedList);

        linkedList.add(1, "insert");
        System.out.println(linkedList);

        linkedList.addFirst("first");
        System.out.println(linkedList);

        linkedList.addLast("last");
        System.out.println(linkedList);

        ArrayList<String> test = new ArrayList<>();
        test.add("test1");
        test.add("test2");

        linkedList.addAll(test);
        System.out.println(linkedList);

        linkedList.addAll(2, test);
        System.out.println(linkedList);

        //2. remove
        linkedList.remove();
        System.out.println(linkedList);

        linkedList.remove(2);
        System.out.println(linkedList);

        linkedList.remove("aaa");
        System.out.println(linkedList);

        linkedList.removeFirst();
        System.out.println(linkedList);

        linkedList.removeLast();
        System.out.println(linkedList);

        linkedList.add(4, "ppp");
        linkedList.addLast("ppp");
        linkedList.add(2, "ppp");
        System.out.println(linkedList);
        linkedList.removeFirstOccurrence("ppp");
        System.out.println(linkedList);

        linkedList.removeLastOccurrence("ppp");
        System.out.println(linkedList);

        ArrayList<String> sub = new ArrayList<>();
        sub.add("bbb");
        sub.add("ppp");
        linkedList.removeAll(sub);
        System.out.println(linkedList);

        //3. get
        System.out.println(linkedList.get(1));
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());

        //4. push pop poll
        linkedList.push("push"); // push = addFirst
        System.out.println(linkedList);

//        linkedList = new LinkedList<>();
        System.out.println("pop: " + linkedList.pop());
        System.out.println("poll: " + linkedList.poll()); //poll 类似 pop，但是当链表为空时，pop产生异常，poll返回null.

        //5. peek
        System.out.println(linkedList.peek());
        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());

        //6. offer
        linkedList.offer("offer");
        System.out.println(linkedList);

        linkedList.offerFirst("offerFirst");
        System.out.println(linkedList);

        linkedList.offerLast("offerLast");
        System.out.println(linkedList);
    }
}
