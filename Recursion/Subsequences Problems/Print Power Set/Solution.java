class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> outer  = new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num : nums){
            int n = outer.size();
            for(int j=0;j<n;j++){
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }
}