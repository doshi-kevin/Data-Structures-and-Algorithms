class Solution {
    static Node constructLL(int arr[]) {
        if (arr.length == 0) return null; // handle empty array case

        // creating the head of the linked list
        Node head = new Node(arr[0]);
        Node cur = head;

        // adding elements to the linked list
        for (int i = 1; i < arr.length; i++) {
            Node tmp = new Node(arr[i]);
            cur.next = tmp;
            cur = tmp;
        }

        // returning the head of the linked list
        return head;
    }
}