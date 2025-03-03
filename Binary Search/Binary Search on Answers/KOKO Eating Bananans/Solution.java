class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;

        // Find the maximum pile size
        for (int pile : piles) {
            max = Math.max(max, pile);
        }

        int start = 1;
        int end = max;
        int result = max;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            long hours = calculate(piles, mid);  // Use long to prevent overflow

            if (hours <= h) { // If Koko can finish in h hours, try a smaller speed
                result = mid;
                end = mid - 1;
            } else { // If hours required is more than h, increase the eating speed
                start = mid + 1;
            }
        }

        return result;
    }

    private long calculate(int[] piles, int k) {
        long count = 0;  // Use long instead of int
        for (int pile : piles) {
            count += (pile + k - 1L) / k;  // Ensure division handles large values correctly
        }
        return count;
    }
}
