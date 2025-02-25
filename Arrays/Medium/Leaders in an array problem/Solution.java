class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        ans.add(arr[arr.length-1]);
        for(int i=arr.length-1;i>=1;i--){
            if(arr[i]<=arr[i-1] && arr[i-1]>=ans.get(ans.size()-1)){
                ans.add(arr[i-1]);
            }
        }
        Collections.reverse(ans);
        return ans;
    }
}