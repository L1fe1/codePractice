package algorithm.linkedlist;

/**
 * 输入一个链表，输出该链表中倒数第k个结点。
 */
public class FindKthNodeToTail {
    public ListNode FindKthToTail(ListNode head,int k) {
        if (k < 1)
            return null;
        ListNode ln1 = head;
        ListNode ln2 = head;
        for (int i = 0;i < k - 1 && ln1 != null;i ++){
            ln1 = ln1.next;
        }
        if (ln1 == null)
            return null;
        while (ln1.next != null){
            ln1 = ln1.next;
            ln2 = ln2.next;
        }
        return ln2;
    }
}
