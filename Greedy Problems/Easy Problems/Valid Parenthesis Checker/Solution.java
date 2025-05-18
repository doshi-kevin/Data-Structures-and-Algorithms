class Solution {
    public boolean checkValidString(String s) {
        int low = 0, high = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                low++;
                high++;
            } else if (ch == ')') {
                low--;
                high--;
            } else { // ch == '*'
                low--;     // treat as ')'
                high++;    // treat as '('
            }
            if (high < 0) return false; // too many ')'
            low = Math.max(low, 0);     // can't have negative unmatched '('
        }
        return low == 0;
    }
}
