class Solution {
    public int[] getFloorAndCeil(int k, int[] arr) {
        int n = arr.length;
        Arrays.sort(arr); // Ensure array is sorted

        int low = 0, high = n - 1;
        int floor = -1, ceil = -1;
        int[] ans = new int[2];

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == k) {
                ans[0] = k;
                ans[1] = k;
                return ans;
            } else if (arr[mid] < k) {
                floor = arr[mid]; // Potential floor
                low = mid + 1;
            } else {
                ceil = arr[mid]; // Potential ceil
                high = mid - 1;
            }
        }

        ans[0] = floor;
        ans[1] = ceil;
        return ans;
    }
}