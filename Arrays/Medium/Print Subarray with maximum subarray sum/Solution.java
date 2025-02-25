class Solution {
    // Function to find pair with maximum sum
    public int pairWithMaxSum(int arr[]) {
        // Your code goes here
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length-1;i++){
            sum=arr[i]+arr[i+1];
            max=Math.max(max, sum);
            sum=0;
        }
        return max;
    }
}