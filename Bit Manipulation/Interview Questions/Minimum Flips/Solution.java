class Solution {
    public int minBitFlips(int start, int goal) {
        int ans = start ^ goal;
        int count = 0;

        while (ans > 0) {
            if (ans % 2 == 1) count++; // Count 1s, not 0s
            ans = ans / 2;
        }

        return count;
    }
}
