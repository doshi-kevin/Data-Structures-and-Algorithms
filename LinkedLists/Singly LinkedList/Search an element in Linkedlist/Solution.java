class Solution {
    static boolean searchKey(int n, Node head, int key) {
        // Code 
        if(head == null){
            return false;
        }
        if(head.data==key){
            return true;
        }
        Node temp=head;
        while(temp.next!=null){
            if(temp.data == key){
                return true;
            }
            temp=temp.next;
        }
        if(temp.data == key){
                return true;
            }
        return false;
    }
}