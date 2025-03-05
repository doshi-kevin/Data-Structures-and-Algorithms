class Solution {
    public String reverseWords(String s) {
        int left = 0, right = s.length() - 1;

        // Remove leading and trailing spaces
        while (left <= right && s.charAt(left) == ' ') left++;
        while (right >= left && s.charAt(right) == ' ') right--;

        StringBuilder ans = new StringBuilder();
        StringBuilder word = new StringBuilder();

        while (left <= right) {
            char ch = s.charAt(left);

            if (ch != ' ') {
                word.append(ch); // Build the current word
            } else if (word.length() > 0) { // Space found, add word to result
                if (ans.length() > 0) {
                    ans.insert(0, ' '); // Insert space before the previous words
                }
                ans.insert(0, word);
                word.setLength(0); // Reset word builder
            }
            left++;
        }

        // Add the last word (if any)
        if (word.length() > 0) {
            if (ans.length() > 0) ans.insert(0, ' ');
            ans.insert(0, word);
        }

        return ans.toString();
    }
}
