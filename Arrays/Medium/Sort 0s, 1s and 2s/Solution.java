class Solution {
    public void sortColors(int[] nums) {
        int i=0;
        int curr=0;
        int j=nums.length-1;
        while(curr<=j){
            if(nums[curr]==2){
                int temp=nums[curr];
                nums[curr]=nums[j];
                nums[j]=temp;
                j--;
            }
            else if(nums[curr]==0){
                int temp=nums[curr];
                nums[curr]=nums[i];
                nums[i]=temp;
                i++;
                curr++;
            }
            else{
                curr++;
            }
        }
    }
}