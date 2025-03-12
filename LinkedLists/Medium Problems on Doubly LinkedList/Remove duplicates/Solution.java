class Solution{
    Node removeDuplicates(Node head){
        // Code Here.
        if(head == null || head.next == null) return head;
       Node temp = head;
       Node ahead = temp.next;
       while(ahead.next!=null){
           if(temp.data == ahead.data){
               temp.next = ahead.next;
               ahead = ahead.next;
               ahead.prev = temp;
           }else{
               temp=temp.next;
               ahead=ahead.next;
           }
       }
       if(temp.data == ahead.data){
           temp.next = null;
       }
    return head;    
    }
}