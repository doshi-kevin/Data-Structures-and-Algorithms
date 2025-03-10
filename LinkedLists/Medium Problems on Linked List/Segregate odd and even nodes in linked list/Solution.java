class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {
            return head;
        }

        ListNode even = head;
        ListNode oddStart = head.next;
        ListNode odd = head.next;

        while (even.next != null && odd.next != null) {
            even.next = odd.next;
            even = even.next;

            if (even.next == null) {
                break;
            }

            odd.next = even.next;
            odd = odd.next;
        }

        even.next = oddStart; // Connect the even list to the odd list
        odd.next = null; // Ensure the last node points to null to prevent cycles

        return head;
    }
}
