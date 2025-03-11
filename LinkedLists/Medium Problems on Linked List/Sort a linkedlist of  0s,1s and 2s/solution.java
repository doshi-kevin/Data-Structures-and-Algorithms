class Solution {
    // Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        int count0 = 0, count1 = 0, count2 = 0;
        Node temp = head;

        // Count occurrences of 0s, 1s, and 2s
        while (temp != null) { // Fix: Corrected while loop condition
            if (temp.data == 0) count0++;
            else if (temp.data == 1) count1++;
            else count2++;
            temp = temp.next; // Fix: Move `temp` forward
        }

        // Modify the linked list in-place
        temp = head;
        while (count0-- > 0) {
            temp.data = 0;
            temp = temp.next;
        }
        while (count1-- > 0) {
            temp.data = 1;
            temp = temp.next;
        }
        while (count2-- > 0) {
            temp.data = 2;
            temp = temp.next;
        }

        return head;
    }
}
