class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        if (s.length() == 0) {
            return true;
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                st.push(ch);
            } else if (ch == ')') {
                if (st.empty() || st.peek() != '(') {
                    return false;
                }
                st.pop();
            } else if (ch == ']') {
                if (st.empty() || st.peek() != '[') {
                    return false;
                }
                st.pop();
            } else if (ch == '}') {
                if (st.empty() || st.peek() != '{') {
                    return false;
                }
                st.pop();
            }
        }
        return st.empty();
    }
}
