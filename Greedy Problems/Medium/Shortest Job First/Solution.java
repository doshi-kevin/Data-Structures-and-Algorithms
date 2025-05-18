class Solution {
    static int solve(int bt[]) {
        // code here
        Arrays.sort(bt);
        int count=0;
        int sum=0;
        for(int i=0;i<bt.length-1;i++){
            count = count + (bt[i]*(bt.length-i-1));
        }
        return count/bt.length;
    }
}