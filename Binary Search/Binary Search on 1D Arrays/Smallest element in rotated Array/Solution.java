class Solution {
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        int min=Integer.MAX_VALUE;
        if(nums[start]<nums[end]){
            return nums[start];
        }
        while(start<=end){
            int mid = (start+end)/2;
            min=Math.min(min, nums[mid]);
            if(nums[start]<=nums[mid]){
                min = Math.min(min, nums[start]);
                start=mid+1;
            }
            else if(nums[start]>=nums[mid]){
                min = Math.min(min, nums[end]);
                end=mid-1;
            }
        }
        return min;
    }
}