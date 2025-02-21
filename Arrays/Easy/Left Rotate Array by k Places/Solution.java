class Solution {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        k = k % len; // Ensure k is within the bounds of the array length
        
        // Reverse the entire array
        for (int i = 0; i < (len / 2); i++) {
            int temp = nums[i];
            nums[i] = nums[len - 1 - i];
            nums[len - 1 - i] = temp;
        }
        
        // Reverse the first k elements
        for (int i = 0; i < (k / 2); i++) {
            int temp = nums[i];
            nums[i] = nums[k - 1 - i];
            nums[k - 1 - i] = temp;
        }
        
        // Reverse the remaining len - k elements
        for (int i = 0; i < ((len - k) / 2); i++) {
            int temp = nums[k + i];
            nums[k + i] = nums[len - 1 - i];
            nums[len - 1 - i] = temp;
        }
    }
}
