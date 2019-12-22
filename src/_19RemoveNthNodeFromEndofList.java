import com.fishercoder.common.classes.ListNode;
public class _19RemoveNthNodeFromEndofList {
    /**
     * 19. Remove Nth Node From End of List
     * Given a linked list, remove the n-th node from the end of list and return its head.
     *
     * Example:
     * Given linked list: 1->2->3->4->5, and n = 2.
     * After removing the second node from the end, the linked list becomes 1->2->3->5.
     *
     * Note:
     * Given n will always be valid.
     *
     * Follow up:
     * Could you do this in one pass?
     * */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        /**
         * Definition for singly-linked list.
         * public class ListNode {
         *     int val;
         *     ListNode next;
         *     ListNode(int x) { val = x; }
         * }
         */
        ListNode dummy = new ListNode(0);
        ListNode slow = dummy;
        ListNode fast = dummy;
        dummy.next = head;
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
    /**
     * Given linked list: 1->2->3->4->5, and n = 2.
     * fast: （从0开始数的）第n+1个结点
     * slow: 第0个结点
     * slow跟fast之间差了n
     * 最终的目的就是在下一个循环停止时，slow在要去掉的结点（倒数第n个）之前
     * 因为两者相差n，所以fast应该在末位结点的后一个结点，就是第一次为null时，这就是循环结束的判断条件
     * */
}
