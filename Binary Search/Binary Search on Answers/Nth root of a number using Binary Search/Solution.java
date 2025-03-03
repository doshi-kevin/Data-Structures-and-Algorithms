class Solution {
    public int nthRoot(int n, int m) {
        int low = 1, high = m;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            long val = (long) Math.pow(mid, n); // Convert to long to avoid overflow
            
            if (val == m) return mid; // Found exact nth root
            else if (val < m) low = mid + 1; // Increase mid
            else high = mid - 1; // Decrease mid
        }
        
        return -1; // If no integer nth root found
    }
}