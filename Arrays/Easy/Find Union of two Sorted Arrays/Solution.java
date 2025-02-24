import java.util.ArrayList;

class Solution {
    // Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0, j = 0;

        while (i < a.length && j < b.length) {
            if (ans.isEmpty() || ans.get(ans.size() - 1) != Math.min(a[i], b[j])) {
                ans.add(Math.min(a[i], b[j]));
            }
            
            if (a[i] < b[j]) {
                i++;
            } else if (a[i] > b[j]) {
                j++;
            } else {
                i++;
                j++;
            }
        }

        while (i < a.length) {
            if (ans.isEmpty() || ans.get(ans.size() - 1) != a[i]) {
                ans.add(a[i]);
            }
            i++;
        }

        while (j < b.length) {
            if (ans.isEmpty() || ans.get(ans.size() - 1) != b[j]) {
                ans.add(b[j]);
            }
            j++;
        }

        return ans;
    }
}
