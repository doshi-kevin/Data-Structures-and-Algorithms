class Solution {
    public int missingNumber(int[] nums) {
        int len=nums.length;
        int fin = (len*(len+1))/2;
        int total = 0;
        for(int i=0;i<nums.length;i++){
            total=total + nums[i];
        }
        return fin-total;
    }
}