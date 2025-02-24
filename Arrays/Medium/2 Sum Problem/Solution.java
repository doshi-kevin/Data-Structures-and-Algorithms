class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map=new HashMap<>();
        int first, sec;
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                first=map.get(target-nums[i]);
                sec=i;
                return new int[]{first, sec};
            }
            map.put(nums[i],i);
        }
        return new int[]{0, 0};
    }
}