class Solution {

    // Function to find floor of k in sorted array arr
    // Returns index of floor element or -1 if it doesn't exist
    static int findFloor(int[] arr, int k) {
        int n = arr.length;

        // Edge case: If k is smaller than the smallest element
        if (arr[0] > k) {
            return -1;
        }

        int low = 0, high = n - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == k) {
                return mid; // Exact match found
            } else if (arr[mid] < k) {
                ans = mid;     // Potential floor found
                low = mid + 1; // Search in the right half
            } else {
                high = mid - 1; // Search in the left half
            }
        }

        return ans; // Index of largest element <= k, or -1 if no floor
    }
}