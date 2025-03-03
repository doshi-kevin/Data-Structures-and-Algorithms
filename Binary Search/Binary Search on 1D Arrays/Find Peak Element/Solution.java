class Solution {
    public int findPeakElement(int[] nums) {
        int start = 0, end = nums.length - 1;
        
        while (start < end) {
            int mid = start + (end - start) / 2;
            
            // If the next element is greater, move right
            if (nums[mid] < nums[mid + 1]) {
                start = mid + 1;
            } else {
                // Otherwise, move left (or return if it's a peak)
                end = mid;
            }
        }
        
        return start; // `start` will be at a peak element
    }
}
