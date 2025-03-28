import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        if (head == null) return ans; // Handle empty list case
        
        // Finding tail of DLL
        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }

        Node temp = head;
        while (temp != null && tail != null && temp != tail && temp.prev != tail) {
            int sum = temp.data + tail.data;
            if (sum == target) {
                ans.add(new ArrayList<>(Arrays.asList(temp.data, tail.data)));
                temp = temp.next;
                tail = tail.prev;
            } else if (sum > target) {
                tail = tail.prev;
            } else {
                temp = temp.next;
            }
        }
        return ans;
    }
}
