class Solution {
    // Function to find the length of a loop in the linked list.
    public int countNodesinLoop(Node head) {
        Node slow = head, fast = head;

        // Detecting the cycle using Floyd’s Algorithm
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) { // Cycle detected
                return countLoopLength(slow); 
            }
        }

        return 0; // No loop
    }

    // Helper function to count nodes in the loop
    private int countLoopLength(Node slow) {
        Node temp = slow;
        int count = 1;

        while (temp.next != slow) { // Traverse the cycle
            temp = temp.next;
            count++;
        }
        
        return count;
    }
}
