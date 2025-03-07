class Solution {
    // Function to delete a node at a given position.
    public Node deleteNode(Node head, int x) {
        // Initializing del node with head.
        Node del = head;
        x = x - 1;

        // Iterating till the position given in parameter.
        while (x-- > 0) {
            del = del.next;
        }

        /* Base case */
        // If head or del is null, return null.
        if (head == null || del == null) {
            return null;
        }

        /* If Node to be deleted is head Node */
        // If del is equal to head, update head to next node.
        if (head == del) {
            head = del.next;
        }

        /* Change next only if Node to be deleted is NOT the last Node */
        // If del next is not null, update previous node of del next to del previous.
        if (del.next != null) {
            del.next.prev = del.prev;
        }

        /* Change prev only if Node to be deleted is NOT the first Node */
        // If del previous is not null, update next node of del previous to del next.
        if (del.prev != null) {
            del.prev.next = del.next;
        }

        // Return updated head.
        return head;
    }
}