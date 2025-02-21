class Solution {
    public int getSecondLargest(int[] arr) {
        // Code Here
        int max = arr[0];
        int second=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                second=max;
                max=arr[i];
            }
            else if(arr[i]>second && arr[i]<max){
                second=arr[i];
            }
        }
        if(second==0){
            return -1;
        }
        return second;
    }
}