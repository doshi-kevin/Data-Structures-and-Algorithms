class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }

        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null) { 
            fast = fast.next.next;
            slow = slow.next;
        }

        
        ListNode prev = null, curr = slow, next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Compare both halves
        ListNode l1 = head, l2 = prev; 
        while (l2 != null) { 
            if (l1.val != l2.val) {
                return false;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        return true;
    }
}