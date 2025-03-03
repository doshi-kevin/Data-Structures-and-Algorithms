class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if ((long) m * k > bloomDay.length) {  // Ensure multiplication doesn't overflow
            return -1;
        }
        
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        // Find min and max bloom days
        for (int day : bloomDay) {
            min = Math.min(min, day);
            max = Math.max(max, day);
        }

        int start = min, end = max;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (canMakeBouquets(bloomDay, mid, m, k)) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return start;  // The first valid day found by binary search
    }

    private boolean canMakeBouquets(int[] bloomDay, int mid, int m, int k) {
        int bouquetCount = 0, flowers = 0;

        for (int day : bloomDay) {
            if (day <= mid) {
                flowers++;
                if (flowers == k) {  // One bouquet is formed
                    bouquetCount++;
                    flowers = 0;  // Reset count for the next bouquet
                    if (bouquetCount == m) {
                        return true;
                    }
                }
            } else {
                flowers = 0;  // Reset count if sequence breaks
            }
        }

        return false;
    }
}