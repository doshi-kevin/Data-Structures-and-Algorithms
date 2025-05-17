class Solution {
    public int trap(int[] height) {
        int left = 0, right = height.length-1;
        int res = 0;
        int leftMax=0, rightMax = 0;
        while(left < right){
            leftMax = Math.max(height[left], leftMax);
            rightMax = Math.max(height[right], rightMax);
            if(leftMax <= rightMax){
                res = res + (leftMax - height[left]);
                left++;
            }else{
                res = res + (rightMax - height[right]);
                right--;
            }
        }
        return res;
    }
}