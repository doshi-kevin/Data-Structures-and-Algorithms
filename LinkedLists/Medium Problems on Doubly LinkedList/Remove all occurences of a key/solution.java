class Solution {
    static Node deleteAllOccurOfX(Node head, int x) {
        if (head == null) return null;

        // Removing all occurrences of x from the beginning
        while (head != null && head.data == x) {
            head = head.next;
        }

        Node temp = head;
        while (temp != null) {
            if (temp.data == x) {
                Node prev = temp.prev;
                Node next = temp.next;

                if (prev != null) prev.next = next;
                if (next != null) next.prev = prev;
            }
            temp = temp.next;
        }
        
        return head;
    }
}
