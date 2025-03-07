class Solution {
    // Function to count nodes of a linked list.
    public int getCount(Node head) {
        // code here
        int count = 1;
        Node temp = head;
        while(temp.next!=null){
            temp=temp.next;
            count++;
        }
        return count;
    }
}