class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || head.next == null) {
            return null;
        }

        ListNode newhead = reverse(head);
        if (n == 1) {  // If we need to remove the first node after reversing
            return reverse(newhead.next);
        }

        ListNode temp = newhead;
        for (int i = 1; i < n - 1; i++) { // Fix: Loop condition
            temp = temp.next;
        }

        temp.next = temp.next.next; // Fix: Correctly skipping the nth node

        return reverse(newhead);
    }

    public ListNode reverse(ListNode head) {
        ListNode prev = null, curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
