class Solution {
    // Function to insert a new node at given position in doubly linked list.
    Node addNode(Node head, int p, int x) {
        // Your code here
        Node new_node = new Node(x);
        Node temp=head;
        for(int i=0;i<p;i++){
            temp=temp.next;
        }
        new_node.next=temp.next;
        temp.next=new_node;
        new_node.prev=temp;
        return head;
    }
}