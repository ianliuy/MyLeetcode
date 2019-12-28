import com.fishercoder.common.classes.ListNode;
public class _24SwapNodesinPairs {
    /**
     * 24. Swap Nodes in Pairs
     * Given a linked list, swap every two adjacent nodes and return its head.
     * You may not modify the values in the list's nodes, only nodes itself may be changed.
     *
     * Example:
     * Given 1->2->3->4, you should return the list as 2->1->4->3.
     * */
    /*public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode l1 = dummy;
        ListNode l2 = head;
        while (l2 != null && l2.next != null) {
            ListNode nextStart = l2.next.next;
            l1.next = l2.next;
            l2.next.next = l2;
            l2.next = nextStart;
            l1 = l2;
            l2 = l2.next;
        }
        return dummy.next;
    }*/
    /**
     * ⚪⚪ -> ⚪1 -> ⚪2 -> ⚪3 -> ⚪4
     * l1     l2           ns
     *
     * ⚪⚪    ⚪1 -> ⚪2 -> ⚪3 -> ⚪4
     * |              |
     * ---------------
     * l1     l2           ns (l1.next = l2.next;)
     *
     * ⚪⚪    ⚪1 -> ⚪2    ⚪3 -> ⚪4
     * |         <-   |
     * ---------------
     * l1     l2           ns (l2.next.next = l2;)
     *
     *          -------------
     *         |            |
     * ⚪⚪    ⚪1 <- ⚪2    ⚪3 -> ⚪4
     * |              |
     * ---------------
     * l1     l2           ns (l2.next = nextStart;)
     *
     * ⚪⚪ -> ⚪2 -> ⚪1 -> ⚪3 -> ⚪4
     * l1     l2           ns
     *
     * ⚪⚪ -> ⚪2 -> ⚪1 -> ⚪3 -> ⚪4
     *        l1     l2           ns (l1 = l2;l2 = l2.next;ListNode nextStart = l2.next.next;)
     * */
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode l1 = dummy;
        ListNode l2 = head;
        while (l2 != null && l2.next != null) {
            ListNode nextStart = l2.next.next;
            l1.next = l2.next;
            l2.next.next = l2;
            l2.next = nextStart;
            l1 = l2;
            l2 = l2.next;
        }
        return dummy.next;
    }
}
