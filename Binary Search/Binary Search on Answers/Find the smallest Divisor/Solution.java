class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        // Find min and max bloom days
        for (int day : nums) {
            min = Math.min(min, day);
            max = Math.max(max, day);
        }
        int result = 0;
        int start = 1, end = max;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int ans = calculate(nums, mid, threshold);
            if (ans <= threshold) {
                end=mid-1;
            } else {
                start=mid+1;
            }
        }
        return start;
    }
    public int calculate(int[] arr, int mid, int th){
        int sum = 0;
        for(int i : arr){
            sum += (i+ mid - 1) / mid;
        }
        return sum;
    }
}