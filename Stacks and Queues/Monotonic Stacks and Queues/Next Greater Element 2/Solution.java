import java.util.HashMap;
import java.util.Stack;

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        // Iterate through the array twice to handle the circular nature
        for (int i = 0; i < 2 * n; i++) {
            int num = nums[i % n];
            while (!stack.isEmpty() && nums[stack.peek()] < num) {
                map.put(stack.pop(), num);
            }
            if (i < n) {
                stack.push(i);
            }
        }

        // Populate the result array by checking the map
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = map.getOrDefault(i, -1);
        }

        return result;
    }
}
