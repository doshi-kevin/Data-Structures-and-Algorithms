class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int[][] result = new int[intervals.length][2];
        int count = 0;
        result[0][0] = intervals[0][0];
        result[0][1] = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= result[count][1] ) {
                result[count][1] = Math.max(intervals[i][1], result[count][1]);
            } else {
                count++;
                result[count][0] = intervals[i][0];
                result[count][1] = intervals[i][1];
            }
        }
        return Arrays.copyOf(result, count + 1);

    }
}