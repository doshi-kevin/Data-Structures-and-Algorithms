class Solution {
    public int searchInsert(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        int ceil=0;
        if(target>nums[nums.length-1]){
            return nums.length;
        }
        if(target<nums[0]){
            return 0;
        }
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]>target){
                ceil=mid;
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return ceil;
    }
}