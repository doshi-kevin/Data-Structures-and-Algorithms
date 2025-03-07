class Solution {
    // Function to insert a node at the end of the linked list.
    Node insertAtEnd(Node head, int x) {
        // Create the new node
        Node new_node = new Node(x);
        
        // Case 1: If the list is empty, return the new node as head
        if (head == null) {
            return new_node;
        }
        
        // Case 2: Traverse to the last node
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        
        // Insert the new node at the end
        curr.next = new_node;
        
        return head;
    }
}