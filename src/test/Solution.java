package test;

public class Solution {


    public class RandomListNode {
        int label;
        RandomListNode next = null;
        RandomListNode random = null;

        RandomListNode(int label) {
            this.label = label;
        }
    }


    public RandomListNode Clone(RandomListNode pHead) {
        if (pHead == null) {
            return  null;
        }

        RandomListNode newHead = new RandomListNode(-1); //辅助头结点
        RandomListNode p = newHead; //新链表的工作结点


        while (pHead != null) {
            //复制当前结点
            RandomListNode copy = new RandomListNode(pHead.label);

            //复制当前结点的next结点
            RandomListNode copyNext = null;
            if (pHead.next != null) {
                copyNext = new RandomListNode(pHead.next.label);
            }

            //复制当前结点的random结点
            RandomListNode copyRandom = null;
            if (pHead.random != null) {
                copyRandom = new RandomListNode(pHead.random.label);
            }

            copy.next = copyNext;
            copy.random = copyRandom;

            p.next = copy;
            p = p.next;
            pHead = pHead.next;
        }

        return newHead.next;

    }

}