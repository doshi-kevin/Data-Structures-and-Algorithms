class Solution {
    public DLLNode reverseDLL(DLLNode head) {
        DLLNode prev = null;
        DLLNode current = head;
        DLLNode next = null;

        while (current != null) {
            next = current.next; // Store next node
            current.next = prev; // Reverse next pointer
            current.prev = next; // Reverse prev pointer
            prev = current; // Move prev and current one step forward
            current = next;
        }

        return prev; // Return the new head
    }
}
