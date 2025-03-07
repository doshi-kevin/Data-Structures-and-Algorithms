class Solution {
    Node constructDLL(int arr[]) {
        // Code here
        Node head=null;
        Node temp=null;
        Node new_node = new Node(arr[0]);
        if(head == null){
            head=new_node;
            temp=head;
        }
        if(arr.length==1){
            return head;
        }
        for(int i=1;i<arr.length;i++){
            Node new_nod = new Node(arr[i]);
            head.next = new_nod;
            new_nod.prev = head;
            head=new_nod;
        }
        return temp;
    }
}