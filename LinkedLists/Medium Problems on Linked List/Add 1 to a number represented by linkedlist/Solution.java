class Solution {
    public Node addOne(Node head) {
        int count = 0, length = 1;
        Node temp = head;

        if (temp.data == 9) {
            count++;
        }

        while (temp.next != null) {
            temp = temp.next;
            length++;
            if (temp.data == 9) {
                count++;
            }
        }

        temp.data = temp.data + 1;

        if (temp.data == 10) {
            if (count == length) {
                Node curr = head;
                curr.data = 1;
                Node last = new Node(0);
                Node newNode = new Node(0);
                last.next = newNode; // Ensure correct linking

                if (curr.next == null) {
                    curr.next = last;
                    return head;
                }

                curr = curr.next;
                for (int i = 0; i < length - 1; i++) {
                    curr.data = 0;
                    if (curr.next == null) {
                        curr.next = last;
                    }
                    curr = curr.next;
                }
                return head;
            } else {
                Node curr = head;
                for (int i = 0; i < length - count - 1; i++) {
                    curr = curr.next;
                }
                curr.data = curr.data + 1;
                curr = curr.next;
                for (int i = 0; i < count; i++) {
                    curr.data = 0;
                    if (curr.next == null) break; // Avoid null pointer exception
                    curr = curr.next;
                }
                return head;
            }
        }
        return head;
    }
}
