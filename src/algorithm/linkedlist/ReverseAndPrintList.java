package algorithm.linkedlist;

/**
 * 输入一个链表，反转链表后，输出新链表的表头。
 */
public class ReverseAndPrintList {
    public ListNode ReverseList(ListNode head) {
        if (head == null) return null;
        ListNode pReversedHead = head;
        ListNode pNode = head;
        ListNode pPrev = null;
        while (pNode != null){
            ListNode pNext = pNode.next;
            if (pNext == null)
                pReversedHead = pNode;
            pNode.next = pPrev;
            pPrev = pNode;
            pNode = pNext;
        }
        return pReversedHead;
    }
}
