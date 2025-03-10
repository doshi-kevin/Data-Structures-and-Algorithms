public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        while (fast != null && fast.next != null) { // Ensure fast and fast.next are valid
            slow = slow.next; // Move slow one step
            fast = fast.next.next; // Move fast two steps
            
            if (slow == fast) { // If slow meets fast, cycle detected
                return true;
            }
        }
        return false; // If we reach the end, no cycle
    }
}