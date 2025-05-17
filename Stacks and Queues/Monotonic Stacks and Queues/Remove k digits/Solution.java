class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < num.length(); i++) {
            char c = num.charAt(i);
            while (!st.isEmpty() && k > 0 && st.peek() > c) {
                st.pop();
                k--;
            }
            st.push(c);
        }

        // Remove remaining k digits from end
        while (k > 0 && !st.isEmpty()) {
            st.pop();
            k--;
        }

        // Build result from stack
        StringBuilder sb = new StringBuilder();
        for (char c : st) {
            sb.append(c);
        }

        // Remove leading zeros
        while (sb.length() > 0 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }

        // Edge case: empty result means 0
        return sb.length() == 0 ? "0" : sb.toString();
    }
}
