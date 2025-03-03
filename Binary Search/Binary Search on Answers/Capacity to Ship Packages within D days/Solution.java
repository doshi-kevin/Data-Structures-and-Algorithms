class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max = 0, sum = 0;

        // Find the max element and total sum
        for (int num : weights) {
            max = Math.max(max, num);
            sum += num;
        }

        int low = max, high = sum;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int requiredDays = calculate(weights, mid);

            if (requiredDays <= days) {
                high = mid - 1; // Try reducing capacity
            } else {
                low = mid + 1; // Increase capacity
            }
        }
        return low; // The minimum valid capacity
    }

    private int calculate(int[] arr, int capacity) {
        int days = 1, sum = 0;

        for (int weight : arr) {
            sum += weight;
            if (sum > capacity) {
                days++;  // Need a new day
                sum = weight;  // Start new batch with current weight
            }
        }
        return days;
    }
}
