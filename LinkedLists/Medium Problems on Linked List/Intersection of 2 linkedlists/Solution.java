public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }

        int count1 = 0, count2 = 0;
        ListNode temp1 = headA, temp2 = headB;

        // Count the lengths of both lists
        while (temp1 != null) {
            count1++;
            temp1 = temp1.next;
        }
        while (temp2 != null) {
            count2++;
            temp2 = temp2.next;
        }

        // Move the longer list ahead by the difference in lengths
        int diff = Math.abs(count1 - count2);
        ListNode tempa = headA, tempb = headB;

        if (count1 > count2) {
            while (diff-- > 0) {
                tempa = tempa.next;
            }
        } else {
            while (diff-- > 0) {
                tempb = tempb.next;
            }
        }

        // Traverse both lists together until an intersection is found
        while (tempa != null && tempb != null) {
            if (tempa == tempb) {  // Fix: Correct intersection check
                return tempa;
            }
            tempa = tempa.next;
            tempb = tempb.next;
        }

        return null;  // No intersection
    }
}
